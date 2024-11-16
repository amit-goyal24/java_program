import java.util.*;
public class SetHashSet1 {
//add, remove and print the set 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<>();
		set.add(1);
		set.add(400);
		set.add(2);
		set.add(1);
		set.add(3);
		System.out.println(set);
		set.remove(400);
        Iterator itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("after");
		
		
		

	}

}


