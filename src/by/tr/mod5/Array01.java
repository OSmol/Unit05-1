package by.tr.mod5;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        double[] ar = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            System.out.print("a[" + i + "]=");
            ar[i] = sc.nextDouble();
        }
        double max, min;
        int index = 0;
        max = ar[0];
        for (int i = 0; i < ar.length; i++)
        {
            if (ar [i] > max)
                max = ar[i];
        }
        System.out.println("Максимальное значение в массиве = "+ max);
        min = ar[0];
        for (int i = 0; i < ar.length; i++)
        {
            if (ar [i] < min)
            {
                min = ar[i];
                index = i;
            }
        }
        System.out.println("Минимальное значение в массиве = "+ min+ " под индексом "+ index);
    }
}
