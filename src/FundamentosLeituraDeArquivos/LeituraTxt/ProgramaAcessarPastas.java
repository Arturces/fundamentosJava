package FundamentosLeituraDeArquivos.LeituraTxt;

import java.io.File;
import java.util.Scanner;

public class ProgramaAcessarPastas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a pasta: ");

        String strPath = entrada.nextLine();

        File path = new File(strPath);

        File[] pastas = path.listFiles(File::isDirectory);

        System.out.println("PASTAS: "); // acessar as pastas dentro do diretorio c
        for (File pasta : pastas ){
            System.out.println(pasta);
        }

        File[] arquivos = path.listFiles(File::isFile); // acessar os arquivos file na pasta
        System.out.println("ARQUIVOS: ");
        for (File arquivo : arquivos){
            System.out.println(arquivo);
        }

        boolean sucesso = new File(strPath +"\\sub").mkdir();  //criar pastas pelo programa
        System.out.println("Diretorio criado com sucesso: " + sucesso);

        entrada.close();
    }
}
