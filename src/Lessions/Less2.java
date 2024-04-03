package Lessions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Less2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scan.nextInt();

        int[] mass= new int[size];
        int[] mass2 = new int[size];

        Random r = new Random();

        for (int  i =0;i<size; i++){
            mass[i]= r.nextInt(10);
            mass2[i]=r.nextInt(10);
        }
        System.out.println("Первоначальный массив1");
        System.out.println(Arrays.toString(mass));
        System.out.println("Первоначальный массив2");
        System.out.println(Arrays.toString(mass2));

        int[] massRes = findElement(mass, mass2);

        System.out.println("Чёткий массив");
        System.out.println(Arrays.toString(massRes));
    }
    public static int[] findElement(int[] ar1, int[] ar2){
        return Arrays.stream(ar1).filter(x->Arrays.stream(ar2).anyMatch(y->y==x)).toArray();
    }
}
