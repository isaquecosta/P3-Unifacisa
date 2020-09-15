import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MeuArrayListTest {

	private MeuArrayList arrayList;

	@BeforeEach
	public void iniciarLista() {
		arrayList = new MeuArrayList();
	}

	@Test
	public void addNull() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			arrayList.add(null);
		});
	}
	
	@Test
	public void addNada() {
		Assert.assertEquals(0,arrayList.size());
	}

	@Test
	public void addOneElement() {
		arrayList.add("A");
		Assert.assertEquals(1,arrayList.size());
	}

	@Test
	public void addTwoElements() {
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		Assert.assertEquals(3,arrayList.size());
	}

	@Test
	public void addFourElements() {
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		Assert.assertEquals(4,arrayList.size());
	}
	
	@Test
	public void removeElements()
	{
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		Assert.assertEquals(4,arrayList.size());
		arrayList.remove("A");
		Assert.assertEquals(3,arrayList.size());
		arrayList.remove(0);
		Assert.assertEquals(2, arrayList.size());
	}
}
