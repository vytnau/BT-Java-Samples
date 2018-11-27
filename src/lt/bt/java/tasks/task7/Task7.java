package lt.bt.java.tasks.task7;

import lt.bt.java.tasks.task7.data.Student;

public class Task7 {

	public static void main(String[] args) {
		Task7 task = new Task7();
		Student stud1 = task.createStudent("Vytautas", "Naudzius", "12", new int[]{9, 8, 7, 9, 6},  new boolean[]{true, true, true, false, true});
		Student stud2 = task.createStudent("Linas", "Pocius", "11", new int[]{6, 4, 7, 7, 10},  new boolean[]{false, true, false, false, true});
		
		task.printStudentRezult(stud1);
		stud1.addMark(10);
		task.printStudentRezult(stud1);
		task.printStudentRezult(stud2);
	}
	
	public void printStudentRezult(Student stud){
		System.out.println("Studentas: " + stud.getName() + " " + stud.getLastName());		
		System.out.println("Vidurkis: " + calculateAvarage(stud));
		int attendCount = calculateAttends(stud.getAttends());
		System.out.println("Lankomumas: " + attendCount + "/" + stud.getAttends().length);
		System.out.println("----------------------------");
	}
	
	public Student createStudent(String name, String lastName, String grade, int[] marks, boolean[] attends ){
		Student stud = new Student(name, lastName, grade);
		stud.setAttends(attends);
		stud.setMarks(marks);
		return stud;
	}
	
	public int calculateAttends(boolean[] attends){
		int result = 0;
		for(int i = 0; i < attends.length; i++){
			if(attends[i]){
				result++;
			}
		}
		return result;
	}

	public double calculateAvarage(Student student) {
		double avg = 0;
		int[] marks = student.getMarks();
		if (marks.length > 0) {
			for (int i = 0; i < marks.length; i++) {
				avg += marks[i];
			}
			avg = avg / marks.length;
		}

		return avg;
	}

}
