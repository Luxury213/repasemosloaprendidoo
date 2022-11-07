package revisemosloaprendidor;

public class Persona {
private String nombre;
private int edad;
private String DNI;
private char sexo;
private double peso;
private double altura;

private final static char Sexodefinido = 'H';
public final static int infrapeso = -1;
public final static int pesomoderado = 0;
public static final int sobrepeso = 1;
Persona() {

}
Persona(String nombre, int edad, char sexo) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	sexo = sexo;
}
Persona(String nombre, int edad, char sexo, double peso, double altura) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	sexo = sexo;
	this.peso = peso;
	this.altura = altura;
}
private void comprobrarsusexo() {
if(sexo!= 'H' && sexo != 'M' ) {
    this.sexo = Sexodefinido ;
}


}
private void generarDni() {
    final int divisor = 23;

    
    int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
    int res = numDNI - (numDNI / divisor * divisor);

    
    char letraDNI = generaLetraDNI(res);

    
    DNI = Integer.toString(numDNI) + letraDNI;
}
private char generaLetraDNI(int res) {

	return 0;
}
private char generaLetraDNI1(int res) {
    char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
        'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
        'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    return letras[res];
}

public void setNombre(String nombre) {
	this.nombre = nombre;
;
}
public void setEdad(int edad) {
	this.edad = edad;

}
public void setSexo(char sexo) {
	this.sexo = sexo;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public void setAltura(double altura) {
	this.altura = altura;
}

public int calcularimc() {
	
	double PesoParaimprimir = peso / (Math.pow(altura, 2));
	if (PesoParaimprimir >= 20 && PesoParaimprimir <= 25) {
        return pesomoderado;
    } else if (PesoParaimprimir < 20) {
        return infrapeso;
    } else {
        return sobrepeso;
    }

}
public boolean SiEsMayorDeEdad() {
    boolean mayor = false;
    if (edad >= 18) {
        mayor = true;
    }
    return mayor;
}
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
			+ ", altura=" + altura + "]";
}


}