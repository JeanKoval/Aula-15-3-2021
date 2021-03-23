import java.util.Scanner; // 

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("Digite um valor: ");
		Double num1 = scan.nextDouble();
		
		System.out.println("Digite outro valor: ");
		Double num2 = scan.nextDouble();		
		
		System.out.println("Opções:");
		System.out.println("1 - Soma;");
		System.out.println("2 - Subtração;");
		System.out.println("3 - Multiplicação;");
		System.out.println("4 - Divisão;");
		System.out.println("Digite a opção de sua escolha: ");
		int escolha = scan.nextInt();
		
		scan.close();
		
		System.out.println("Operando sobre os números " + num1 + " e " + num2 + ", temos o seguinte resultado:");
		
		switch(escolha){
			case 1:
				Calculadora.soma(num1, num2);
			break;
			case 2:
				Calculadora.subtracao(num1, num2);
			break;
			case 3:
				Calculadora.multiplicacao(num1, num2);
			break;
			case 4:
				Calculadora.divisao(num1, num2);
			break;
			default:
				System.out.println("Opção invalida. \nPrograma encerrado!");
		}
	}
	
	public static void soma(Double n1, Double n2) {
		Double soma = n1 + n2;
		System.out.println("SOMA: " + soma);
	}
	
	public static void subtracao(Double n1, Double n2) {
		Double subtracao = n1 - n2;
		System.out.println("SUBTRAÇÃO: " + subtracao);
	}
	
	public static void multiplicacao(Double n1, Double n2) {
		Double multiplicacao = n1 * n2;
		System.out.println("MULTIPLICAÇÃO: " + multiplicacao);
	}
	
	public static void divisao(Double n1, Double n2) {
		Double divisao = n1 / n2;
		System.out.println("DIVISÃO: " + divisao);
	}

}
