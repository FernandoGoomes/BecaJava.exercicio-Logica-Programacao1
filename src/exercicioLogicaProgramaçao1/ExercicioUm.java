package exercicioLogicaProgramaçao1;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a quantidade de meses: ");
		int qtdMeses = scanner.nextInt();
		int qtdDias = 30 * qtdMeses;
		
		System.out.println(qtdMeses + " meses possui " + qtdDias + " Dias" );
		
		scanner.close();
	}

}
