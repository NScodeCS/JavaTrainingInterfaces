
public class Person implements Info {
	private String name;
	
	
public Person(String name) {
		super();
		this.name = name;
	}


public void greed(){
	System.out.println("hello");
}


@Override
public void showInfo() {
System.out.println("Hell " +name);	
}
}
