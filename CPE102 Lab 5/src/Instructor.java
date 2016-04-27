
public class Instructor extends Person{
	public int salary;

	public Instructor(String setName, int setBirthYear, int setSalary){
		this.name = setName;
		this.birthYear = setBirthYear;
		this.salary = setSalary;
	}
	public String toString(){
		return "Instructor[super=Person[name=" + name + ",birthYear=" + birthYear + "],salary=" + salary + ".0]";
	}
}
