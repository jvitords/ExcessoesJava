package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.exceptions.DomainException;

public class Reserva {

	private Integer numeroDoQuarto;
	private Date chekIn;
	private Date chekOut;

	public Reserva() {
	}

	public Reserva(Integer numeroDoQuartoInteger, Date chekIn, Date chekOut) {
		if (!chekOut.after(chekIn)) {
			throw new DomainException("A data de CheckOut deve ser depois do CheckIn!");
		}
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

	public void atualizarReserva(Integer numeroDoQuartoInteger, Date chekIn, Date chekOut) {
		if (chekIn.before(this.chekIn) || chekOut.before(this.chekOut)) {
			throw new DomainException("As datas devem ser posterior as datas já reservadas!");
		}
		if (!chekIn.after(chekOut)) {
			throw new DomainException("A data de CheckOut deve ser depois do CheckIn!");
		}

		this.numeroDoQuarto = numeroDoQuartoInteger;
		this.chekIn = chekIn;
		this.chekOut = chekOut;
	}

	public String toString() {

		SimpleDateFormat formatoDaDataDate = new SimpleDateFormat("dd/MM/yyyy");

		return "\n\n--- DADOS DA RESERVA ---\n" + 
				"\nNúmero do quarto: " + numeroDoQuarto 
				+ "\nData de CheckIn: " + formatoDaDataDate.format(chekIn) + 
				"\nData de ChekOut: " + formatoDaDataDate.format(chekOut);
	}
}
