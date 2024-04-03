package Lessions;

import java.util.*;
import java.util.stream.Collectors;

public class Less9 {
    public static void main(String[] args){
        String string = "Н1ажмите функцию, кото*рая принимает на Вход списоGк строк и возвращает новый Список, содержащий только те строки, которые Начинаются с Заглавной";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n"+ "Строка после сплитования"+"\n");
        for (String e: strings){
            System.out.println(e);
        }

        List<String> res = filterWords(strings);
        System.out.println("\n"+"Только буквы"+"\n");
        for (String e: res){
            System.out.println(e);
        }

    }
    public static List<String> filterWords(List<String> mass){
        return mass.stream().filter(x->x.matches("[A-Za-zА-Яа-я]{1,}")).collect(Collectors.toList());
    }
}
