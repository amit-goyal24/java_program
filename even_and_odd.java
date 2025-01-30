import java.util.*;
public class even_and_odd {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 2 == 0){
           System.out.println("The number is Even !!"); 
        }
        else {
            System.out.println("The number is Odd !!");
        }
        }
}
