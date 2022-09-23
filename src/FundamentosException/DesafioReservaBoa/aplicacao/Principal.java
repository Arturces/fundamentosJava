package FundamentosException.DesafioReservaBoa.aplicacao;

import FundamentosException.DesafioReservaBoa.modelos.entidades.Reserva;
import FundamentosException.DesafioReservaBoa.modelos.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Numero do quarto: ");
            int numeroQuarto = entrada.nextInt();
            System.out.print("Data Check-in (dd/MM/yyyy):  ");
            Date checkIn = sdf.parse(entrada.next()); // SDF-parse vai converter a data de entrada do usuario
            System.out.print("Data Check-Out (dd/MM/yyyy):  ");
            Date checkOut = sdf.parse(entrada.next()); // SDF-parse vai con

            Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
            System.out.println("reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com os dados atualizados da reserva: ");
            System.out.print("Data Check-in (dd/MM/yyyy):  ");
            checkIn = sdf.parse(entrada.next()); // SDF-parse vai converter a data de entrada do usuario
            System.out.print("Data Check-Out (dd/MM/yyyy):  ");
            checkOut = sdf.parse(entrada.next()); // SDF-parse vai con

            reserva.atualizarData(checkIn, checkOut);
            System.out.println("reserva: " + reserva);
        }
        catch (ParseException e){
            System.out.println("Digitado uma data invalida");
        }
        catch (DomainException e){
            System.out.println("Error na reserva: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Erro Inesperado");
        }
        entrada.close();
    }
}
