public class QA implements Serialiable {
    private String question;
    private String answer;

    public void setQuestion(String q) {
	question = q;
    }

    public String getQuestion() {
	return question;
    }

    public void setAnswer(String a) {
	answer = a;
    }

    public String getAnswer() {
	return answer;
    }
}
