package regranegocio;
import repositorios.IRepositorioFilmes;
import basicas.Filme;


public class NegocioFilmes {
	
	private static NegocioFilmes aNegocioFilmes;
	private IRepositorioFilmes repositorio;
	
	private NegocioFilmes(){
		
	}
	
	public static NegocioFilmes getInstancia(){
		if(NegocioFilmes.aNegocioFilmes == null){
			NegocioFilmes.aNegocioFilmes = new NegocioFilmes();
		}
		return NegocioFilmes.aNegocioFilmes;
	}
	
	public void cadastrarFilme(int id, String nome, String genero, double preco){
		Filme f = new Filme(id,nome,genero,preco);
		repositorio.cadastrarFilme(f);
	}
	public void alterarFilme(int id, String nome, String genero, double preco){
		 repositorio.alterarFilme(id, nome, genero, preco);
	 }
	public void excluirFilme(int id){
		 repositorio.excluirFilme(id);
	 }
	 
	 public void confirmarDevolucao(int id) {
			repositorio.confirmarDevolucao(id);
	 }
	 
	 public void locarFilme(int id){
		 repositorio.locarFilme(id);
	 }
	 
	 public Filme consultarId(int id){
		 return repositorio.consultarId(id);
	 }
	 
	 public Filme consultarNome(String nome){
		return repositorio.consultarNome(nome);
	 }
	 
	 public Filme[] listarFilmes(){
		return repositorio.listarFilmes(); 
	 }
	 
	 public Filme[] listarGenero(String genero){
		 return repositorio.listarGenero(genero);
	 }
	
	}
