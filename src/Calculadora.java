import java.util.Scanner;

public class Calculadora {
/* Criar as fun��es para soma, subtra��o, divis�o e multiplica��o.
 * Criar tamb�m uma fun��o para exibir o resultado.
 * A digita��o dos valores deve ser mantida no main.
 */
	
	public static void exibirResultado(double valor) {
		System.out.println("O resultado foi " + valor + "!");
	}
	
	public static void soma(double valor1, double valor2) {
		System.out.println("Realizando a soma entre " + valor1 + " e " + valor2);
		double soma = valor1 + valor2;
		exibirResultado(soma);
	}
	
	public static void subtracao(double valor1, double valor2) {
		System.out.println("Realizando a subtra��o entre " + valor1 + " e " + valor2);
		double soma = valor1 - valor2;
		exibirResultado(soma);
	}
	
	public static void multiplicacao(double valor1, double valor2) {
		System.out.println("Realizando a multiplica��o entre " + valor1 + " e " + valor2);
		double soma = valor1 * valor2;
		exibirResultado(soma);
	}
	
	public static void divisao(double valor1, double valor2) {
		System.out.println("Realizando a divis�o entre " + valor1 + " e " + valor2);
		double soma = valor1 / valor2;
		exibirResultado(soma);
	}
	
	public static double pegarInput(Scanner leitor, int index) {
		System.out.print("Digite o " + index + "� valor:");
		double valor = leitor.nextDouble();
		return valor;
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2=0;
		int opcao = 0;
		
		while (opcao!=6) {
			System.out.println("\n\nPROGRAMA CALCULADORA");
			System.out.println("Escolha sua op��o!");
			System.out.println("1 - Digitar valores");
			System.out.println("2 - Realizar soma");
			System.out.println("3 - Realizar subtra��o");
			System.out.println("4 - Realizar divis�o");
			System.out.println("5 - Realizar multiplica��o");
			System.out.println("6 - Sair");
			System.out.print("Opt: ");
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				valor1 = pegarInput(leitor,1);
				valor2 = pegarInput(leitor,2);
				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados");          
				break;
			case 2:
				soma(valor1,valor2);
				break;
			case 3:
				subtracao(valor1,valor2);
				break;
			case 4:
				divisao(valor1,valor2);
				break;
			case 5:
				multiplicacao(valor1,valor2);
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
	}

}
