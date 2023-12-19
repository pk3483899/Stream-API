import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> number=Arrays.asList(10,10,20,20,30,40,50);
        List<Integer> data=number.stream().distinct().collect(Collectors.toList());
        System.out.println(data);

    }
}
