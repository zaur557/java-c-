package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class exampes {

    public static void main(String[] args) {
        int some[] = new int[4];

        ArrayList<Integer> some_dyn = new ArrayList<>(5);
        some_dyn.add(55);
        some_dyn.add(5);
        some_dyn.add(6);
        some_dyn.add(7);
        some_dyn.add(8);
        some_dyn.add(456);

        some_dyn.remove(1);          //remove() - удаление элемента из массива по его индексу;
        //some_dyn.clear();                  //clear() - очистка всего массива;
        for (Integer  x : some_dyn) {
            System.out.println(x);
        }

        LinkedList<String> names = new LinkedList<>();
        names.add("jonh");
        names.add("Andi");
        names.add("Dias");

        names.add(1, "Alex");          //add() - добавление элемента в конец массива;
        //names.clear();                  //clear() - очистка всего массива;
        for (String  x : names) {
            System.out.println(x);
        }
    }
}
//add() - добавление элемента в конец массива;
//remove() - удаление элемента из массива по его индексу;
//clear() - очистка всего массива;
//size() - получение размера массива (количество элементов);
//addFirst() - добавление элемента в начало массива;
//addLast() - добавление элемента в конец;
//clone() - выполняет клонирование массива;
//get() - возвращает элемент по индексу;
//getFirst() - возвращает первый элемент в массиве;
//getLast() - возвращает последний элемент в массиве;
//set(index, element) - меняет значение элемента по индексу.