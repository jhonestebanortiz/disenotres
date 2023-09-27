/**
 * 
 */
package ejerciciogatopkg;

public class Ejerciciogato {


	public Ejerciciogato() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Gato miGato=new Gato();
		miGato.setName("Michi");
		miGato.maullar();
		miGato.dormir(2);
		miGato.correr("pasto");
		miGato.comer("carne");
		System.out.println("El nombre de mi gato es "+ miGato.getName());
	}

}
