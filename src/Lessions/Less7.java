package Lessions;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Less7 {
    public static void main(String[] args){
        String string = "Нажмите функцию, которая принимает на Вход список строк и возвращает новый Список, содержащий только те строки, которые Начинаются с Заглавной";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n"+ "Строка после сплитования"+"\n");
        for (String e: strings){
            System.out.println(e);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину слова");
        int word = scan.nextInt();
        List<String> res = filterLenght(strings, word);

        System.out.println("\n"+"Фильтрация по длине"+"\n");
        for(String e: res){
            System.out.println(e);
        }

    }
    public static List<String> filterLenght (List<String> args, int lenght){
        return args.stream().filter(x->x.length()>lenght).collect(Collectors.toList());
    }
}
