
public class Fusca implements Carro {

	
	//override de fusca que implementa carro
	@Override
	public void virarEsquerda() {
		System.out.println("Fusca virou a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Fusca virou a direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Fusca acelerou");
		
	}

	@Override
	public void Abrirporta() {
		System.out.println("Fusca abriu a porta");
		
	}
	
}
