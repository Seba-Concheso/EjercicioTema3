package coche;

public class Coche {
	int puertas;
	
	
	
	public  Coche() {
		puertas=2;
		
	}
	
	public  void suma_puerta() {
		puertas++;
		
	}
	public void mostrarPuertas() {

		
		System.out.print("La cantidad de puertas es:  " + puertas);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Coche miCoche = new Coche();
			miCoche.suma_puerta();
			miCoche.mostrarPuertas();
			
			
		}
		

}

