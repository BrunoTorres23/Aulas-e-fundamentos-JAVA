package area;

public class areaResul {

	public static void main(String[] args) {
		
		//scanner para o usuario escrever os numeros a ser calculado
		Scanner scanner = new Scanner(System.in);
		Calculos calculos = new Calculos();
		
		System.out.println("Calculadora area de formas:"); // syso padrao
		System.out.println("digite a medida da largura: ");
		int x = scanner.nextInt(); // scanner para a variavel x
		
		System.out.println("digite a medida da altura: ");
		int y = scanner.nextInt(); // scanner para a variavel y
		
		
		if(x == y) { // formula se e senão
		int area = calculos.area(x);
				System.out.println("A area do seu quadrado é de: " + area + "cm");
		}
		
		else if (x != y){
		int area = calculos.area(x, y);
				System.out.println("A area do seu retangulo é de: " + area + "cm");
		}
		
		else if (x != int){
		double area = calculos.area(x, y);
				System.out.println("A area do seu triangulo é de: " + area + "cm");
		}
	}

	}

}
