package com.codegym.controllers;

import com.codegym.entity.Customer;
import com.codegym.entity.Province;
import com.codegym.service.CustomerService;
import com.codegym.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message", "New customer created successfully");
        return modelAndView;
    }

//    @GetMapping({"", "/customers"})
//    public ModelAndView listCustomers(){
//        Iterable<Customer> customers = customerService.findAll();
//        ModelAndView modelAndView = new ModelAndView("customer/list");
//        modelAndView.addObject("customers", customers);
//        return modelAndView;
//    }

//    @GetMapping({"", "/customers"})
//    public ModelAndView listCustomers(Pageable pageable){
//        Page<Customer> customers = customerService.findAll(pageable);
//        ModelAndView modelAndView = new ModelAndView("/customer/list");
//        modelAndView.addObject("customers", customers);
//        return modelAndView;
//    }

    @GetMapping({"", "/customers"})
    public ModelAndView listCustomers(@RequestParam("s") Optional<String> s, Pageable pageable) throws Exception {
        if (true) throw new Exception("a dummy exception");
        Page<Customer> customers;
        if(s.isPresent()){
            customers = customerService.findAllByFirstNameContaining(s.get(), pageable);
        } else {
            customers = customerService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) throws Exception {
        Customer customer = customerService.findById(id);
        if(customer != null) {
            ModelAndView modelAndView = new ModelAndView("customer/edit");
            modelAndView.addObject("customer", customer);
            return modelAndView;

        }else {
            return new ModelAndView("edit");
        }
    }

    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) throws Exception {
        Customer customer = customerService.findById(id);
        if(customer != null) {
            ModelAndView modelAndView = new ModelAndView("customer/delete");
            modelAndView.addObject("customer", customer);
            return modelAndView;

        }else {
            return new ModelAndView("customer/delete");
        }
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer){
        customerService.remove(customer.getId());
        return "redirect:customers";
    }
}