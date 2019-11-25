package game;

public class Question {
	
	String question;
	String answer1;
	String answer2;
	String answer3;
	String answer4;
	String correct;
	
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String correct) {
		this.correct = correct;
	}
	public String getQuestions() {
		return question;
	}
	public void setQuestions(String Questions) {
		this.question = Questions;
	}
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public String getAnswer3() {
		return answer3;
	}
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	public String getAnswer4() {
		return answer4;
	}
	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}
	@Override
	public String toString() {
		return "Question [question = " + question + ", answer1 = " + answer1 + ", answer2 = " + answer2 + ", answer3 = "
				+ answer3 + ", answer4 = " + answer4 + ", correct = " + correct + "]";
	}
	
	public String printQuestionAnswers() {
		return question + "\nA) " + answer1 + "\nB) " + answer2 + "\nC) " + answer3 + "\nD) " + answer4;
		
	}
	
	
	
}
