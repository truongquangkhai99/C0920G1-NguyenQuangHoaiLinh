package case_study.vi_du_ly_thuyet;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {2, 7, 8, 9, 1, -5};

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(a));

//        Arrays.sort();
    }
}
