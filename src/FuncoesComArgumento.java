import java.util.Scanner;

public class FuncoesComArgumento {
	

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nomes[] = {"Joao","Tamires"};
		for(int i=0; i<nomes.length;i++) {
			Funcoes.exibirSaudacao(nomes[i]);
		}
		
		
		System.out.println("Mensagem da main antes de chamar a fun��o");
		Funcoes.exibirMensagem();
		System.out.println("Mensagem da main depois de chamar a fun��o");
		
		leitor.close();

	}

}
