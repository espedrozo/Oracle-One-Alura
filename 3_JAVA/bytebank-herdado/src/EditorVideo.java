
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("metodo de boni editor de video");
		return super.getBonificacao() + 100;
	}
	
}
