import java.util.*;
public class FilteringList {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","Banana","Orange");
        List<String> result = fruits.stream()
                .filter(fruit-> fruit.startsWith("A"
                ))
                .toList();
        System.out.println(result);

    }
}
 