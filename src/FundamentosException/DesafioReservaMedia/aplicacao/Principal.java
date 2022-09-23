package FundamentosException.DesafioReservaMedia.aplicacao;

import FundamentosException.DesafioReservaMedia.modelos.entidades.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Numero do quarto: ");
        int numeroQuarto = entrada.nextInt();
        System.out.print("Data Check-in (dd/MM/yyyy):  ");
        Date checkIn = sdf.parse(entrada.next()); // SDF-parse vai converter a data de entrada do usuario
        System.out.print("Data Check-Out (dd/MM/yyyy):  ");
        Date checkOut = sdf.parse(entrada.next()); // SDF-parse vai con

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: Check-out da data deve ser posterior a data de Check-In. ");
        } else {
            Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
            System.out.println("reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com os dados atualizados da reserva: ");
            System.out.print("Data Check-in (dd/MM/yyyy):  ");
            checkIn = sdf.parse(entrada.next()); // SDF-parse vai converter a data de entrada do usuario
            System.out.print("Data Check-Out (dd/MM/yyyy):  ");
            checkOut = sdf.parse(entrada.next()); // SDF-parse vai con

            String error = reserva.atualizarData(checkIn, checkOut);
            if (error != null) {
                System.out.println("Error na reserva " + error);
            } else {
                System.out.println("reserva: " + reserva);
            }
        }
        entrada.close();
    }
}
