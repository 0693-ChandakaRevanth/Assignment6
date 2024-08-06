import java.util.*;
interface Addition{
    int add(int a,int b);
}
public class FunctionalInterface {
    public static void main(String[] args) {
        Addition a=(int num1,int num2)->{
            int result=num1+num2;
            return result;
        };
        System.out.println(a.add(5,3));
    }
}