package by.tr.mod5;

import java.util.Scanner;

public class Array3 {
    public static void main (String [] args)
    {
        int n = Array1.askForArraySize();
        double [] ar = new double[n];
        arrayInitializationDouble(ar);
        boolean flag;
        flag = checkIncreasingArray(ar);
        if (flag==true)
            System.out.println("Последовательность элементов массива возрастающая");
        else System.out.println("Последовательность элементов массива не является возрастающей");
    }
    public static boolean checkIncreasingArray(double [] array)
    {
        for (int i = 0; i<array.length-1; i++)
        {
            if (array[i] > array[i+1])
                return false;
        }
        return true;
    }
    public static void arrayInitializationDouble(double [] ar){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            System.out.print("a[" + i + "]=");
            ar[i] = sc.nextDouble();
        }

    }
}
