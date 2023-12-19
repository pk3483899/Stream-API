import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheElements {
    public static void main(String[] args) {
        List<Integer> number=Arrays.asList(10,20,5,5,6,23,2323,121,23);
        List<Integer> data=number.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(data);
    }
}
