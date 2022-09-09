package FundamentosOrientacaoObjetos.ExercFuncionario;

public class Funcionario {

    private String nome;
    private double salarioBruto;
    private double imposto;

    public void aumentarSalario (double porcentagem){
       this.salarioBruto += this.salarioBruto * porcentagem / 100;
    }

    public double netSalario (){
       return this.salarioBruto - this.imposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salarioBruto=" + salarioBruto +
                ", imposto=" + imposto +
                '}';
    }
}
