package school;

import java.util.HashSet;

import lombok.Data;

@Data
public class Division {
	private char id;
	private String nome;
	private Admin admin;
	
	public void displayDivisions(HashSet<Division> divisions)
	{
		for (Division division : divisions) {
			System.out.println(division.toString());
		}
	}
}
