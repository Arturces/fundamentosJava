package FundamentosComposicao.Exerc2Composicao.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer curtidas;

    private List<Comentario> comentarios = new ArrayList<>();

    public Postagem() {

    }

    public Postagem(Date momento, String titulo, String conteudo, Integer curtidas) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public List<Comentario> getComentario() {
        return comentarios;
    }

    public void addComentarios(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void removerComentarios(Comentario comentario) {
        comentarios.remove(comentario);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo).append("\n");
        sb.append(curtidas);
        sb.append(" Curtidas - ");
        sb.append(sdf.format(momento)).append("\n");
        sb.append(conteudo).append("\n");
        sb.append("Comentarios:\n");
        for (Comentario c : comentarios) {
            sb.append(c.getTexto());
        }
        return sb.toString();
    }
}