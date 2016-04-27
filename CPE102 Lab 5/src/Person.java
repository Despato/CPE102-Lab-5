public class Person {
	public String name;
	public int birthYear;
	
	public Person(){
		
	}
	
	public Person(String setName, int setBirthYear){
		this.name = setName;
		this.birthYear = setBirthYear;
	}
	public String toString(){
		return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	}
}
