package main;

import singletonPatternDesign.MySingletonService;

public class Main {

	public static void main(String[] args) {
		
		//Same object, same reference, one instance.
		MySingletonService ref1 = MySingletonService.getInstance();
		MySingletonService ref2 = MySingletonService.getInstance();

		//Check the reference (memory address).
		System.out.println(ref1);
		System.out.println(ref2);
		
		//Change value of attribute (ref1).
		ref1.setAttribute("Hello World");
      
		//Show value from attribute (ref2) because it is the same object. 
		System.out.println(ref2.getAttribute());
	}

}
