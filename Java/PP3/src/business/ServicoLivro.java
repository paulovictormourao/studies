package business;

public class ServicoLivro extends Servicos{

    public ServicoLivro(String nomeDoLivro, String conteudoDoLivro){
        super(nomeDoLivro, conteudoDoLivro);
    }

    @Override
    public void servicoOpen(String nome, String conteudo) {
        super.txtCreat(nome, conteudo);
    }

    public void servicoAdd(String nome){
        super.addTxt(nome, super.addConteudoAdicional());

    }
}
