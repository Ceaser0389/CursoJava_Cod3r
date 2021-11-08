package desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int quantidadeNotas = 0;
	double nota = 0;
	double total = 0;
	
	
	while (nota != 1) {
		
		System.out.println("Informe a nota:");
		nota = sc.nextDouble();
		
		if (nota <= 10 &&  nota >=0) {
			total += nota;
			quantidadeNotas++;
		}else if(nota != -1){
			System.out.println("Nota inv�lida !!!");
		}
	}
	
	
	// calcula a m�dia 
	
	double media = total /quantidadeNotas;
	System.out.println("M�dia = " + media);
	
	sc.close();


	}

}