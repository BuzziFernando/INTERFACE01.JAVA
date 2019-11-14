package fernando;

public class Main {

	 public static void main(String[] args) {
		Produto assunto = new Produto();

		Cliente o1 = new Cliente("dudu");
		Cliente o2 = new Cliente("maria");
		Cliente o3 = new Cliente("lele");
		Cliente o4 = new Cliente("lolo");

		assunto.attach(o1);
		assunto.attach(o2);
		assunto.attach(o3);
		assunto.attach(o4);
		
		assunto.generateNewNumber();
		System.out.println("------");
		assunto.detach(o3);
		

		assunto.generateNewNumber();
		
	}
	
}
