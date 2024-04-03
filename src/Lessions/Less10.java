package Lessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Less10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scan.nextInt();

        List<Integer> mass= new ArrayList<>();

        Random r = new Random();
        System.out.println("Первоначальный массив");
        for (int  i =0;i<size; i++){
            mass.add(r.nextInt(1000));
            System.out.println(mass.get(i));
        }

        System.out.println("Введите число");
        int a = scan.nextInt();

        List<Integer> massRes = filterBigNimber(mass, a);

        System.out.println("Чёткий массив");
        for (int e: massRes){
            System.out.println(e);
        }
    }
    public static List<Integer> filterBigNimber(List<Integer> mass, int lenght){
        return mass.stream().filter(x->x<lenght).collect(Collectors.toList());
    }
}
