
public class TestaBanco {

	public static void main(String[] args) {
		Cliente emanuel = new Cliente();
		emanuel.nome = "Emanuel S Pedrozo";
		emanuel.cpf = "111.111.111-11";
		emanuel.profissao = "Programador";
		
		Conta contaEmanuel = new Conta();
		contaEmanuel.deposita(100);
		
		//associa o cliente emanuel a conta contaEmanuel
		contaEmanuel.titular = emanuel;
		System.out.println(contaEmanuel.titular.nome);
	}
}
