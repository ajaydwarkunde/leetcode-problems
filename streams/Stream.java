package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class Stream {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaa bbbbbbb cccccc dddd";
//        mostRepetitiveCharacter(s);
        int[] arr = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5};
//        removeDuplicateValues(arr);
    }

    // find most repetitive character
    static void mostRepetitiveCharacter(String s) {
               Character a = s.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(comparingByValue())
                .get()
                .getKey();
        System.out.println(a);

        Set<Integer> hashSet = new HashSet<>();
        OptionalInt abcd = s.chars()
                .filter(value -> !hashSet.add(value))
                .findFirst();
        if (abcd.isPresent()) System.out.println((char) abcd.getAsInt());
    }

    // remove duplicate values
    static void removeDuplicateValues (int[] arr) {
        Set<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println(list);
    }

    //
}
