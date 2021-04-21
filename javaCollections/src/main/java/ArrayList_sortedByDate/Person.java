package ArrayList_sortedByDate;

import java.time.LocalDate;

public class Person {
   
	private int id; 
	
	private String name;
   
	private LocalDate dateOfBirth;

	public Person(int id, String name,LocalDate localDate) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = localDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
     
}
