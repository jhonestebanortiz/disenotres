package ejerciciogatopkg;

public class Gato {
	
private String name; 
private String genero;
private short edad ; 
private String color; 
private float peso; 
public Gato() {
	//TODO auto generated constructor  hub
}

public void respirar() {
	System.out.println("estoy respirando");
}
 
public void comer(String comida) {
	System.out.println("estoy comiendo "+ comida);
}

public void correr(String destino ) {
	System.out.println("estoy corriendo a "+ destino);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public short getEdad() {
	return edad;
}

public void setEdad(short edad) {
	this.edad = edad;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public float getPeso() {
	return peso;
}

public void setPeso(float peso) {
	this.peso = peso;
}

public void dormir(int horas ) {
	System.out.println("voy a dormir estas horas "+ horas);
}

public void maullar() {
	System.out.println(" miauuuuuuu");
}

}
