package adivinar;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer= new Scanner(System.in);
		
		Random rd= new Random();
		
		int aleatorio=rd.nextInt(500)+1;
		int numero=0, contador=0;
		
		while(numero!=aleatorio) {
			try {
				System.out.println("Introduce un número entre el 1 y el 500");
				numero=leer.nextInt();
				contador++;
				
				if(numero<1 || numero >500){
					throw new InputMismatchException();
				}
				if(numero>aleatorio){
					throw new Exception("El número introducido es mayor");
				}
				else if(numero<aleatorio){
					throw new Exception("El número introducido es menor");
				}else {
					throw new Exception("¡¡ACERTASTE!!"+ "\nHas utilizado "+contador+" intentos");
				}
			}catch(InputMismatchException a) {
				System.out.println("Introduce un número válido, por favor.");
				leer.next();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}

}
