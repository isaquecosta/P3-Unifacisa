package linkedList;

public class LinkedList {
	
	Objeto head;
	int size = 0;
	
	public void add(int num)
	{
		Objeto Objeto = new Objeto();
		Objeto.num = num;
		
		if(head==null)
		{
			head = Objeto;
		}
		else
		{
			Objeto obj = head;
			while(obj.next!=null)
			{
				obj = obj.next;
			}
			obj.next = Objeto;
		}
		size++;
	}
	
	public void removeAt(int index)
	{
		if(index==0)
		{
			head = head.next;
		}
		else
		{
			Objeto o = head.next;
			Objeto o1 = null;
			for (int i = 0; i < index; i++) {
				o = o.next;
			}
			o1 = o.next;
			o.next = o1.next;
			o1 = null;
		}
		size--;
	}
	
	public void remove(int num)
	{
		if(num==head.num)
		{
			head = head.next;
		}
		else
		{
			Objeto o = head.next;
			Objeto o1 = head;
			while(o.num!= num) 
			{
				o = o.next;
				o1= o1.next;
			}
			o1.next = o.next;
			o = null;
		}
		size--;
	}
	
	public int getAt(int index)
	{
		if(index==0)
		{
			return head.num;
		}
		else
		{
			Objeto o = head.next;
			for (int i = 1; i < index; i++) 
			{
				o = o.next;
			}
			return o.num;
		}
	}
	
	public int get(int num)
	{
		if(num==head.num)
		{
			return 0;
		}
		else
		{
			int cont = 0;
			Objeto o = head.next;
			while(o.num!=num)
			{
				o = o.next;
				cont++;
			}
			return cont;
		}
	}
	
	public int size()
	{
		return size;
	}
	
	public String listar()
	{
		Objeto objeto = head;
		StringBuilder listar = new StringBuilder();
		while(objeto!=null)
		{
			listar.append(objeto.num).append("\n");
			objeto = objeto.next;
		}
		return listar.toString();
	}
	
	
}
