package ArrayList_sortedByDate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainJava5 {

    public static void main(String[] args) {
	   List<Person> personsList = new ArrayList<Person>(); 
       personsList.add(new Person(1,"Jhon",LocalDate.of(1996, 4 , 13)));
       personsList.add(new Person(2,"Mike",LocalDate.of(1999, 8 , 21)));
         //Sort this list by date.
          personsList.sort(new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
				return -p1.getDateOfBirth().compareTo(p2.getDateOfBirth());
			}
          });
          for (Person person : personsList) {
			System.out.println(person.toString());
		  }
	}
	
}
