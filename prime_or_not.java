import java.util.*;
public class prime_or_not {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%a==0 && a%1==0) {
            System.out.println("The number is Not Prime !!");  
        }
        else {
            System.out.println("The number is Prime !!");
        }
    }
}
// it is not correct ....... kahin to error hai