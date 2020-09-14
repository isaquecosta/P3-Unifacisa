package ComparaDesempenho;
public class ComparaDesempenho {

	public static void main(String[] args) {
		DesempenhoHashSet hS = new DesempenhoHashSet();
		DesempenhoTreeSet tS = new DesempenhoTreeSet();
		
		hS.inserirHashset();
		System.out.println(hS.getTempoInsercao());
		tS.inserirTreeset();
		System.out.println(tS.getTempoInsercao()+"\n");
		
		hS.getHashSet();
		System.out.println(hS.getTempoObtencao());
		tS.getTreeSet();
		System.out.println(tS.getTempoObtencao()+"\n");
		
		tS.navegarTreeSet();
		System.out.println(tS.getTempoNavegacao());
		hS.navegarHashSet();
		System.out.println(hS.getTempoNavegacao()+"\n");
		
		tS.removerTreeset();
		System.out.println(tS.getTempoRemocao());
		hS.removerHashset();
		System.out.println(hS.getTempoRemocao());
	
	}
}
