import java.util.ArrayList;

public class Student {
	public String name;
	ArrayList<Double> scores = new ArrayList<Double>();
	public Student(String name){
		this.name = name;
	}
	public void showGrade(){
		double min = scores.get(0);
		for (double score : scores){
			if (score < min){
				min = score;
			}
		}
		double total = 0;
		for (double score : scores){
			total += score;
		}
		System.out.println(this.name + ": " + (total - min));
	}
}