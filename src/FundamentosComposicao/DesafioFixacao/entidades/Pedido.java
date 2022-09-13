package FundamentosComposicao.DesafioFixacao.entidades;

import FundamentosComposicao.DesafioFixacao.enums.StatusPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date momento;
    private StatusPedido status;

    private Cliente cliente;

    private List<ItemPedido> itemPedidos = new ArrayList<>();

    public void Pedido() {
    }

    public Pedido(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
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

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void addItem(ItemPedido item) {
        itemPedidos.add(item);
    }

    public void removerItem(ItemPedido item) {
        itemPedidos.remove(item);
    }

    public double total (){
        double soma = 0.0;
        for (ItemPedido item: itemPedidos){
            soma += item.subTotal();
        }
        return soma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do Pedido: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Status do Pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens do Pedido:\n");
        for (ItemPedido item: itemPedidos) {
            sb.append(item + "\n");
        }
        sb.append("Preco Total: R$ ");
        sb.append(String.format("%.2f ", total()));
        return sb.toString();
    }

}
