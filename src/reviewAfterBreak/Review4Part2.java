package reviewAfterBreak;

public class Review4Part2 {
	private String name;
	private int grade;

	public Review4Part2() {
		name = "";
		grade = 0;
	}

	public Review4Part2(String xName, int xGrade) {
		name = xName;
		grade = xGrade;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public void setName(String xName) {
		name = xName;
	}

	public void setGrade(int xGrade) {
		grade = xGrade;

	}
}
