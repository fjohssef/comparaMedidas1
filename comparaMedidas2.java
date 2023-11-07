package metodos;

import java.util.Scanner;

public class fabricaHierro {
	public static Scanner teclado= new Scanner(System.in);
	
	public static void main(String[] args) {
		/*Una planta que fabrica perfiles de hierro posee un lote de n piezas. Confeccionar
		un programa que pida ingresar por teclado la cantidad de piezas a procesar y luego
		ingrese la longitud de cada perfil; sabiendo que la pieza cuya longitud esté
		comprendida en el rango de 1,20 y 1,30 son aptas. Imprimir por pantalla la cantidad de
		piezas aptas que hay en el lote.
		Realizar el ejercicio dividido en los siguientes métodos
		a) ingresarNumero: Nos permitirá meter un número entero por el teclado que va
		a representar el número de piezas a procesar. Este número debe devolverse al
		método principal.
		b) ingresarLongitud: Nos permitirá ingresar la longitud de cada pieza y
		devolvérsela al método principal.
		c) comprobarAptas: Comprobará por cada pieza si es apta y devolverá el
		resultado al método principal (debe devolver un boolean).
		d) imprimir: Permitirá sacar por pantalla el número de piezas que fueron aptas.
		e) main: Servirá de interfaz. Controlará el final del programa y llamará a los
		métodos.*/
		
		int num=ingresarNumero();
		double longitud=0;
		double longi=0;
		for (int i = 1; i <= num; i++) {
			longitud=ingresarLongitud();
			longi= comprobarAptas(longitud)+longi;
		}
		sacarResultado(longi);
	}
	public static int ingresarNumero() {
     
        System.out.print("Ingrese la cantidad de piezas: ");
        int nume=teclado.nextInt();
        return nume;
    }
	public static double ingresarLongitud() {
			System.out.print("Ingrese la longitud : ");
	        double longitud=teclado.nextDouble();
	        return longitud;
	    
	}
	public static double comprobarAptas(double longitud) {
		int cant=0;
				if ((longitud>=1.2) && (longitud<=1.3)) {
					cant=cant+1;
				}
			return cant;
	    }
	public static double sacarResultado(double numer) {
    	System.out.println("Las piezas entre el rango de 1.20 y 1.30 son= "+ numer);
		return numer;
    	}

}