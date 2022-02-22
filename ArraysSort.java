import java.util.Arrays;
import java.util.Comparator;


class CustomComparator implements Comparator<String> {
	  
	  private int wholePart(String[] version) {
		    return Integer.parseInt(version[0]);
		  }
		  private Integer decimalPart(String[] version) {
		    if(version.length > 1 )
		    	return Integer.parseInt(version[1]);
		    return 0;
		  }
	  public int compare(String version1, String version2) {
	    String[] v1 = version1.split("\\.");
	    String[] v2 = version2.split("\\.");
	    int wholeNum1 = wholePart(v1);
	    int wholeNum2 = wholePart(v2);
	    if (wholeNum1 == wholeNum2) {
	      return decimalPart(v1).compareTo(decimalPart(v2));
	    }
	    return wholeNum1 > wholeNum2 ? 1 : -1;
	  }
	  
	}
public class ArraysSort {
	public static void main(String[] args) {
		 String[] input = { "0.10", "0.2", "0.1", "0", "1.10", "1.2", "1.1", "1",
			        "2.10", "2", "2.2", "2.1" };
			    Arrays.sort(input, new CustomComparator());
			    System.out.println(Arrays.asList(input));
	}
}

