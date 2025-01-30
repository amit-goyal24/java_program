import java.util.Scanner;
public class patternwithasterix {
    public static void main(String[] args) {
        System.out.println("Enter thenumber of rows you want : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        int star = 1;
        while(row < n){
            int i = 1;
        while(i <= star){
            System.out.print("* ");
            i++;
        }
        System.out.println();
        star++;
        row++;
    }
}
}