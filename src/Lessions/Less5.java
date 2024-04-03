package Lessions;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Less5 {
    public static void main(String[]  args){
        String string = "Нажмите функцию, которая принимает на Вход список строк и возвращает новый Список, содержащий только те строки, которые Начинаются с Заглавной";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n"+ "Строка после сплитования"+"\n");
        for (String e: strings){
            System.out.println(e);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово для фильтрации");
        String word = scan.nextLine();
        List<String> after = filterString(strings, word);

        System.out.println("\n"+"After"+"\n");
        for (String e: after){
            System.out.println(e);
        }
    }
    public static List<String> filterString(List<String> args, String string){
        return args.stream().filter(x-> x.equals(string)).collect(Collectors.toList());
    }
}
