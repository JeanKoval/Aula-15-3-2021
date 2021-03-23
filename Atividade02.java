import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.00");
		
		String nome = nome();
		
		if(nome.length() == 0) {
			System.out.println("Nome não informado. \nPrograma Encerrado!");
		}else {
			
			float saltos[] = new float[5];
			
			System.out.println("\n");
			for(int i = 0; i < 5; i++) {
				System.out.print((i+1) + "° Salto: ");
				saltos[i] = scan.nextFloat();
			}
			
			scan.close();
			
//			for(int i = 0; i < 5; i++) {
//				System.out.println((i+1) + "° Salto: " + saltos[i]);
//			}
			
			Float media = media(saltos);
			
			System.out.println("\nResultado final:");
			System.out.println("Atleta: "+ nome);
//			System.out.println("Saltos : " + saltos[0] + " - " + saltos[1] + " - " + saltos[2] + " - " + saltos[3] + " - " + saltos[4]);
			System.out.print("Saltos: ");
			for(float c : saltos) {
				System.out.print(c + "m  ");
			}
			System.out.println("\nMédia: " + f.format(media) +"m");
		}
				
		
	}//fim do main
	
	public static float media(float saltos[]){
		float media, soma = 0;

		for(int i = 0; i < 5; i++) {
			soma+= saltos[i];
		}
		
		media = soma/5;
		return media;
	}// fim do media
	
	public static String nome() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = scan.nextLine();
		
//		scan.close();
		
		return nome;		
	}

}
