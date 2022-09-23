package FundamentosLeituraDeArquivos.LeituraTxt;

import java.io.File;
import java.util.Scanner;

public class PrincipalCaminhoDoArquivo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo: ");
        String strPath = entrada.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); // pega somente o nome do arquivo
        System.out.println("getParent: " + path.getParent()); // pega somente o caminho sem o nome do arquivo
        System.out.println("getParent: " + path.getPath()); // pega o caminho completo


    }
}
