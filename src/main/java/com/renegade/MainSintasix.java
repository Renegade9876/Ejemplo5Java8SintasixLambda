package com.renegade;

public class MainSintasix {

	
	public void probarSintasix(){
		
		// Defino la implementaci�n del m�todo de la interface y luego la utilizo.
		OperacionCalcularDoble operacion = (double cantidad) -> cantidad*2;
		double resultado = operacion.calcularDoble(10);
		System.out.println("RESULTADO = "  + resultado);
		
		// Defino la implementaci�n del m�todo de la interface y luego la utilizo.
		// Ojo! que puedo utilizar llaves y devolver
		OperacionCalcularDoble operacion2 = (double cantidad) -> { return cantidad*2; };
		double resultado2 = operacion2.calcularDoble(10);
		System.out.println("RESULTADO2 = "  + resultado2);
		
		// Defino la implementaci�n del m�todo de la interface y luego la utilizo.
		// Ojo! que puedo utilizar llaves y devolver
		// Y por fines demostrativos, vemos como dentro de las llaves se puden meter m�s operaciones
		OperacionCalcularDoble operacion3 = (double cantidad) -> { 	cantidad=cantidad*2; 
																	System.out.println("CANTIDAD = "+cantidad); 
																	return cantidad*2; 
																	};
		
		double resultado3 = operacion3.calcularDoble(10);
		System.out.println("RESULTADO3 = "  + resultado3);
		
		// Defino la implementaci�n del m�todo de la interface y luego la utilizo.
		// Y adem�s la definici�n de los tipos de los par�metros no es necesario porque el compilador lo soluciona.
		OperacionCalcularDoble operacion4 = (cantidad) -> cantidad*2;
		double resultado4 = operacion4.calcularDoble(10);
		System.out.println("RESULTADO4 = "  + resultado4);

		// Defino la implementaci�n del m�todo de la interface y luego la utilizo.
		// Ojo! que en este caso el m�todo no necesita par�metros y en la expresi�n Lambda lo expreso como '()'
		OperacionRetornarCero operacion5 = () -> 0;
		int resultado5 = operacion5.retornarCero();
		System.out.println("RESULTADO5 = "  + resultado5);
	
		// Defino la implementaci�n del m�todo de la interface y luego la utilizo.
		// Ojo! que en este caso el m�todo no necesita par�metros y en la expresi�n Lambda lo expreso como '()'
		// Tambi�n aprobecho la implementaci�n para hacer algo m�s
		OperacionRetornarCero operacion6 = () -> {
													int x = 5;
													int y = 5;
													System.out.println("X="+x+", Y="+y);
													return 0;
													};
		int resultado6 = operacion6.retornarCero();
		System.out.println("RESULTADO6 = "  + resultado6);

		
	}
	
	
	public static void main(String[] args) {

		MainSintasix main = new MainSintasix();
		main.probarSintasix();
		
		
	}

}
