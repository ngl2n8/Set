//stroka i nam nushno i nushno vivsti vse unikalnie slova

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.in;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Введите строку:");

        String s = scanner.nextLine();
        Set<String> zadanie = new TreeSet<>();
        String[] words = s.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                zadanie.add(word.toLowerCase());
            }
        }

        System.out.println("Уникальные слова: " + zadanie);
    }
}