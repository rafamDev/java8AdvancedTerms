package genericClasses2;

public class Main {

	public static void main(String[] args) {
		//I assign the data type in this pair generic class, in compile time.
		User<String,String> user = new User<String, String>("abc689", "Fulano46");
		    System.out.println("Value of User(pair generic class) -> "
		       + user.getPassword() + ", " + user.getLoginName());
    }

}
