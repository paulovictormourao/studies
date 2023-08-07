package business;

import java.util.ArrayList;


public class ReservaServico implements ServicosSecundarios{

    public void exibirLista(ArrayList<String> lista){
        System.out.println("Livros reservados:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + "] " + lista.get(i));
        }
    }
}
