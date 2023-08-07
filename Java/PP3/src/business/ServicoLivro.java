package business;

public class ServicoLivro extends Servicos{

    public ServicoLivro(String nomeDoLivro, String conteudoDoLivro){
        super(nomeDoLivro, conteudoDoLivro);
    }

    @Override
    public void servicoOpen() {
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
