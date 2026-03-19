package automotriz;

import java.util.ArrayList;
import java.util.List;

public class Auto {
	
	private String marca;
	private int modelo;
	private Motor motor;
	private Cliente cliente;
	private List<Llanta> listaLlantas;
	
	
	
	
	public Auto(String marca, int modelo, Cliente cliente) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cliente = cliente;
		
		
		
	}
	
	
	
	public void agregarLlanta(Llanta llanta) {
		this.listaLlantas.add(llanta)
		;
	}

	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getModelo() {
		return modelo;
	}



	public void setModelo(int modelo) {
		this.modelo = modelo;
	}



	public Motor getMotor() {
		return motor;
	}



	public void setMotor(Motor motor) {
		this.motor = motor;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public List<Llanta> getListaLlantas() {
		return listaLlantas;
	}



	public void setListaLlantas(List<Llanta> listaLlantas) {
		this.listaLlantas = listaLlantas;
	}

	@Override
	public String toString() {
		return "Propietario del Vehiculo" + this.cliente + "Marca del auto:" + this.marca + " Modelo:" + this.modelo 
				+ " Motor:" + this.motor + " Referencia de Llantas:" + this.listaLlantas;
	}
	
	
	
}
