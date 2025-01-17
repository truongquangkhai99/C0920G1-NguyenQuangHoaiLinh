package _07_abstract_class_va_interface.thuc_hanh.InterfaceComparator;

import _06_ke_thua.thuc_hanh.HeCacDoiTuongHinhHoc.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {


    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}