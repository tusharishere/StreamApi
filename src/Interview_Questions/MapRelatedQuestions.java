package Interview_Questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapRelatedQuestions {
    public static void main(String[] args) {
        // Find occurrences of characters
        String str= "tushar sinha";
        String[] s = str.split("");
        Map<String, Long> result = Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);

        System.out.println("------------------------------------------------------------------------------------------------");

        // Find duplicates characters
        String str2 = "tushar sinha";
        List<Map.Entry<String, Long>> result2 = Arrays.stream(str2.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toList());
        System.out.println(result2);

        System.out.println("------------------------------------------------------------------------------------------------");

        // Find unique characters
        String str3 = "tushar sinha";
        List<Map.Entry<String, Long>> result3 = Arrays.stream(str3.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).collect(Collectors.toList());
        System.out.println(result3);

        System.out.println("------------------------------------------------------------------------------------------------");

        // Find first non-repeating characters
        String str4 = "tushar sinha";
        Map.Entry<String, Long> result4 = Arrays.stream(str4.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get();
        System.out.println(result4);

        System.out.println("------------------------------------------------------------------------------------------------");

        // Find first repeating characters
                String str5 = "tushar sinha";
                Map.Entry<String, Long> result5 = Arrays.stream(str5.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                        .entrySet().stream().filter(x -> x.getValue()> 1).findFirst().get();
                System.out.println(result5);
    }
}
