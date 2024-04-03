package Lessions;

import java.util.List;
import java.util.stream.Collectors;

public class Less3 {
    public static void main(String[] args){
        String string = "Нажмите функцию, которая принимает на Вход список строк и возвращает новый Список, содержащий только те строки, которые Начинаются с Заглавной";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n"+ "Строка после сплитования"+"\n");
        for (String e: strings){
            System.out.println(e);
        }

        List<String> after = filterCapital(strings);

        System.out.println("\n"+"After"+"\n");
        for (String e: after){
            System.out.println(e);
        }
    }
    public static List<String> filterCapital(List<String> args){
        return args.stream().filter(s->Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
    }
}
