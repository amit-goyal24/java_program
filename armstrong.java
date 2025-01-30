import java.util.Scanner;
public class armstrong{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int sum=0;
    for(int i=0;i<a;i++){
        int r=a%10;
        int n=r*r*r;
        sum+=n;
    }
    if(a==sum){
        System.out.println("true");
    }
    else{
        System.out.println("false");
        
    }
    sc.close();
    }
}