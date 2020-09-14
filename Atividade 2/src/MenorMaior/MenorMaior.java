package MenorMaior;
import java.util.ArrayList;
import java.util.Collections;

public class MenorMaior {
	
	public static final int TAMANHO_LIST = 100;

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(65);
		numeros.add(34);
		numeros.add(66);
		numeros.add(12);
		numeros.add(23);
		numeros.add(10);

		Collections.sort(numeros);
		System.out.println("Menor:" + numeros.get(0));
		System.out.println("Menor:" + numeros.get(numeros.size() - 1));

	}

}
