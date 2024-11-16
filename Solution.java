import java.util.*;
public class Solution{  
        public static void main(String[] args) {

Scanner s=new Scanner(System.in);

int n=s.nextInt();

int k=s.nextInt();

int[] arr=new int[n];

int total=0;

for(int i=0; i<n; i++){

arr[i]=s.nextInt();

total+=arr[i];

}

int b=s.nextInt();

int actualSplit=(total-arr[k])/2;

if(actualSplit==b) {

System.out.print("Bon Appetit");

}

else{

System.out.print(Math.abs(actualSplit-b));

}