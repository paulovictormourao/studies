package business;

public class ServicoEditora extends Servicos {

    public ServicoEditora(String nomeDaEditora, String conteudoDaEditora){
        super(nomeDaEditora, conteudoDaEditora);
    }

    @Override
    public void servicoOpen(){
        super.txtCreat();
    }

    @Override
    public void servicoAdd(){
        super.addTxt(super.addConteudoAdicional());
    }

    @Override
    public void servicoRead(){
        super.read();
    }
}
