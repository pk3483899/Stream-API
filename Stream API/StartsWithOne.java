import java.util.Arrays;
import java.util.List;
//Elements starts with digit 1 in the starting

public class StartsWithOne {
    public static void main(String[] args) {
        List<Integer> number=Arrays.asList(12,122,23,434,112,1111,101);
        number.stream().map(x->x+"").filter(s->s.startsWith("1")).forEach(System.out::println);

    }
}
