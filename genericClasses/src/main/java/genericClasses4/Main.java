package genericClasses4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> integerNumbers = Arrays.asList(1,2,3,4,5);
		System.out.println("Integer sum: " + sumOfList(integerNumbers));
        
		List<Float> floatNumbers = Arrays.asList(1.2f,2.5f,3.4f,4.8f,5.3f);
		System.out.println("Float sum: " + sumOfList(floatNumbers));
	}

	public static double sumOfList(List<? extends Number> list){
	  double s = 0.0;
		 for (Number n : list)
		        s += n.doubleValue();
	  return s;	
	}
}
