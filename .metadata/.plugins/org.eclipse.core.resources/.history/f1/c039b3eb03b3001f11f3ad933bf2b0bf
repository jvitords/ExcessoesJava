package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserva {

	private Integer numeroDoQuarto;
	private Date chekIn;
	private Date chekOut;

	public Reserva() {
	}

	public Reserva(Integer numeroDoQuartoInteger, Date chekIn, Date chekOut) {
		this.numeroDoQuarto = numeroDoQuartoInteger;
		this.chekIn = chekIn;
		this.chekOut = chekOut;
	}

	public Integer getNumeroDoQuartoInteger() {
		return numeroDoQuarto;
	}

	public Date getChekIn() {
		return chekIn;
	}

	public Date getChekOut() {
		return chekOut;
	}
	
	/*public String toString() {
		
		SimpleDateFormat formatoDaDataDate = new SimpleDateFormat("dd/MM/yyyy");
		
		return "\n\n--- DADOS DA RESERVA ---\n" + 
				"\nNúmero do quarto: " +  numeroDoQuarto
				+ "\nData de CheckIn: " + chekIn
				+ "\nData de ChekOut: " + chekOut;
	}*/
	
	public void atualizarReserva(Integer numeroDoQuartoInteger, Date chekIn, Date chekOut) {
		this.numeroDoQuarto = numeroDoQuartoInteger;
		this.chekIn = chekIn;
		this.chekOut = chekOut;
	}
	
	
}
