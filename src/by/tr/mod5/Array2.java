package by.tr.mod5;

public class Array2 {
    public static void main (String[]args) {
        int n;
        n = Array1.askForArraySize();
        int ar[] = new int[n];
        Array1.arrayInitialization(ar);
        int ar2[] = getArrayFrom0Elements(ar);
        System.out.println("Массив из номеров нулевых элементов");
        for (int i = 0; i < ar2.length; i++)
            System.out.println("ar2[" +i+ "] = "+ ar2[i]);

    }
    public static int [] getArrayFrom0Elements(int []ar)
    {
        int num = 0;
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i]==0)
                num++;
        }
        int ar2[] = new int[num];
        int j = 0;
        for(int i = 0; i <ar.length; i++)
        {
            if (ar[i]==0)
            {
                ar2[j] = i;
                j++;
            }
        }
        return ar2;
    }
}
