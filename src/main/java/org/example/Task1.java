//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может
// иметь несколько телефонов.

package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Иванов", List.of("+7(999)9999999", "+7(999)8888888", "+7(999)7777777"));
        phoneBook.put("Петров", List.of("+7(999)5456789", "+7(999)2344323"));
        phoneBook.put("Сидоров",List.of("+7(555)3456776"));

        System.out.println(phoneBook);
    }
}
