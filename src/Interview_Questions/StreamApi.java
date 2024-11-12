package Interview_Questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Collections.max;

public class StreamApi {
    public static void main(String[] args) {
//        List<Integer> age = Arrays.asList(12, 43, 32, 54, 24);
//        OptionalDouble average = age.stream().mapToInt(Integer::intValue).average();
//        System.out.println(average);
//----------------------------------------------------------------------------------------------------------------------
        // Count the no. of occurrence of words in given string using java 8 (1st)
//        String str = "welcome to code decode and code decode welcome you";
//        List<String> splitedString = Arrays.asList(str.split(" "));
//        Map<String, Long> result = splitedString.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(result);
//----------------------------------------------------------------------------------------------------------------------
        // Find the Duplicate elements in a given integers list in java using Stream functions? (2nd)
//        List<Integer> val = Arrays.asList(10,28,87,10,20,76,28,80);
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> duplicate = val.stream().filter(x -> !set.add(x)).collect(Collectors.toSet());
//        System.out.println(duplicate);
//----------------------------------------------------------------------------------------------------------------------
        // write a program to multiply 2 no.'s using functional interface (3rd)
//        Finterface total = ((a, b) -> a*b);
//        System.out.println(total.multiply(5,6));
//----------------------------------------------------------------------------------------------------------------------
        // 1.Write a Java program to calculate the average of a list of integers using streams.
//        List<Integer>  list = Arrays.asList(12,34,53,67,14,62,99);
//        OptionalDouble average = list.stream().mapToInt(x -> x).average();
//        System.out.println(average);
//----------------------------------------------------------------------------------------------------------------------
        // 2.Write a Java program to convert a list of strings to uppercase or lowercase using streams.
//            List<String> list = Arrays.asList("tushar", "sinha");
//            List<String> result = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//            System.out.println(result);

//----------------------------------------------------------------------------------------------------------------------
//     // 3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
//        List<Integer> list = Arrays.asList(12, 45, 24, 64, 89, 100, 35, 27, 84);
//        int sumEven = list.stream().filter(x -> x % 2 == 0).mapToInt(x ->x).sum();
//        System.out.println("sum of even no. is = " +sumEven);
//        int sumOdd = list.stream().filter(x -> x % 2 != 0).mapToInt(x -> x).sum();
//        System.out.println("sum of odd no. is = " +sumOdd);
//----------------------------------------------------------------------------------------------------------------------

        // 4.Write a Java program to remove all duplicate elements from a list using streams.
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 1, 5, 8, 9);
//        Set<Integer> uniqueElements = list.stream().distinct().collect(Collectors.toSet());
//        System.out.println(uniqueElements);
//        -------------------------------------------------------------------------------------
        // Set<Integer> s = new HashSet<>(); 2nd Approach
//          List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 1, 5, 8, 9);
//          Set<Integer> unique = list.stream().filter(x ->!s.add(x)).collect(Collectors.toSet());
//          System.out.println(unique);
//----------------------------------------------------------------------------------------------------------------------


        // 5.Write a Java program to count the number of strings in a list that start with a specific letter using streams.
//            List<String> str = Arrays.asList("tushar", "sinha", "tum", "tommato", "hello");
//            long noOfWorlds = str.stream().filter(x -> x.startsWith("t")).count();
//            System.out.println(noOfWorlds);

//----------------------------------------------------------------------------------------------------------------------

        // 6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
//        List<String> str = Arrays.asList("hello", "tera", "bhai", "seedhe", "maut", "coming", "in", "banglore");
//        List<String> ascending = str.stream().sorted().collect(Collectors.toList());
//        List<String> descending = str.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
//        System.out.println("ascending:"+ascending);
//        System.out.println("descending:"+descending);

//----------------------------------------------------------------------------------------------------------------------

        // 7. Write a Java program to find the maximum and minimum values in a list of integers using streams.
//        List<Integer> numbers = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
//        Integer maximum = numbers.stream().max(Integer::compareTo).get();
//        Integer minimum = numbers.stream().min(Integer::compareTo).get();
//        System.out.println("maximum:"+maximum);
//        System.out.println("minimum:"+minimum);

//----------------------------------------------------------------------------------------------------------------------

        // 8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.
//        List<Integer> list = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
//        Integer secondSmallest = list.stream().sorted().skip(1).findFirst().get();
//        System.out.println("secondSmallest:"+secondSmallest);
//        Integer secondLargest = list.stream().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst().get();
//        System.out.println("secondLargest:"+secondLargest);

//----------------------------------------------------------------------------------------------------------------------
        // 9.  Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
//        List<Integer> result = numbers.stream().filter(x -> x.toString().startsWith("1")).collect(Collectors.toList());
//        System.out.println("starting with 1:"+result);

//----------------------------------------------------------------------------------------------------------------------
        // 10. Given a list of integers, find the total number of elements present in the list using Stream functions?
//        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
//        long total = list.stream().count();
//        System.out.println(total);

//----------------------------------------------------------------------------------------------------------------------
        // 11. Given a String, find the first non-repeated character in it using Stream functions?
//        String str = "Java articles are Awesome";
//        Character non_repeated_charater = str.chars().
//                                              mapToObj(c -> (char) c).
//                                              filter(c -> c != ' ').
//                                              filter(c -> str.indexOf(c) == str.lastIndexOf(c)).
//                                              findFirst().
//                                              get();
//        System.out.println(non_repeated_charater);

//----------------------------------------------------------------------------------------------------------------------

        // 12. Java 8 program to perform cube on list elements and filter numbers greater than 50.
//        List<Integer> list = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
//        list.stream().map(n->n*n*n).filter(n->n>50).collect(Collectors.toList()).forEach(System.out::println);
//----------------------------------------------------------------------------------------------------------------------

        // write a method to find the sum of all even numbers in a list using java 8
//        List<Integer> list = Arrays.asList(2,3,4,5);
//        public int sumOfAllEvenNumbers(List<Integer> list){
//        int sum = list.stream().mapToInt(Integer::intValue).filter(a -> (a % 2) == 0).sum();
//        System.out.println(sum);
//        return sum;
//        }
//----------------------------------------------------------------------------------------------------------------------
       //
//        String str = "Big black bug bit a big black dog on his big nose";
//        Map<String, Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
//        System.out.println((map));


    }
}
