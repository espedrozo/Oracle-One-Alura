
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaEmanuel = new Conta();
		contaEmanuel.saldo = 100;
		contaEmanuel.deposita(50);
		System.out.println(contaEmanuel.saldo);
		boolean conseguiuRetirar = contaEmanuel.saca(20);
		System.out.println(contaEmanuel.saldo);
		
		System.out.println(conseguiuRetirar);
		
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaMarcela.transfere(300, contaEmanuel);
		
		if(sucessoTransferencia) {
			System.out.println("transferência realizada com sucesso");
		} else {
			System.out.println("falha, falta de saldo");
		}
		System.out.println(contaMarcela.saldo);
		System.out.println(contaEmanuel.saldo);
		
		contaEmanuel.titular = "Emanuel S Pedrozo";
		System.out.println(contaEmanuel.titular);
	}
}
