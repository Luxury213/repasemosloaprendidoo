package revisemosloaprendidor;

import java.util.Scanner;

public class Main {
	public static double cantidad1;
	public static double cantidad2;
	public static double retirar1;
	public static double retirar2;
	public static double dineroinicial;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el dinero inicial");
	dineroinicial = sc.nextDouble();
	System.out.println("Ingrese la cantidad 1");
	cantidad1 = sc.nextDouble();
	System.out.println("Ingrese el dinero inicial");
	dineroinicial = sc.nextDouble();
	System.out.println("Ingrese la cantidad 1");
	cantidad2 = sc.nextDouble();
	Cuenta c1 = new Cuenta("Luis De Avila");
	Cuenta c2 = new Cuenta ("Lucho", dineroinicial);
	
	c1.ingresar(cantidad1);
	c2.ingresar(cantidad2);
	
	System.out.println("Ingrese la retirada 1");
	retirar1 = sc.nextDouble();
	System.out.println("Ingrese la retirada 2");
	retirar2 = sc.nextDouble();
	
	c1.retirar(retirar1);
	c2.retirar(retirar2);
	System.out.println(c1);
	System.out.println(c2);
}
}
