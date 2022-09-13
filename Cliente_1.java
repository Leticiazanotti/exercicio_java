package Teste_;

public class Cliente_1 {
	//classe cliente,os atributos e métodos referentes esta classe.
	
	private String nomeCliente;
	private String nacionalidade;
	private String cidade;
	private int idade;
	
	public Cliente_1(String nomeCliente,String nacionalidade, String cidade, int idade) {
		
		this.nomeCliente = nomeCliente;
		this.nacionalidade = nacionalidade;
		this.cidade = cidade;
		this.idade = idade;
	}
			
		
		public String getNomeCliente() {
			return nomeCliente;
		}
		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public void imprimiInfo() {
			System.out.println("\nNome do cliente: "+nomeCliente);
			System.out.println("\nQual sua nacionalidade? "+nacionalidade);
			System.out.println("\nQual sua cidade? "+cidade);
			System.out.println("\nQual sua idade? "+idade);
		}
	
}
