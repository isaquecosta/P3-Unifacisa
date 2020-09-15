
public class MeuArrayList {

	private static final int ALLOCATION = 3;

	private Object[] arrayInterno = new Object[ALLOCATION];

	private int inseridos;

	public void add(Object obj) {

		if (obj == null) {
			throw new IllegalArgumentException("O valor informado não pode ser null");
		}

		if (inseridos == arrayInterno.length) {

			Object[] novoArrayInterno = new Object[arrayInterno.length + ALLOCATION];

			for (int i = 0; i < arrayInterno.length; i++) {
				novoArrayInterno[i] = arrayInterno[i];
			}

			arrayInterno = novoArrayInterno;
		}

		arrayInterno[inseridos] = obj;
		inseridos++;
	}

	public void remove(Object obj) {
		Object[] novoArrayInterno = new Object[arrayInterno.length - 1];
		for (int i = 0; i < arrayInterno.length - 1; i++) {
			int j = 0;
			if (arrayInterno[i] != obj) {
				novoArrayInterno[j] = arrayInterno[i];
				j++;
			}
		}
		arrayInterno = novoArrayInterno;
		inseridos--;
	}

	public void remove(int index) {
		Object[] novoArrayInterno = new Object[arrayInterno.length - 1];
		for (int i = 0; i < arrayInterno.length - 1; i++) {
			int j = 0;
			if (i != index) {
				novoArrayInterno[j] = arrayInterno[i];
				j++;
			}
		}
		arrayInterno = novoArrayInterno;
		inseridos--;
	}

	public int size() {
		return inseridos;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

}
