import java.util.*;
interface function{
    public void areaOfCircle(int radius);
}
public class FunctionInterface {
    public static void main(String[] args) {

        function f= (int radius)->{
            System.out.println(Math.PI * radius*radius);
        };
        f.areaOfCircle(5);
    }
}