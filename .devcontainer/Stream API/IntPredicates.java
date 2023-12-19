import java.util.Scanner;
import java.util.function.Predicate;

public class IntPredicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        sc.close();
        // int num=30;
        Predicate<Integer> number=x->x>20;  // To check whether the given number is grater than 20 or not
        boolean nn=number.test(num);
        // System.out.println(number.test(num));
        System.out.println("The entered value is : "+nn);
    }
}