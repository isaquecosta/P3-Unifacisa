package Decrescente;
import java.util.ArrayList;
import java.util.Collections;

public class DecrescenteP3 {
	
		public static final int TAMANHO_LIST = 100;

		public static void main(String[] args) {

			ArrayList<Integer> numeros = new ArrayList<Integer>();
			for (int i = 0; i < TAMANHO_LIST; i++) {
				numeros.add(i);
			}
			numeros.sort(Collections.reverseOrder());
			for (int integer : numeros) {
				System.out.println(integer);
			}
		}
	
}
