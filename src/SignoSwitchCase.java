import java.util.Scanner;

public class SignoSwitchCase {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int dia;
		int mes;
		String signo = "";
		String planeta = "";

		System.out.printf("Entre com o dia do seu nascimento:\n");
		dia = teclado.nextInt();

		System.out.printf("Entre com o mes do nascimento:\n");
		mes = teclado.nextInt();

		switch (mes) {
		case 1: {
			if (dia >= 1 && dia <= 20) {
				signo = "Capricornio";
				planeta = "Saturno";
			} else {
				signo = "Aquario";
				planeta = "Urano";
			}
			break;
		}
		case 2: {
			if (dia >= 1 && dia <= 19) {
				signo = "Aquario";
				planeta = "Urano";
			} else {
				signo = "Peixes";
				planeta = "Netuno";
			}
			break;
		}
		case 3: {
			if (dia >= 1 && dia <= 20) {
				signo = "Peixes";
				planeta = "Netuno";
			} else {
				signo = "Aries";
				planeta = "Marte";
			}
			break;
		}
		case 4: {
			if (dia >= 1 && dia <= 20) {
				signo = "Aries";
				planeta = "Marte";
			} else {
				signo = "Touro";
				planeta = "Venus";
			}
			break;
		}
		case 5: {
			if (dia >= 1 && dia <= 20) {
				signo = "Touro";
				planeta = "Venus";
			} else {
				signo = "Gemeos";
				planeta = "Mercurio";
			}
			break;
		}
		case 6: {
			if (dia >= 1 && dia <= 20) {
				signo = "Gemeos";
				planeta = "Mercurio";
			} else {
				signo = "Cancer";
				planeta = "Lua";
			}
			break;
		}
		case 7: {
			if (dia >= 1 && dia <= 21) {
				signo = "Cancer";
				planeta = "Lua";
			} else {
				signo = "Leao";
				planeta = "Sol";
			}
			break;
		}
		case 8: {
			if (dia >= 1 && dia <= 22) {
				signo = "Leao";
				planeta = "Sol";
			} else {
				signo = "Virgem";
				planeta = "Mercurio";
			}
			break;
		}
		case 9: {
			if (dia >= 1 && dia <= 22) {
				signo = "Virgem";
				planeta = "Mercurio";
			} else {
				signo = "Libra";
				planeta = "Venus";
			}
			break;
		}
		case 10: {
			if (dia >= 1 && dia <= 22) {
				signo = "Libra";
				planeta = "Venus";
			} else {
				signo = "Escorpiao";
				planeta = "Marte";
			}
			break;
		}
		case 11: {
			if (dia >= 1 && dia <= 21) {
				signo = "Escorpiao";
				planeta = "Marte";
			} else {
				signo = "Sagitario";
				planeta = "Jupiter";
			}
			break;
		}
		case 12: {
			if (dia >= 1 && dia <= 21) {
				signo = "Sagitario";
				planeta = "Jupiter";
			} else {
				signo = "Capricornio";
				planeta = "Saturno";
			}
		}
			break;
		default:System.err.println("Erro ao digitar o mês");
		}
				System.out.println("Signo/Planeta:" + " " + signo + "/" + planeta);
		teclado.close();
	}

}
