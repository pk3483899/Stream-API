import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNosInAnArray {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(10,20,11,23,45,55,24,90);
        List<Integer> data=numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("The even numbers in the given array is : "+data);
    }
}
