package FundamentosComposicao.Exerc2Composicao.aplicacao;

import FundamentosComposicao.Exerc2Composicao.entidades.Comentario;
import FundamentosComposicao.Exerc2Composicao.entidades.Postagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Fazer boa viagem! \n");
        Comentario c2 = new Comentario("Como isso é incrível!!!");

        Postagem p1 = new Postagem(sdf.parse("21/06/2018 13:05:44"),
                "Viajar para a Nova Zelândia",
                "Esse país é maravilhoso!",
                12);

        p1.addComentarios(c1);
        p1.addComentarios(c2);

/*        Comentario c3 = new Comentario("Fazer boa viagem! \n");
        Comentario c4 = new Comentario("Como isso é incrível!!!");

        Postagem p2 = new Postagem(sdf.parse("21/06/2018 13:05:44"),
                "Viajar para a Nova Zelândia",
                "Esse país é maravilhoso!",
                12);

        p1.addComentarios(c1);
        p1.addComentarios(c2);*/

        System.out.println(p1);


    }

}
