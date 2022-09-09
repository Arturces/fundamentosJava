package FundamentosVetores;

public class ForEach {
    public static void main(String[] args) {

        String[] vetor = new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("----------------------------");
        for (String obj : vetor){ //para cada objeto OBJ contido no vetor ( VETOR ) Faça
            System.out.println(obj);
        }
    }
}
