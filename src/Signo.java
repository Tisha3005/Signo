
import java.util.Scanner;

public class Signo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int dia;
		int mes;
		
		System.out.printf("Dia do seu nascimento?\n");
		dia = teclado.nextInt();

		System.out.printf("Mes do seu nascimento (em formato numerico)?\n");
		mes = teclado.nextInt();

		
		if (((mes == 1) && (dia >= 21) && (dia <= 30)) || ((mes == 2) && (dia >= 1) && (dia <= 19))) {
			System.out.printf(
					"Seu signo eh: " + "Aquario".toUpperCase() + " e " + "seu planeta eh: " + "Urano".toUpperCase());

		} else if (((mes == 2) && (dia >= 20) && (dia <= 30)) || ((mes == 3) && (dia >= 1) && (dia <= 20))) {
			System.out.printf(
					"Seu signo eh: " + "Peixe".toUpperCase() + " e " + "seu planeta eh: " + "Netuno".toUpperCase());

		} else if (((mes == 3) && (dia >= 21) && (dia <= 31)) || ((mes == 4) && (dia >= 1) && (dia <= 20))) {
			System.out.printf(
					"Seu signo eh: " + "Aries".toUpperCase() + " e " + "seu planeta eh: " + "Marte".toUpperCase());

		} else if (((mes == 4) && (dia >= 21) && (dia <= 30)) || ((mes == 5) && (dia >= 1) && (dia <= 20))) {
			System.out.printf(
					"Seu signo eh: " + "Touro".toUpperCase() + " e " + "seu planeta eh: " + "Venus".toUpperCase());

		} else if (((mes == 5) && (dia >= 21) && (dia <= 30)) || ((mes == 6) && (dia >= 1) && (dia <= 20))) {
			System.out.printf(
					"Seu signo eh: " + "Gemeos".toUpperCase() + " e " + "seu planeta eh: " + "Mercurio".toUpperCase());

		} else if (((mes == 6) && (dia >= 21) && (dia <= 30)) || ((mes == 7) && (dia >= 1) && (dia <= 21))) {
			System.out.printf(
					"Seu signo eh: " + "CAncer".toUpperCase() + " e " + "seu planeta eh: " + "Lua".toUpperCase());

		} else if (((mes == 7) && (dia >= 21) && (dia <= 30)) || ((mes == 8) && (dia >= 1) && (dia <= 22))) {
			System.out
					.printf("Seu signo eh: " + "Leao".toUpperCase() + " e " + "seu planeta eh: " + "Sol".toUpperCase());

		} else if (((mes == 8) && (dia >= 23) && (dia <= 30)) || ((mes == 9) && (dia >= 1) && (dia <= 22))) {
			System.out.printf(
					"Seu signo eh: " + "Virgem".toUpperCase() + " e " + "seu planeta eh: " + "Mercurio".toUpperCase());

		} else if (((mes == 9) && (dia >= 23) && (dia <= 30)) || ((mes == 10) && (dia >= 1) && (dia <= 22))) {
			System.out.printf(
					"Seu signo eh: " + "Libra".toUpperCase() + " e " + "seu planeta eh: " + "Venus".toUpperCase());

		} else if (((mes == 10) && (dia >= 23) && (dia <= 30)) || ((mes == 11) && (dia >= 1) && (dia <= 21))) {
			System.out.printf("Seu signo eh: " + "Escorpiao".toUpperCase() + " e " + "seu planeta eh: "
					+ "Marte".toUpperCase());

		} else if (((mes == 11) && (dia >= 22) && (dia <= 30)) || ((mes == 12) && (dia >= 1) && (dia <= 21))) {
			System.out.printf(
					"Seu signo eh: " + "Sagitario".toUpperCase() + " e " + "seu planeta eh: " + "Jupiter".toUpperCase());

		} else if (((mes == 12) && (dia >= 22) && (dia <= 30)) || ((mes == 1) && (dia >= 1) && (dia <= 20))) {
			System.out.printf("Seu signo eh: " + "Capricornio".toUpperCase() + " e " + "seu planeta eh: "
					+ "Saturno".toUpperCase());	
		}
		teclado.close();	
	}
}
