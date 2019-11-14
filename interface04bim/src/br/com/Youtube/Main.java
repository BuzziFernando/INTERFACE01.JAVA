package fernando;

public class Main {

	 public static void main(String[] args) {
		Canal assunto = new Canal();

		Inscrito o1 = new Inscrito("dudu");
		Inscrito o2 = new Inscrito("maria");
		Inscrito o3 = new Inscrito("lele");
		Inscrito o4 = new Inscrito("lolo");

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
