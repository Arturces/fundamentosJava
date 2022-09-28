package FundamentosGenerics.DesafioSet.aplicacao;

import FundamentosGenerics.DesafioSet.entidades.EntradaLog;

import java.io.*;
import java.util.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o caminho do arquivo: ");
        String caminho = entrada.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            Set<EntradaLog> set = new HashSet<>();

            String line = br.readLine(); //vamos ler a linha
            while (line != null){ //enquanto eu estiver lendo a linha e ela nao for null, faça

                String[] fields = line.split(" ");//recorte da String
                String usuario = fields[0];
                Date momento = Date.from(Instant.parse(fields[1]));

                set.add(new EntradaLog(usuario, momento));

                line = br.readLine();
            }

            System.out.println("Total de usuario: " + set.size());

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        entrada.close();
    }
}
