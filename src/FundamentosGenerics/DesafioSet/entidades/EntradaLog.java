package FundamentosGenerics.DesafioSet.entidades;

import java.util.Date;
import java.util.Objects;

public class EntradaLog {

    private String usuario;
    private Date momento;

    public EntradaLog(String usuario, Date momento) {
        this.usuario = usuario;
        this.momento = momento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EntradaLog that)) return false;
        return Objects.equals(usuario, that.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario);
    }
}
