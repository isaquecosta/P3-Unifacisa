package SerializacaoHashMap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Serializacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("Python", 200);hmap.put("Java", 100); hmap.put("JavaScript", 150); hmap.put("C++", 300);
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Hashmap.ser")))
		{
			oos.writeObject(hmap);
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
