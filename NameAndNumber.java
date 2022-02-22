import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameAndNumber {
	
	public static void checkName(List<String> names , List<Integer> numbers, String name) {
		Scanner s = new Scanner(System.in);
		int index = -1;
		if(names.contains(name)) {
			index = names.indexOf(name);
			System.out.println( numbers.get(index));
		}
		else{
			System.out.println("Didn't find associated number with name Please enter a number");
			int num = s.nextInt();
			if(numbers.size()<100 && num < 100) {
				names.add(name);
				numbers.add(num);
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> names = new ArrayList<>();
		List<Integer> numbers = new ArrayList<>();
		names.add("yukti");
		names.add("manan");
		names.add("rashi");
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		String str = s.next();
		checkName(names,numbers,str);
 
	}

}
