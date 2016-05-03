
public class NumericQuestion extends Question{
	private String text;
	private String answer;
	
	
	public NumericQuestion(String question){
		super(question);
		this.text = question;
	}
	
	//@Overridde
	public void setAnswer(double ans){
		this.answer = String.valueOf(ans);
	}
	public boolean checkAnswer(String response){
		return answer.equals(response);
	}
	public void display(){
		System.out.println(text);
	}
}
