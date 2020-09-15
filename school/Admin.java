package school;

import java.util.ArrayList;
import java.util.HashSet;

import lombok.Data;

@Data
public class Admin {
	private char id;
	private String name;
	private String password;
	private HashSet<Teachers> contratados = new HashSet<Teachers>();
	private HashSet<Students> matriculados = new HashSet<Students>();
	private ArrayList<Subject> arraySubjects = new ArrayList<Subject>();
	private HashSet<Class> classes = new HashSet<Class>();
	private HashSet<Division> divisions = new HashSet<Division>();

	public void login(char id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public void logout() {
		this.id = (Character) null;
		this.name = null;
		this.password = null;
	}

	public void addNewTeachers(Teachers newTeacher) {
		contratados.add(newTeacher);
	}

	public void modifyTeachers(Teachers newTeacher) {
		for (Teachers teacher : contratados) {
			if (newTeacher.getId() == teacher.getId()) {
				contratados.remove(teacher);
				contratados.add(newTeacher);
			}
		}
	}

	public void addNewStudent(Students newStudent) {
		matriculados.add(newStudent);
	}

	public void modifyStudent(Students newStudent) {
		for (Students student : matriculados) {
			if (newStudent.getId() == student.getId()) {
				matriculados.remove(student);
				matriculados.add(newStudent);
			}
		}
	}

	public void addNewSubject(Subject newSubject) {
		arraySubjects.add(newSubject);
	}

	public void modifySubject(Subject newSubject) {
		for (Subject subject : arraySubjects) {
			if (newSubject.getId() == subject.getId()) {
				arraySubjects.remove(subject);
				arraySubjects.add(newSubject);
			}
		}
	}

	public void addNewClass(Class newClass) {
		classes.add(newClass);
	}

	public void modifyClass(Class newClass) {
		for (Class class1 : classes) {
			if (newClass.getId() == class1.getId()) {
				classes.remove(class1);
				classes.add(newClass);
			}
		}
	}

	public void addNewDivision(Division newDivision) {
		divisions.add(newDivision);
	}

	public void modifyDivision(Division newDivision) {
		for (Division division : divisions) {
			if (newDivision.getId() == division.getId()) {
				divisions.remove(division);
				divisions.add(newDivision);
			}
		}
	}
}
