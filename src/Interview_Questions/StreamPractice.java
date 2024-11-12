package Interview_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        System.out.println(StreamPractice.swapNumbers(2,3));
    }
    public static String swapNumbers(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        return  a +","+b ;
    }
}
