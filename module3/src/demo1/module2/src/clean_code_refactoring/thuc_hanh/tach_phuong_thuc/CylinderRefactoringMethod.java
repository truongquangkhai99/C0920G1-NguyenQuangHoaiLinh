package clean_code_refactoring.thuc_hanh.tach_phuong_thuc;

public class CylinderRefactoringMethod {
    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
//        double volume = perimeter * height + 2 * baseArea;
//        return volume;
        return perimeter * height + 2 * baseArea;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}
