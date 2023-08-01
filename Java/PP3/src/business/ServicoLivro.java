package business;

public class ServicoLivro extends Servicos{

    public ServicoLivro(String nomeDoLivro, String conteudoDoLivro){
        super(nomeDoLivro, conteudoDoLivro);
    }

    @Override
    public void servicoOpen(String nome, String conteudo) {
        super.txtCreat(nome, conteudo);
    }

    @Override
    public void servicoAdd(String nome){
        super.addTxt(nome, super.addConteudoAdicional());

    }

    @Override
    public void servicoRead(String nome){
        super.read(nome);
    }
}
