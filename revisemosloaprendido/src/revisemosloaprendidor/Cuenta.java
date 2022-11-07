package revisemosloaprendidor;

public class Cuenta {
public String titular;
public double cantidad;


Cuenta(String titular) {
	
	this.titular = titular;
}


Cuenta(String titular, double cantidad) {
	if(cantidad < 0) {
		cantidad = 0;
		
	}else {
		this.cantidad = cantidad;
	this.titular = titular;
}



}


public String getTitular() {
	return titular;
}


public void setTitular(String titular) {
	this.titular = titular;
}


public double getCantidad() {
	return cantidad;
}


public void setCantidad(double cantidad) {
	this.cantidad = cantidad;
}

public void ingresar (double cantidad) {
if (cantidad < 0) {
	this.cantidad =+ cantidad;

}

}
public void retirar(double cantidad) {
	
	if (this.cantidad - cantidad < 0) {
		this.cantidad = 0;
}else {
	
	this.cantidad =- cantidad;
}
	
}


@Override
public String toString() {
	return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
}
}