package ComparaDesempenho;
import java.util.TreeSet;

public class DesempenhoTreeSet {
	private TreeSet<Integer> treeSet = new TreeSet<Integer>();
	private long tempoInsercao;
	private long tempoRemocao;
	private long tempoObtencao;
	private long tempoNavegacao;
	private static final int TAMANHO_SET = 100;

	public long getTempoInsercao() {
		return tempoInsercao;
	}

	public long getTempoObtencao() {
		return tempoObtencao;
	}

	public long getTempoNavegacao() {
		return tempoNavegacao;
	}
	
	public long getTempoRemocao() {
		return tempoRemocao;
	}

	public void inserirTreeset()
	{
		long tempoI = System.nanoTime();
		for (int i = 0; i < TAMANHO_SET; i++) {
			treeSet.add(i);
		}
		long tempoF = System.nanoTime();
		tempoInsercao = tempoF-tempoI;
	}
	
	public void removerTreeset()
	{
		long tempoI = System.nanoTime();
		for (int i = 0; i < TAMANHO_SET; i++) {
			treeSet.remove(i);
		}
		long tempoF = System.nanoTime();
		tempoRemocao = tempoF-tempoI;
	}
	
	public String getTreeSet()
	{
		long tempoI = System.nanoTime();
		StringBuilder string = new StringBuilder();
		for (Integer integer : treeSet) {
			string.append(integer);
		}
		long tempoF = System.nanoTime();
		tempoObtencao = tempoF - tempoI;
		return string.toString();
	}
	
	public void navegarTreeSet()
	{
		long tempoI = System.nanoTime();
		for (Integer integer : treeSet) {
		}
		long tempoF = System.nanoTime();
		tempoNavegacao = tempoF - tempoI;
	}
}
