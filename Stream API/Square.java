import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class Square {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(10,20,30,50,2,3,4);
        List<Integer> data=numbers.stream().map(x->x=x*x).collect(Collectors.toList());
        System.out.print("The square of elemnts are : ");
        for (Integer n : data) {
            System.out.print(n+" ");
            
        }
    }
}
