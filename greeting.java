import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name ??");
        String str = sc.nextLine();
        System.out.println("Hello " + str + ", have a good day ahead !!");
    }
}