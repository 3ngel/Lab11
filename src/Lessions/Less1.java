package Lessions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Less1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scan.nextInt();

        int mass[]= new int[size];

        Random r = new Random();

        for (int  i =0;i<size; i++){
            mass[i]= r.nextInt();
        }

        System.out.println("Первоначальный массив");
        System.out.println(Arrays.toString(mass));

        int[]massRes = filterElements(mass);

        System.out.println("Чёткий массив");
        System.out.println(Arrays.toString(massRes));
    }
    public static int[] filterElements(int[] mass){
        return Arrays.stream(mass).filter(x->x%2==0).toArray();
    }
}
