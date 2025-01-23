package prac_krish;

public class pascal {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
            int number=1;
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number *= (i - j); 
                number /= (j + 1);
            }
            System.out.println();
        }
}
}