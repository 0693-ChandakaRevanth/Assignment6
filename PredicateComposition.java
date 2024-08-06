import java.util.*;
public class PredicateComposition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> strings = Arrays.asList("blue","pinkish","purple","green","black");
        System.out.println("Enter the sub string you want: ");
        String required_subString = input.nextLine();

        strings.stream().filter(s->s.length()>5 && s.contains(required_subString)).forEach(System.out::println);
    }
}