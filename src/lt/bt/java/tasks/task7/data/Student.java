package lt.bt.java.tasks.task7.data;

public class Student {
	private String name;
	private String lastName;
	private String grade;
	private int[] marks;
	private boolean[] attends;

	public Student(String name, String lastName, String grade) {
		this.name = name;
		this.lastName = lastName;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public boolean[] getAttends() {
		return attends;
	}

	public void setAttends(boolean[] attends) {
		this.attends = attends;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public void addMark(int mark){
		int[] newArray = new int[marks.length + 1];
		for(int i = 0; i < marks.length; i++){
			newArray[i] = marks[i];
		}
		newArray[marks.length] = mark;
		marks = newArray;
	}
}
