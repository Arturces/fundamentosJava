package FundamentosException.DesafioReservaBoa.modelos.entidades;

import FundamentosException.DesafioReservaBoa.modelos.exception.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    public Integer numeroQuarto;
    public Date checkIn;
    public Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut)  {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out da data deve ser posterior a data de Check-In");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao() {
        long dife = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(dife, TimeUnit.MILLISECONDS);
    }

    public void atualizarData(Date checkIn, Date checkOut)  {
        Date agora = new Date();
        if (checkIn.before(agora) || checkOut.before(agora)) {
            throw new DomainException("As datas de reserva para atualização devem ser datas futura");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out da data deve ser posterior a data de Check-In");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Quarto "
                + numeroQuarto
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duracao()
                + " noites ";
    }
}
