package singletonPatternDesign;

public class MySingletonService {

	//Attribute of this object.
	private String attribute;
	
	//Instance of the object which is going to exist.
	private static MySingletonService instance = null;
	
	//Empty constructor to avoid directly the instance.
	private MySingletonService(){}
	
	public static MySingletonService getInstance(){
		if(instance == null){
			instance = new MySingletonService();
		}
	  //Return the object which was already created.	
	  return instance;	
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
}
