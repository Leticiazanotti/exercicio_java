package Teste_;

public class cliente_teste {

	public static void main(String[] args) {
		
		Cliente_1 pessoa1 = new Cliente_1 ("Laura Souza","Brasileira","Salvador",21);
		Cliente_1 pessoa2 = new Cliente_1 ("Daniel Oliveira","Brasileiro","Gramado",14);
		Cliente_1 pessoa3 = new Cliente_1 ("Jack Louis","estadunidense","Los Angeles",19);
		
		System.out.println("----Loja de móveis ----");
		pessoa1.imprimiInfo();
		System.out.println("\n\n");
		pessoa2.imprimiInfo();
		System.out.println("\n\n");
		pessoa3.imprimiInfo();

	}

}
