package Client;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Bhaskara bhaskara = new Bhaskara();
		ClienteTCP clienteTCP = new ClienteTCP();
		Scanner scanner = new Scanner(System.in);
        
		System.out.println("Digite o valor de A:");
		bhaskara.setA(scanner.nextDouble());
		System.out.println("Digite o valor de B:");
		bhaskara.setB(scanner.nextDouble());
		System.out.println("Digite o valor de C:");
		bhaskara.setC(scanner.nextDouble());
		bhaskara.setFim(true);
		
		bhaskara = clienteTCP.enviarDados(bhaskara);
		if(bhaskara.isMenorOuIgualZero()){
			System.out.println("Não é possivel calcular essa equaçao!");
		} 
		else
		{
			System.out.println("Valor de X1: " + bhaskara.getX1());
			System.out.println("Valor de X2: " + bhaskara.getX2());
		}
		
	}
}
