
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;  // cabe 32bits
		System.out.println(valor);
		
		long numeroGrande = 1216541345457498612l;  //cabe de 64bits
		short valorPequeno = 21010; //cabe de 16bits
		byte b = 127; //só vai até 127
		float pontoFlutuante = 3.14f; //f no final dizer que é float - cabe 32bit e 3.14 é 64bits.
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
	}
}
