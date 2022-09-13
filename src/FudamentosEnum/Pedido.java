package FudamentosEnum;

import FundamentosComposicao.DesafioFixacao.entidades.ItemPedido;

import java.util.Date;

public class Pedido {
    private Integer id;
    private Date momento;
    private StatusPedido status;


    private ItemPedido itemPedido;

    public Pedido (){
    }

    public Pedido(Integer id, Date momento, StatusPedido status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

}
