import java.util.*;
import java.util.function.Consumer;
public class ConsumerInterface {
    public static void main(String[] args) {
        List<String> colors= Arrays.asList("blue","black","purple");
        Consumer<String> ch=(String s)->{
            String str=s.substring(0,1).toUpperCase()+s.substring(1);
            System.out.println(str);
        };
        colors.forEach(ch);
    }
}
 