
public class pattern{
    public static void main(String []args){
        int f=1,n=5;
        for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                { 
                    if (f==1)
                    {
                      System.out.print(f);
                      f=0;
                }
                else{
                      System.out.print(f);
                      f=1;
         }           
        
       }
                        System.out.println();
    }
  }
}   
