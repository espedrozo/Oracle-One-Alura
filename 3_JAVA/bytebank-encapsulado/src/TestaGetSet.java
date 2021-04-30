
public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 246664);
		//conta.numero = 1337; - usar metodo (parecido com function)
		//conta.setNumero(1337); - não precisa mais esses dois pq ja foi setado no construtor.
		System.out.println(conta.getNumero());
		
		Cliente emanuel = new Cliente();
		//conta.titular = emanuel;
		emanuel.setNome("Emanuel Pedrozo");
		
		conta.setTitular(emanuel);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
		// agora em duas linhas:
		
		Cliente titularConta = conta.getTitular();
		titularConta.setProfissao("programador");
		
		System.out.println(titularConta);
		System.out.println(emanuel);
		System.out.println(conta.getTitular());
	}
}
