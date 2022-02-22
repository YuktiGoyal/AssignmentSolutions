import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumbers {
	
	public static void print(Set<Integer> set,int min, int max) {
		Random random = new Random();
		while(set.size()<=max-min+1) {
			int number= random.nextInt(max - min +1) + min;
			if(!set.contains(number)) {
				set.add(number);
				System.out.print(number+" ");
			}
		}
	}

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		print(set,1,10);
	}
}