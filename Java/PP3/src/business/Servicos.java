package business;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public abstract class Servicos {
    private String conteudo;
    private String nome;
    private final String path;

    public Servicos(String nome, String conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.path = "D:\\Arquivos\\Desktop\\Repositórios\\studies-and-exercises\\Java\\PP3\\" + nome + ".txt";

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public abstract void servicoOpen();

    public abstract void servicoAdd();

    public abstract void servicoRead();

    public void txtCreat() {
        if (!this.test())
            try {
                PrintWriter printWriter = new PrintWriter(new FileOutputStream(this.nome + ".txt"));
                Formatter output = new Formatter(printWriter);
                output.format(this.conteudo);

                output.close();
                printWriter.close();

            }

            catch (SecurityException securityException) {
                System.err.println("Write permission denied. Terminating.");
                System.exit(1);
            }

            catch (FileNotFoundException fileNotFoundException) {
                System.err.println("Error opening file. Terminating.");
                System.exit(1);
            }

    }

    public String addConteudoAdicional() {
        Scanner input = new Scanner(System.in);

        return input.nextLine();
    }

    public void addTxt(String conteudoAdicional){

        try {
            FileWriter fileWriter = new FileWriter(path, true);

            Formatter formatter = new Formatter(fileWriter);

            formatter.format("%s%n", conteudoAdicional);

            formatter.close();
            fileWriter.close();
        }

        catch (IOException e){
            System.err.println("Ocorreu um erro ao adicionar conteúdo ao arquivo: " + e.getMessage());
        }

    }

    public void read(){

        try {

            File file = new File(path);

            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }

            input.close();

        }
        catch (FileNotFoundException e) {

            System.err.println("Error file not found");
        }
    }

    public boolean test(){

        boolean test = false;

        try {

            File file = new File(path);

            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
            }

            input.close();
            test = true;

        }
        catch (FileNotFoundException e) {
            System.out.println();
        }
        return test;
    }
}
