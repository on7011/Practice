package progate;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("なお","おおはし",24,1.5,40.0);
		Person person2 = new Person("Mike", "AA", "BB", 22, 1.8, 70.0);


		System.out.println(person.firstName);
		System.out.println(person.lastName);
		System.out.println(person.age);
		System.out.println(person.height);
		System.out.println(person.weight);
		
		 System.out.println("person2のミドルネームは" + person2.getMiddleName() + "です");
		    

		person.hello();
	}

}
