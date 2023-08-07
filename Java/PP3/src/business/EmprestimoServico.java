package business;

import java.util.ArrayList;

public class EmprestimoServico implements ServicosSecundarios{

        public void exibirLista(ArrayList<String> lista){
            System.out.println("Lista de Livros emprestados: ");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(i + "] " + lista.get(i));
            }
        }
}
