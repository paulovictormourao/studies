package business;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public abstract class Servicos {
    private String conteudo;
    private String nome;

    public Servicos(String nome, String conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;


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

    public abstract void servicoOpen(String nome, String conteudo);

    public abstract void servicoAdd(String nome);

    public void txtCreat(String nome, String conteudo) {

        try {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(nome + ".txt"));
            Formatter output = new Formatter(printWriter);
            output.format(conteudo);

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

    public void addTxt(String nome, String conteudoAdicional){
        String path = "D:\\Arquivos\\Desktop\\Repositórios\\studies-and-exercises\\Java\\PP3\\"+nome+".txt";

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
}

