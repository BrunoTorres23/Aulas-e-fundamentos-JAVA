
public class main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa(); // Instanceando objeto (ou criando) no caso "pessoa1"

		pessoa1.nome = "Bruno";
		pessoa1.Numfigurinhas = 4;

		pessoa1.receber(0);

		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.Numfigurinhas);

		Pessoa pessoa2 = new Pessoa();

		pessoa2.nome = "Gomes";
		pessoa2.Numfigurinhas = 5;

		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.Numfigurinhas);

		boolean retorno = pessoa1.dar(1, pessoa2);

		if (retorno == true) {
		}
		pessoa1.dar(5, pessoa2);
		
		System.out.println("Atual valor");

		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.Numfigurinhas);

		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.Numfigurinhas);

	}

}
