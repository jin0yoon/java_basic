package thisex;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personNoname = new Person();
		personNoname.showInfo();
		
		Person personLee = new Person("Lee", 20);
		personLee.showInfo();
		System.out.println(personLee);
		
		Person p = personLee.getSelf();
		System.out.println(p);
	}

}
