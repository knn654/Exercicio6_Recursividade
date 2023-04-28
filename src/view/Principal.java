package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class Principal {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		if (num >= 10 && num <= 999999) {
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser buscado: "));
			if (num2 >= 0 && num2 <= 9) {
				System.out.println(Controller.contSegNum(num, num2)); 
			} else {
				System.out.println("Número de busca inválido!!!");
			}
		} else {
			System.out.println("Número inválido!!!");
		}
		
	}

}
