import java.util.Scanner;

public class Calculadora {
/* Criar as funções para soma, subtração, divisão e multiplicação.
 * Criar também uma função para exibir o resultado.
 * A digitação dos valores deve ser mantida no main.
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
		System.out.println("Realizando a subtração entre " + valor1 + " e " + valor2);
		double soma = valor1 - valor2;
		exibirResultado(soma);
	}
	
	public static void multiplicacao(double valor1, double valor2) {
		System.out.println("Realizando a multiplicação entre " + valor1 + " e " + valor2);
		double soma = valor1 * valor2;
		exibirResultado(soma);
	}
	
	public static void divisao(double valor1, double valor2) {
		System.out.println("Realizando a divisão entre " + valor1 + " e " + valor2);
		double soma = valor1 / valor2;
		exibirResultado(soma);
	}
	
	public static double pegarInput(Scanner leitor, int index) {
		System.out.print("Digite o " + index + "º valor:");
		double valor = leitor.nextDouble();
		return valor;
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2=0;
		int opcao = 0;
		
		while (opcao!=6) {
			System.out.println("\n\nPROGRAMA CALCULADORA");
			System.out.println("Escolha sua opção!");
			System.out.println("1 - Digitar valores");
			System.out.println("2 - Realizar soma");
			System.out.println("3 - Realizar subtração");
			System.out.println("4 - Realizar divisão");
			System.out.println("5 - Realizar multiplicação");
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
