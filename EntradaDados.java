import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		Integer num1 = scan.nextInt();
		
		System.out.println("Digite outro valor: ");
		Integer num2 = scan.nextInt();
		
//		Float testeF = scan.nextFloat();
//		Double testeD = scan.nextDouble();		
//		System.out.println("F = " + testeF);
//		System.out.println("D = " + testeD);
		
		scan.next();
		String nome = scan.nextLine();
		System.out.println("olá " + nome);
		
		scan.close();
		
		Integer soma = soma(num1, num2);
		
		System.out.println("O soma entre "+num1+" e "+num2+" é igual a "+soma);		
		
	}// fim do main
	
	public static Integer soma(Integer n1, Integer n2) {
		return n1 + n2; 
	} // fim do soma

}// fim do class
