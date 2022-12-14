//Пусть дан список сотрудников: Иван Иванов (и остальные, полный текст дз будет на платформе)
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();

        lst.add("Иванов");
        lst.add("Иванов");
        lst.add("Петров");
        lst.add("Петров");
        lst.add("Петров");
        lst.add("Сидоров");
        lst.add("Сидоров");
        lst.add("Сидоров");
        lst.add("Сидоров");

        Map<String, Integer> mp = new HashMap<>();

        for (String string : lst) {
            if(mp.keySet().contains(string)) {
                mp.put(string, mp.get(string) + 1);
            } else {
                mp.put(string, 1);
            }
        }

        System.out.println(mp);
    }
}