package controller;

public class Controller {
	public static int contSegNum(int num, int num2) {
		int contador;
		if (num == 0) { // Condição de parada, se o número chegar a 0 após as divisões por 10
			return 0;
		} else {
			// Se o resto do número dividido por 10 for o dígito a ser buscado:
			if (num % 10 == num2) {
				// Adiciona 1 no contador e prossegue a dividir o número por 10
				return 1 + contSegNum(num / 10, num2);
			} else {
				// Prossegue a dividir o número por 10
				return contSegNum(num / 10, num2);
			}
		}
	}
}
