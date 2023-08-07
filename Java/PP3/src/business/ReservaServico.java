package business;

import java.util.ArrayList;


public class ReservaServico implements ServicosSecundarios{
    public void addLista(ArrayList<String> lista, String conteudo){
        lista.add(conteudo);
    }
    public void exibirLista(ArrayList<String> lista){
        System.out.println(lista);
    }
}
