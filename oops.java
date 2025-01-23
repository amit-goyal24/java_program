package prac_krish;
class library{
    public void shape(){
        System.out.println("This is a rectangle");
    }
}
class rect extends library{
    
}
public class oops {
    public  static void main(String[] args){
    rect r =new rect();
    r.shape();
    }
}
