package vn.codegym.model;

public class AttachService {
    private String attach_service_id;
    private String attach_service_name;
    private String attach_service_cost;
    private String attach_service_unit;
    private String attach_service_status;

    public AttachService() {
    }

    public AttachService(String attach_service_id, String attach_service_name, String attach_service_cost,
                         String attach_service_unit, String attach_service_status) {
        this.attach_service_id = attach_service_id;
        this.attach_service_name = attach_service_name;
        this.attach_service_cost = attach_service_cost;
        this.attach_service_unit = attach_service_unit;
        this.attach_service_status = attach_service_status;
    }

    public String getAttach_service_id() {
        return attach_service_id;
    }

    public void setAttach_service_id(String attach_service_id) {
        this.attach_service_id = attach_service_id;
    }

    public String getAttach_service_name() {
        return attach_service_name;
    }

    public void setAttach_service_name(String attach_service_name) {
        this.attach_service_name = attach_service_name;
    }

    public String getAttach_service_cost() {
        return attach_service_cost;
    }

    public void setAttach_service_cost(String attach_service_cost) {
        this.attach_service_cost = attach_service_cost;
    }

    public String getAttach_service_unit() {
        return attach_service_unit;
    }

    public void setAttach_service_unit(String attach_service_unit) {
        this.attach_service_unit = attach_service_unit;
    }

    public String getAttach_service_status() {
        return attach_service_status;
    }

    public void setAttach_service_status(String attach_service_status) {
        this.attach_service_status = attach_service_status;
    }
}
