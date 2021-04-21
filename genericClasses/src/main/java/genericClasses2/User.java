package genericClasses2;

public class User<K,V> {

	private K password;
	
	private V loginName;
	
	public User(K password, V loginName){
	   this.password = password;
	   this.loginName = loginName;
	}

	public K getPassword() {
		return password;
	}

	public V getLoginName() {
		return loginName;
	}
	
}
