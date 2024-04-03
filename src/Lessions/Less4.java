package Lessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Less4 {
    public static void main(String[] args){
        Random r = new Random();
        List<Integer> mass = new ArrayList<>();
        System.out.println("\n"+ "массив до"+"\n");
        for (int  i =0;i<10; i++){
            mass.add(r.nextInt(1000));
            System.out.println(mass.get(i));
        }

        List<Integer> result = squerList(mass);
        System.out.println("\n"+"Квадраты"+"\n");
        for (int i =0;i<10;i++){
            System.out.println(result.get(i));
        }
    }
    public static List<Integer> squerList(List<Integer> mass){
        return mass.stream().map(x->x*x).collect(Collectors.toList());
    }
}
