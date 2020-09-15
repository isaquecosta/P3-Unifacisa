package school;

public class MediaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	  public String getMessage(){
	    System.out.println("Numero menor que 0 ou maior que 10");
		return null;
	  }
}
