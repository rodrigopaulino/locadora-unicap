import basicas.Filme;


public class NegocioFilmes {
	
	private IRepositorioFilmes repositorio;
	
	void cadastrarFilme(int id, String nome, String genero, double preco){
		Filme f = new Filme(id,nome,genero,preco);
		repositorio.cadastrarFilme(f);
	}
	 void alterarFilme(int id, String nome, String genero, double preco){
		 repositorio.alterarFilme(id, nome, genero, preco);
	 }
	 void excluirFilme(int id){
		 repositorio.excluirFilme(id);
	 }
	 
	 public void confirmarDevolucao(int id) {
			repositorio.confirmarDevolucao(id);
	 }
	 
	 void locarFilme(int id){
		 repositorio.locarFilme(id);
	 }
	 
	 Filme consultarId(int id){
		 return repositorio.consultarId(id);
	 }
	 
	 Filme consultarNome(String nome){
		return repositorio.consultarNome(nome);
	 }
	 
	 Filme[] listarFilmes(){
		return repositorio.listarFilmes(); 
	 }
	 
	 Filme[] listarGenero(String genero){
		 return repositorio.listarGenero(genero);
	 }
	
	}
