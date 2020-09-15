package school;

import java.util.HashSet;

import lombok.Data;

@Data
public class Class {
	private char id;
	private String nome;
	private HashSet<Students> estudantes = new HashSet<Students>();
	private Admin admin;
	
	public void displayClass(HashSet<Class> classes)
	{
		for (Class class1 : classes) {
			System.out.println(class1.toString());
		}
	}
}
