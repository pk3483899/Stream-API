import java.util.Scanner;
import java.util.function.Predicate;

public class StringPredicates {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string :");
        String str=sc.nextLine();
        sc.close();
        //String str="Mike";
        Predicate<String> strings=x->x.equals("Mike");
        System.out.println("You have entered "+strings.test(str)+" value");
    }
}