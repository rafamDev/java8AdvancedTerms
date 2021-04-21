package anonymous_local;

public class HolaMundo {
   
   interface HelloWorld{
	   public void greet();
	   public void greetSomeone(String someone);
   }
   
   public void sayHello(){
	   
	   //Local class.
	   class EnglishGreeting implements HelloWorld{
           
		   String name = "World";
		   
           public void greet() {
			  greetSomeone("World");
		   }

		   public void greetSomeone(String someone) {
			  name = someone;
			  System.out.println("Hello " + name);
		   }
	   }
	   
	   //Instance of local Class.
	   HelloWorld englishGreeting = new EnglishGreeting();
   
	   //Anonymous Class.
	   //FrenchGreeting is the only reference/instance of this anonymous class.
	   HelloWorld frenchGreeting = new HelloWorld(){
		   
		   String name = "tout le monde";

		   public void greet() {
			  greetSomeone("tout le monde");
		   }

		   public void greetSomeone(String someone) {
		      name = someone;
		      System.out.println("Salut " + someone);
		   }
	   };
  
	   //Anonymous class which has not assigned to any reference.
	   new HelloWorld() {

		  String name = "Mundo";
		   
		  public void greet() {
			greetSomeone("Mundo");
		  }

		  public void greetSomeone(String someone) {
			name = someone;
			System.out.println("Hola " + name);
		  }
	   }.greet();
   
	   
	   englishGreeting.greet();
	   
	   frenchGreeting.greetSomeone("Marie");
   
   }


}
