package Lessions;

import java.util.*;
import java.util.stream.Collectors;

public class Less6 {
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

        List<Integer> massRes = filterElements(mass, a);

        System.out.println("Чёткий массив");
        for (int e: massRes){
            System.out.println(e);
        }
    }
    public static List<Integer> filterElements(List<Integer> mass, int number){
        return mass.stream().filter(x->x%number==0).collect(Collectors.toList());
    }
}
