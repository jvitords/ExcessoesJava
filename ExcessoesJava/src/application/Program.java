package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Reserva;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner digitar = new Scanner(System.in);
		SimpleDateFormat formatoDaData = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Número do quarto: ");
			Integer numeroDoQuarto = digitar.nextInt();
			System.out.print("Data de CheckIn: ");
			Date dataDoCheckIn = formatoDaData.parse(digitar.next());
			System.out.print("Data de CheckOut: ");
			Date dataDoCheckOut = formatoDaData.parse(digitar.next());
			Reserva reserva = new Reserva(numeroDoQuarto, dataDoCheckIn, dataDoCheckOut);
			System.out.println(reserva);
		}
		
		catch(InputMismatchException stringDigitadoNoLugarDoInteger) {
			System.out.println("Número do quarto inválido: " + stringDigitadoNoLugarDoInteger);
		}
		
		catch(ParseException tentativaDeDigitarData) {
			System.out.println("Data digitada de maneira errada: " + tentativaDeDigitarData);
		}
		catch(DomainException exceptionAoInstanciarReserva) { // preciso implementar a excessão caso o checkIn seja < que o checkOut
			System.out.println("Erro ao instanciar. " + exceptionAoInstanciarReserva.getMessage());
		}
	}
}
