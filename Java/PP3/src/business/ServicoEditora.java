package business;

public class ServicoEditora extends Servicos {

    public ServicoEditora(String nomeDaEditora, String conteudoDaEditora){
        super(nomeDaEditora, conteudoDaEditora);
    }

    @Override
    public void servicoOpen(String nome, String conteudo){
        txtCreat(nome, conteudo);
    }

    public void servicoAdd(String nome){
        super.txtCreat(nome, super.addConteudoAdicional());
    }
}
