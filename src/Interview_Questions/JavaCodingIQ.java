package Interview_Questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class JavaCodingIQ {
    public static void main(String[] args) {

        //Find the second highest and second lowest element in an array

        List<Integer> list = Arrays.asList(30, 20, 50, 10, 40);
        Integer secondLowest = list.stream().sorted().skip(1).findFirst().get();
        System.out.println(secondLowest);

        Integer secondHighest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);
        System.out.println("----------------------------------------------------------------------------");

        // Find duplicate characters
        String str = "tushar sinha";
        List<Map.Entry<String, Long>> duplicate = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .collect(Collectors.toList());
        System.out.println(duplicate);
        System.out.println("----------------------------------------------------------------------------");

        // Find unique characters
        List<Map.Entry<String,Long>> unique = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()==1)
                .collect(Collectors.toList());
        System.out.println(unique);
        System.out.println("----------------------------------------------------------------------------");

        // Find first non-repeating characters
        Map.Entry<String, Long> findFirstNonRepeating = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst()
                .get();
        System.out.println(findFirstNonRepeating);
        System.out.println("----------------------------------------------------------------------------");

        //Find first repeating characters
        Map.Entry<String, Long> firstRepeating = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).findFirst().get();

        System.out.println(firstRepeating);
        System.out.println("------------------------------------------------------------------------------");

        //Find all duplicate elements in an ArrayList Using Stream Api
        List<Integer> lst = Arrays.asList(10, 20, 20, 30, 40, 50, 10);
        Set<Integer> duplicates = lst.stream().filter(x -> Collections.frequency(lst, x) > 1).collect(Collectors.toSet());
        System.out.println(duplicates);
        System.out.println("------------------------------------------------------------------------------");

        Set<Integer> hashSet = new HashSet();
        Set<Integer> duplicates2 = lst.stream().filter(x -> !hashSet.add(x)).collect(Collectors.toSet());
        System.out.println(duplicates2);
        System.out.println("------------------------------------------------------------------------------");

        //Find the sum of all elements in an ArrayList using stream api
        List<Integer> lst2 = Arrays.asList(5, 10, 15, 20, 25);
        int sumOfElements = lst2.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumOfElements);
        System.out.println("------------------------------------------------------------------------------");

        Integer sumOfAll = lst2.stream().reduce((a, b) -> a + b).get();
        System.out.println(sumOfAll);
        System.out.println("------------------------------------------------------------------------------");

        //Find the Average of All Elements in an ArrayList Using Stream Api
        List<Integer> lst3 = Arrays.asList(5,10,15,20,25);
        double averageValue = lst3.stream().mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.println(averageValue);
        System.out.println("------------------------------------------------------------------------------");

        //Find the All Even numbers and odd Numbers in an ArrayList using Stream Api

        List<Integer> lst4 = Arrays.asList(5, 12, 8, 3, 7);
        List<Integer> evenNumbers = lst4.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("even numbers are "+evenNumbers);

        List<Integer> oddNumbers  = lst4.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println("odd numbers are "+oddNumbers);
        System.out.println("------------------------------------------------------------------------------");

        //Find All Numbers starting with the digit 2 in an ArrayList Using Stream Api
        List<Integer> lst5 = Arrays.asList(20, 13, 23, 45, 27, 50);
        List<Integer> result = lst5.stream().map(String::valueOf)
                .filter(x -> x.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(result);
        System.out.println("------------------------------------------------------------------------------");

        //Find the Maximum and Minimum element in an List using stream api
        List<Integer> list5 = Arrays.asList(7, 3, 9, 1, 4);
        Integer maxElement = list5.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("maximum element is "+maxElement);

        Integer minElement = list5.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("minimum element is "+minElement);
        System.out.println("------------------------------------------------------------------------------");

        //Sort Strings in Ascending Order using stream api
        List<String> lst6 = Arrays.asList("bob","tony","charlie","alice");
        List<String> ascendingOrder = lst6.stream().sorted().collect(Collectors.toList());
        System.out.println("in ascending order "+ascendingOrder);

        List<String> decendingOrder = lst6.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("in decending order "+decendingOrder);
        System.out.println("------------------------------------------------------------------------------");

        //skip the First 3 elements and retrieve the remaining 5 elements in arrayList using stream api
        List<Integer> lst7 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
        List<Integer> remainigElements = lst7.stream().skip(3).limit(5).collect(Collectors.toList());
        System.out.println(remainigElements);
        System.out.println("------------------------------------------------------------------------------");

        //Count the Number of Elements in an ArrayList Using Stream Api
        List<Integer> lst8 = Arrays.asList(5,14,12,8,10,15,20);
        long total = lst8.stream().count();
        System.out.println(total);
        System.out.println("------------------------------------------------------------------------------");

        //Find the Longest String in an ArrayList using StreamApi
        List<String> strlst = Arrays.asList("java", "springboot", "microservice", "hibernate");
        String longest = strlst.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(longest);
        System.out.println("------------------------------------------------------------------------------");

        // Check if two strings are anagrams or not using stream api
        String str1 = "silent";
        String str2 = "listen";
        String sortedOrder = Arrays.stream(str1.split("")).sorted().collect(Collectors.joining(""));
        String sortedOrder2 = Arrays.stream(str2.split("")).sorted().collect(Collectors.joining(""));

        if (sortedOrder.equals(sortedOrder2)){
            System.out.println("Strings are anagrams");
        }else{
            System.out.println("String are not anagrams");
        }

    }
}