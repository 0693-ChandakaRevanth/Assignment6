import java.util.*;public class MapAndReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Optional<Integer> sumOfSquaresOfEvens=list.stream().filter(n->n%2==0).map(n->n*n).reduce(Integer::sum);
        System.out.println(sumOfSquaresOfEvens.get());
    }
}
 