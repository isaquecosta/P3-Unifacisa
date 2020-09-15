package school;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import lombok.Data;

@Data
public class Teachers {
	private char id;
	private String name;
	private int phNo;
	private String adress;
	private Stack<TestPaper> provas = new Stack<TestPaper>();
	private Admin admin = new Admin();
	private HashSet<Students> estudantes = new HashSet<Students>();
	private ArrayList<String> listaPresenca = new ArrayList<String>();

	public void prepareTestPaper(TestPaper newTest) {
		provas.add(newTest);
	}

	public void markAttendence(String nomeEstudante) {
		listaPresenca.add(nomeEstudante);
	}

	public String checkPapers() {
		StringBuilder provas = new StringBuilder();
		for (Students students : estudantes) {
			int quantProva = 1;
			for (TestPaper prova : students.getProvas()) {
				provas.append("nome do estudante: ");
				provas.append(students.getName());
				provas.append("prova" + quantProva);
				quantProva += 1;
				provas.append(prova.toString() + "\n");
			}
		}
		return provas.toString();
	}

	public String prepareReportsCards(double media1, double media2, double media3, double media4, String nomeEstudante)
	{	StringBuilder reportCard = new StringBuilder();
		reportCard.append("Nome: " + nomeEstudante);
		reportCard.append("\n");
		reportCard.append("Media 1º semestre \n");
		reportCard.append(media1 + "\n");
		reportCard.append("Media 2º semestre \n");
		reportCard.append(media2 + "\n");
		reportCard.append("Media 3º semestre \n");
		reportCard.append(media3 + "\n");
		reportCard.append("Media 4º semestre \n");
		reportCard.append(media4);
		return reportCard.toString();
	}

	public boolean declareResult(double media1, double media2, double media3, double media4) {
		return media1 + media2 + media3 + media4 >= 28 ? true : false;
	}

	public boolean declareResult(double notaProva) {
		return notaProva >= 7 ? true : false;
	}
}
