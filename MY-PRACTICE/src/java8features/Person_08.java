package java8features;

public class Person_08 
{
	private String personName;
	private Integer personAge;
	public Person_08(String personName, Integer personAge) {
		super();
		this.personName = personName;
		this.personAge = personAge;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Integer getPersonAge() {
		return personAge;
	}
	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
	}
	@Override
	public String toString() {
		return "Person_08 [personName=" + personName + ", personAge=" + personAge + "]";
	}
	

}
