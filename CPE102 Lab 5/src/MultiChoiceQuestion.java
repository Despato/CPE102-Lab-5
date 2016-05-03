import java.util.LinkedHashMap;

public class MultiChoiceQuestion extends Question{
	public String question;
	LinkedHashMap<String, Boolean> map = new LinkedHashMap<String, Boolean>();
	public MultiChoiceQuestion(String q){
		super(q);
		this.question = q;
	}
	public void addChoice(String answer, boolean value){
		map.put(answer, value);
	}
	public void display(){
		System.out.println(question);
		for (int i = 1; i <= map.size(); i++){
			System.out.println(i + ": " + map.keySet().toArray()[i - 1]);
		}
	}
	public boolean checkAnswer(String response){
		String[] splitResponse = response.split(" ");
		boolean flag = true;
		for (String s : splitResponse){
			if (!flag){
				continue;
			}else{
				flag = map.get(map.keySet().toArray()[Integer.parseInt(s) - 1]) ? true : false;
			}
		}
		return flag;
	}
}
