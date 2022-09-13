package FudamentosEnum;

import java.util.Date;

public class PedidoPrincipal {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(1080, new Date(), StatusPedido.PAGAMENTO_PENDENTE);

        System.out.println(pedido1);

       StatusPedido ps1 = StatusPedido.ENTREGUE;

       StatusPedido ps2 = StatusPedido.valueOf("ENTREGUE");

        System.out.println(ps1);
        System.out.println(ps2);



    }



}
