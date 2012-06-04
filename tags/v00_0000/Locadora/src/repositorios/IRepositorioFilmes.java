package repositorios;
import basicas.Filme;


public interface IRepositorioFilmes {

 void cadastrarFilme(Filme f);
 void alterarFilme(int id, String nome, String genero, double preco);
 void excluirFilme(int id);
 void confirmarDevolucao(int id);
 void locarFilme(int id);
 Filme consultarId(int id);
 Filme consultarNome(String nome);
 Filme[] listarFilmes();
 Filme[] listarGenero(String genero);
}
