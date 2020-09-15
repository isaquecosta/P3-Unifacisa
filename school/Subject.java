package school;

import java.util.HashSet;

import lombok.Data;

@Data
public class Subject {
	private char id;
	private String name;
	private char classId;
	private Admin admin;
	
	public void displaySubject(HashSet<Subject> subjects)
	{
		for (Subject subject : subjects) {
			System.out.println(subject.toString());
		}
	}
}
