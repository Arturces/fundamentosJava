package FundamentosOrientacaoObjetos.ExercRetangulo;

public class Retangulo {

    public double largura;
    public double altura;

    public double area(){
        return this.largura * this.altura;
    }

    public double perimetro(){
        return (2*(this.largura * this.altura));
    }

    public double diagonal(){
      return Math.sqrt(Math.exp(this.largura) + Math.exp(this.altura));

    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "largura=" + this.largura +
                ", altura=" + this.altura +
                '}';
    }
}
