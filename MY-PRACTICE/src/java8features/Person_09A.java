package java8features;

import java.util.List;

public class Person_09A 
{
	private String name;
	private List<String> hobbies;
	

	public Person_09A(String name, List<String> hobbies) {
		super();
		this.name = name;
		this.hobbies = hobbies;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	
}
