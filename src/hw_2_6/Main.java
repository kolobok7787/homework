package hw_2_6;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        System.out.println("Задание 1");
        printOddDigits(nums); //Задание 1
        System.out.println("Задание 2");
        printOddDigitsInAscendingOrder(nums); //Задание 2
        System.out.println("Задание 3");
        printUniqueWords(strings); //Задание 3
        System.out.println("Задание 4");
        printCountUniqueWords(strings); //Задание 4
    }


    public static void printOddDigits(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void printOddDigitsInAscendingOrder(List<Integer> nums) {
        Collections.sort(nums);
        Integer prev = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num % 2 == 0 && num != prev) {
                System.out.println(num);
                prev = num;
            }
        }
    }

    public static void printUniqueWords(List<String> strings){
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
    }

    public static void printCountUniqueWords(List<String> strings) {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(strings.size() - uniqueWords.size());
    }
}
