package av3.business;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ServicoLivro extends Servicos{



    public ServicoLivro(String nomeDoLivro, String conteudoDoLivro){
        super(nomeDoLivro, conteudoDoLivro);
    }

    @Override
    public void servicoOpen(String nome, String conteudo) {

        try
        {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(nome + ".txt"));
            Formatter output = new Formatter(printWriter);
            output.format(conteudo);

            output.close();
            printWriter.close();
        }

        catch (SecurityException securityException)
        {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        }

        catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }


}
