package by.tr.mod5;

import java.util.Scanner;

public class Array1 {
    public static void main (String []args)
    {
        int n,k,sum;
        n = askForArraySize();
        int a [] = new int [n];
        arrayInitialization(a);
        k = askForNumber();
        sum = sumOfMultipleElements(a,k);
        System.out.println("Сумма элементов кратных "+ k + " равна "+ sum);
    }
    public static int askForArraySize() {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        n = sc.nextInt();
        return n;
    }
    public static void arrayInitialization(int [] ar){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            System.out.print("a[" + i + "]=");
            ar[i] = sc.nextInt();
        }

    }
    public static int askForNumber(){
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число,кратность которому мы ищем");
        n = sc.nextInt();
        return n;
    }
    public static int sumOfMultipleElements (int [] ar,int k){
        int sum = 0;
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] % k == 0)
                sum +=ar[i];
        }
        return sum;
    }
}
