package revisemosloaprendidor;

import java.util.Scanner;

public class Ejecutable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el nombre");
    String nombre = sc.next();

    System.out.println("Introduce la edad");
    int edad = sc.nextInt();

    System.out.println("Introduce el sexo");
    char sexo = sc.next().charAt(0);

    System.out.println("Introduce el peso");
    double peso = sc.nextDouble();

    System.out.println("Introduce la altura");
    double altura = sc.nextDouble();

Persona p1 = new Persona ();
Persona p2 = new Persona ( "Luis Alberto", 18,'H');
Persona p3 = new Persona ("Lucho", 18, 'H',100,1.90);

}
public static void MuestraMensajePeso(Persona p) {
    int IMC = p.calcularimc();
    switch (IMC) {
        case Persona.pesomoderado:
            System.out.println("La persona esta en su peso ideal");
            break;
        case Persona.infrapeso:
            System.out.println("La persona esta por debajo de su peso ideal");
            break;
        case Persona.sobrepeso:
            System.out.println("La persona esta por encima de su peso ideal");
            break;
    }




}

}