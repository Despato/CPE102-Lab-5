import java.util.*;

public class GradeBook {
	public static void main(String [] args){
		boolean flag = true;
		ArrayList<Student> students = new ArrayList<Student>();
		Scanner lineReader = new Scanner(System.in);
		while (flag){
			System.out.println("Enter a student name, Q to quit:");
			String nameInput = lineReader.nextLine();
			if (nameInput.equals("Q") || nameInput.equals("q")){
				flag = false;
			}else{
				students.add(new Student(nameInput));
			}
			
		}
		for (Student student : students){
			flag = true;
			System.out.println("Enter scores for " + student.name + ", Q to quit:");
			String[] rawline = lineReader.nextLine().split(" ");
			for (String each : rawline){
				if (each.equals("Q")){
					break;
				}else{
					student.scores.add(Double.valueOf(each));
				}
			}
			}
		lineReader.close();
		for (Student student : students){
			student.showGrade();
		}
	}
}