package FundamentosException.DesafioReservaRuim.aplicacao;

import FundamentosException.DesafioReservaRuim.modelos.entidades.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Numero do quarto: ");
        int numero = entrada.nextInt();
        System.out.print("Data Check-in (dd/MM/yyyy):  ");
        Date checkIn = sdf.parse(entrada.next()); // SDF-parse vai converter a data de entrada do usuario
        System.out.print("Data Check-in (dd/MM/yyyy):  ");
        Date checkOut = sdf.parse(entrada.next()); // SDF-parse vai con

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: Check-out da data deve ser posterior a data de Check-In. ");
        } else {
            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com os dados atualizados da reserva: ");
            System.out.print("Data Check-in (dd/MM/yyyy):  ");
            checkIn = sdf.parse(entrada.next()); // SDF-parse vai converter a data de entrada do usuario
            System.out.print("Data Check-Out (dd/MM/yyyy):  ");
            checkOut = sdf.parse(entrada.next()); // SDF-parse vai con

            Date agora = new Date();
            if (checkIn.before(agora) || checkOut.before(agora)) {
                System.out.println("Erro na reserva: as datas de reserva para atualização devem ser datas futura");
            } else if (!checkOut.after(checkIn)) {
                System.out.println("Erro na reserva: Check-out da data deve ser posterior a data de Check-In. ");
            } else {
                reserva.atualizarData(checkIn, checkOut);
                System.out.println("reserva: " + reserva);
            }

        }
        entrada.close();
    }
}
