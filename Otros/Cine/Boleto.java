package Otros.Cine;

import java.time.LocalDateTime;

import Ejercicios_10.cuarta_seana_agosto.Cine.Funcion;

public class Boleto {
    int nroBoleto;
	int butaca;
	double precio;
	String nit;
	String nombre;
	LocalDateTime fechaHoraVenta;
	Funcion funcion;
	public Boleto(int nroBoleto, int butaca, double precio, String nit, String nombre,
			Funcion funcion) {
		this.nroBoleto = nroBoleto;
		this.butaca = butaca;
		this.precio = precio;
		this.nit = nit;
		this.nombre = nombre;
		this.fechaHoraVenta = LocalDateTime.now();
		this.funcion = funcion;
	}
	public int getNroBoleto() {
		return nroBoleto;
	}
	public void setNroBoleto(int nroBoleto) {
		this.nroBoleto = nroBoleto;
	}
	public int getButaca() {
		return butaca;
	}
	public void setButaca(int butaca) {
		this.butaca = butaca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDateTime getFechaHoraVenta() {
		return fechaHoraVenta;
	}
	public void setFechaHoraVenta(LocalDateTime fechaHoraVenta) {
		this.fechaHoraVenta = fechaHoraVenta;
	}
	public Funcion getFuncion() {
		return funcion;
	}
	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}
	@Override
	public String toString() {
		return "nro" + nroBoleto + "\t" +funcion+"\tB"+ butaca + "\tBs" + precio + "\t" + nit
				+ " " + nombre + "\t" + 
				fechaHoraVenta.getDayOfMonth()+"/"+fechaHoraVenta.getMonthValue()+" "+
				fechaHoraVenta.getHour()+":"+fechaHoraVenta.getMinute();
	}
}
