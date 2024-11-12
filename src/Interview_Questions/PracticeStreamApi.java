package Interview_Questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeStreamApi {
    public static void main(String[] args) {
        // 1.Given a list of integers, filter out the even numbers,square the remaining numbers,
        //  and return the result as a list.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        List<Integer> squaredNo = numbers.stream().filter(x -> (x % 2 == 0)).map(x -> x * x).collect(Collectors.toList());
//        System.out.println(squaredNo);
//----------------------------------------------------------------------------------------------------------------------------
        // 2.Given a list of strings, convert each string to uppercase and collect the results into a new list.
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        List<String> uppercase = words.stream().map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(uppercase);
//----------------------------------------------------------------------------------------------------------------------------
        // 3. Find the sum of squares of all odd numbers in a given list using Stream API.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        int sumOfOddNumbers = numbers.stream().filter(x->x%2!=0).map(x->x*x).mapToInt(Integer::intValue).sum();
//---------------------------------------2nd approach-------------------------------------------------------------------
//        int sumOfOddNumbers = numbers.stream().filter(x->x%2!=0).map(x->x*x).reduce((a, b)->a+b).get();
//        System.out.println(sumOfOddNumbers);
//----------------------------------------------------------------------------------------------------------------------
        // 4. Given a list of employees, group them by their department using Stream API.
//        List<Employee> employees = Arrays.asList(
//                new Employee("John", "IT", 50000),
//                new Employee("Jane", "HR", 60000),
//                new Employee("Jack", "IT", 55000),
//                new Employee("Jill", "HR", 45000)
//        );
//
//        Map<String, List<Employee>> grouped = employees.stream().collect(Collectors.groupingBy(x -> x.getDepartment()));
//        System.out.println(grouped);
//----------------------------------------------------------------------------------------------------------------------
        // 5. Given a list of strings, find the first string that starts with the letter "B" (case insensitive).
//        List<String> words = Arrays.asList("apple", "banana", "cherry", "Blueberry", "avocado");
//        String startWithB = words.stream().map(String::toUpperCase).filter(x -> x.startsWith("B")).findFirst().get();
//        System.out.println(startWithB);

// ------------------------------------------------------------------------------------------------------------

        // 6. Given a list of lists of integers, flatten them into a single list.
//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5),
//                Arrays.asList(6, 7, 8, 9)
//        );
//        List<Integer> singleList = listOfLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
//        System.out.println(singleList);
//----------------------------------------------------------------------------------------------------------------------

        // 7.Given a list of employees, sort them by their salary in descending order using Stream API.
//        List<Employee> employees = Arrays.asList(
//                new Employee("John", "IT", 50000),
//                new Employee("Jane", "HR", 60000),
//                new Employee("Jack", "IT", 55000)
//        );
//        -------------------------------------------------------1st way to sort in descending-------------------------
//        List<Employee> sorted = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
//        System.out.println(sorted);
//        -------------------------------------------------------2nd way to sort in descending-------------------------
//        List<Employee> customSorted = employees.stream()
//                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
//                .collect(Collectors.toList());

//----------------------------------------------------------------------------------------------------------------------
        // 8. Given a list of integers, generate statistical data such as sum, average, min, max, and count.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
//        System.out.println("sum of list is:" +stats.getSum());
//        System.out.println("minimum of list is:" +stats.getMin());
//        System.out.println("maximum of list is:" +stats.getMax());
//        System.out.println("average of list is:" +stats.getAverage());
//        System.out.println("count of list is:" +stats.getCount());

//----------------------------------------------------------------------------------------------------------------------
        // 9. Given a list of employees, find the employee with the highest salary.
//        List<Employee> employees = Arrays.asList(
//                new Employee("John", "IT", 50000),
//                new Employee("Jane", "HR", 60000),
//                new Employee("Jack", "IT", 55000)
//        );
//        Employee maxSalary = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
//        System.out.println(maxSalary);

//----------------------------------------------------------------------------------------------------------------------

        // 10. Given a list of strings, join them into a single string, separated by commas.
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        String joinedWords = words.stream().collect(Collectors.joining(", "));
//        System.out.println(joinedWords);

//----------------------------------------------------------------------------------------------------------------------

        // 11.Given a list of integers, skip the first 3 elements and limit the result to the next 2 elements.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        List<Integer> result = numbers.stream().skip(3).limit(2).collect(Collectors.toList());
//        System.out.println(result);

//----------------------------------------------------------------------------------------------------------------------
        // 12. Find and print the count of strings that have length greater than 5.
//        List<String> fruits = Arrays.asList("apple", "banana", "grape", "watermelon", "kiwi");
//        fruits.stream().filter(x -> x.length() > 5).forEach(System.out::println);
//        long count = fruits.stream().filter(x -> x.length() > 5).count();
//        System.out.println(count);

//----------------------------------------------------------------------------------------------------------------------
        //1. Given a sentence, find and print the frequency of each word.
//        String sentence = "Java is a programming language. Java is versatile.";
//        Map<String, Long> frequency = Arrays.sList(sentence.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(frequency);
//----------------------------------------------------------------------------------------------------------------------
        //2. Given a list of integers, find out all the numbers starting with 1.

//        List<String> startWith = Arrays.asList(12, 13, 18, 21, 90, 11).stream().map(x -> x.toString()).filter(x -> x.startsWith("1")).collect(Collectors.toList());
//        System.out.println(startWith);
//----------------------------------------------------------------------------------------------------------------------

        //3. Given a list of names, group them by their first letter, and then count the number of names in each group.

//        String[] names = {"Alice", "Bob", "Charlie", "Amy", "Bill", "Anna"};
//        Map<Character, Long> group = Arrays.stream(names).collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
//        System.out.println(group);
//----------------------------------------------------------------------------------------------------------------------
        //4. Find and print duplicate numbers in an array if it contains multiple duplicates?

//        int[] arr = {2,4,2,3,1,5, 5,78,3,1,5};
//        Set<Integer> s = new HashSet<>();
//        List<Integer> duplicate = Arrays.stream(arr).mapToObj(Integer::valueOf).filter(x->!s.add(x)).collect(Collectors.toList());
//        System.out.println(duplicate);
//----------------------------------------------------------------------------------------------------------------------
        //6. Given a list of words, filter and print the palindromes

//        List<String> stringList = Arrays.asList("level", "hello", "radar", "world", "deed");

    }
}
