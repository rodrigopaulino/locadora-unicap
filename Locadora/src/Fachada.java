import basicas.Filme;
import basicas.Usuario;


public class Fachada {
	private NegocioFilmes negFilmes;
	private NegocioUsuarios negUsuarios;
	
	Fachada(){
		this.negFilmes = new NegocioFilmes();
		this.negUsuarios = new NegocioUsuarios();
	}
	
	//opções de Administrador
	void cadastrarUsuario(int id, String email, String senha, String nome, int cpf, 
			int fone, boolean admin){
	negUsuarios.cadastrarUsuario(id, email, senha, nome, cpf, fone, admin);
	}
	
	void alterarUsuario(int id, String login, String senha, String nome, int cpf, String email, 
			int fone, boolean admin){
	negUsuarios.alterarUsuario(id, login, senha, nome, cpf, email, fone, admin);
	}
		
	void excluirUsuario(int id){
		negUsuarios.excluirUsuario(id);
	}
		
	Usuario consultarUsuarioPorId(int id){
		return negUsuarios.consultarId(id);	
	}
		
	Usuario consultarUsuarioPorCpf(int cpf){
		return negUsuarios.consultarCpf(cpf);	
	}
		
	Usuario consultarUsuarioPorNome(String nome){
		return negUsuarios.consultarNome(nome);	
	}
		
	Usuario consultarUsuarioEmail(String email){
		return negUsuarios.consultarEmail(email);	
	}
		
	Usuario[] listarUsuarios(){
		return negUsuarios.listarUsuarios();	
	}
	
	void cadastrarFilme(int id, String nome, String genero, double preco){
		negFilmes.cadastrarFilme(id,nome,genero,preco);
	}
	
	 void alterarFilme(int id, String nome, String genero, double preco){
		 negFilmes.alterarFilme(id, nome, genero, preco);
	 }
	 
	 void excluirFilme(int id){
		 negFilmes.excluirFilme(id);
	 }
	 
	 void confirmarDevolucao(int id){
		 negFilmes.confirmarDevolucao(id);
	 }
	 
	 //Opções de Usuario e Admin
	 
	 void locarFilme(int id){
		 negFilmes.locarFilme(id);
	 }
	 
	 Filme consultarFilmePorId(int id){
		 return negFilmes.consultarId(id);
	 }
	 
	 Filme consultarFilmePorNome(String nome){
		return negFilmes.consultarNome(nome);
	 }
	 
	 Filme[] listarFilmes(){
		return negFilmes.listarFilmes(); 
	 }
	 
	 Filme[] listarGenero(String genero){
		 return negFilmes.listarGenero(genero);
	 }
}
