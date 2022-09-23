package FundamentosException.DesafioReservaBoa.modelos.exception;

public class DomainException extends RuntimeException{

    //RunTimeException compilador não obriga a tratar excecao
    //Exception compilador obra a tratar a excecao

    public DomainException(String msg){
        super(msg);
    }

}
