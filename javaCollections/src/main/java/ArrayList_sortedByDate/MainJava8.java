package ArrayList_sortedByDate;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainJava8{

 public static void main(String[] args) {
	Person person1 = new Person(1,"Jhon",LocalDate.of(1996, 4 , 13));
	Person person2 = new Person(2,"Mike",LocalDate.of(1999, 8 , 21));
	List<Person> personsList = Arrays.asList(person1,person2);
	//Sort this list by date.
	 personsList.sort((p1,p2) -> -p1.getDateOfBirth().compareTo(p2.getDateOfBirth()));
      //Another option.
	  //Comparator<Person> comparator = (p1,p2) -> -p1.getDateOfBirth().compareTo(p2.getDateOfBirth());
      //personsList.sort(comparator);
      personsList.forEach(System.out::println);
  }

}
