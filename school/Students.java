package school;

import java.util.HashSet;
import java.util.Stack;

import lombok.Data;

@Data
public class Students {
	private char id;
	private String name;
	private int phNo;
	private String adress;
	private HashSet<Teachers> professores = new HashSet<Teachers>();
	private Class classe;
	private Stack<TestPaper> provas = new Stack<TestPaper>();
	private Admin admin;
	
	
	public void fillAdmissionForm(String nome,String endereco, int phNo)
	{
		this.name = nome;
		this.adress = endereco;
		this.phNo = phNo;
	}
	
	public String getEnrolled()
	{	
		StringBuilder matricula = new StringBuilder();
		matricula.append(this.id);
		matricula.append("Nome: " + this.name);
		matricula.append("\n");
		matricula.append("Endereço: "+ this.adress);
		matricula.append("\n");
		matricula.append("Id: "+ this.id);
		matricula.append("\n");
		matricula.append("PhNo: "+ this.phNo);
		return matricula.toString();
	}
	
	public void writeExam()
	{
	}
}
