package ComparaDesempenho;
import java.util.HashSet;

public class DesempenhoHashSet {

		private HashSet<Integer> hashset = new HashSet<Integer>();
		private static final int TAMANHO_SET = 100;
		private long tempoInsercao;
		private long tempoRemocao;
		private long tempoObtencao;
		private long tempoNavegacao;

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

		public void inserirHashset() {
			long tempoI = System.nanoTime();
			for (int i = 0; i < TAMANHO_SET; i++) {
				hashset.add(i);
			}
			long tempoF = System.nanoTime();
			tempoInsercao = tempoF-tempoI;
		}
		
		public void removerHashset() {
			long tempoI = System.nanoTime();
			for (int i = 0; i < TAMANHO_SET; i++) {
				hashset.remove(i);
			}
			long tempoF = System.nanoTime();
			tempoRemocao = tempoF-tempoI;
		}
		
		public String getHashSet() {
			long tempoI = System.nanoTime();
			StringBuilder string = new StringBuilder();
			for (Integer integer : hashset) {
				string.append(integer);
			}
			long tempoF = System.nanoTime();
			tempoObtencao = tempoF - tempoI;
			return string.toString();
		}
		
		public void navegarHashSet() {
			long tempoI = System.nanoTime();
			for (Integer integer : hashset) {
			}
			long tempoF = System.nanoTime();
			tempoNavegacao = tempoF - tempoI;
		}
	
}
