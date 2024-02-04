package io.sriki;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        //ERROR : Class cast Exception
//        List<Object> objectList = integerList;
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<String> stringList = new ArrayList<>();

        stringList.add("String 1");
        stringList.add("String 2");
        stringList.add("String 3");


        printList(integerList);
        printList(stringList);

        printList2(integerList);
        printList2(stringList);
    }

    public static <E> void printList(List<E> list){
        list.forEach(System.out::println);
    }

    public static void printList2(List<?> list){
        list.forEach(System.out::println);
    }
}