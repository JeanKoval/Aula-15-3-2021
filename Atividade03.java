import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.00");
		DecimalFormat i = new DecimalFormat("0");
		
		Float cand1=0f, cand2=0f, cand3=0f, cand4=0f, cand5=0f, cand6=0f, total=0f;
		Integer escolha=0, voto=1;
		Float	percentNulo=0f, percentBranco=0f;
	
		do {
			do {
				
				if(voto < 1 || voto > 6) {
					System.out.println("\nVOTO INVÁLIDO, TENTE NOVAMENTE!\n");
				}
				System.out.println("CANDIDATOS PARA PRESIDENCIA:");
				System.out.println("1 - LULA");
				System.out.println("2 - BOLSONARO");
				System.out.println("3 - DILMA");
				System.out.println("4 - HADDAD");
				System.out.println("5 - VOTO EM BRANCO");
				System.out.println("6 - VOTO NULO");
				System.out.print("Digite seu voto aqui: ");
				voto = scan.nextInt();
			}while(voto < 1 || voto > 6);
			
			switch(voto) {
				case 1:
					cand1+=1;					
				break;
				case 2:
					cand2+=1;
				break;
				case 3:
					cand3+=1;
				break;
				case 4:
					cand4+=1;
				break;
				case 5:
					cand5+=1;
				break;
				case 6:
					cand6+=1;
				break;
					
			}
			
			total+=1;
			
			System.out.print("Deseja votar novamente? Se sim digite 1, se não digite 0: ");
			escolha = scan.nextInt();
			
		} while(escolha != 0);
		
		percentNulo = percentual(cand5, total);
		percentBranco = percentual(cand6, total);
		
		System.out.println("\nAPURAÇÃO DOS VOTOS: \n");
		System.out.println("LULA: " + i.format(cand1));
		System.out.println("BOLSONARO: " + i.format(cand2));
		System.out.println("DILMA: " + i.format(cand3));
		System.out.println("HADDAD: " + i.format(cand4));
		System.out.println("VOTOS NULOS: " + i.format(cand5));
		System.out.println("VOTOS EM BRANCO: " + i.format(cand6));
		System.out.println("PORCENTAGEM DE NULOS: " + f.format(percentNulo));
		System.out.println("PORCENTAGEM DOS BRANCOS: " + f.format(percentBranco));		

	}
	
	public static Float percentual(Float qtdVotos, Float totalVotos) {
		Float resultado;
		
		qtdVotos = qtdVotos*100;
		
		resultado = qtdVotos/totalVotos;
		
		return resultado;
	}

}
