package fernando;

public class Inscrito implements Observer{
	
	private int number;
	private String name;
	
	public Inscrito(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Subject s, Object o) {
		number = (Integer) o;
		System.out.println("Observador "+name+" atualizado: Valor = "+number);
	}

}
