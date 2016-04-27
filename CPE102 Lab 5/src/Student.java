
public class Student extends Person{
	public String major;
	public Student(String setName, int setBirthYear, String setMajor){
		this.name = setName;
		this.birthYear = setBirthYear;
		this.major = setMajor;
	}
	public String toString(){
		return "Student[super=Person[name=" + name + ",birthYear=" + birthYear + "],major=" + major + "]";
	}
}
