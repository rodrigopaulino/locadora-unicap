import basicas.Filme;
import basicas.Usuario;


public class Fachada {
	private Fachada aFachada;
	
	public Fachada getInstancia(){
		if(this.aFachada == null){
			this.aFachada = new Fachada();
		}
		return this.aFachada;
	}
	
	private Fachada(){
		
	}
	
	//opções de Administrador
	void cadastrarUsuario(int id, String email, String senha, String nome, int cpf, 
			int fone, boolean admin){
		NegocioUsuarios.getInstancia().cadastrarUsuario(id, email, senha, nome, cpf, fone, admin);
	}
	
	void alterarUsuario(int id, String login, String senha, String nome, int cpf, String email, 
			int fone, boolean admin){
		NegocioUsuarios.getInstancia().alterarUsuario(id, login, senha, nome, cpf, email, fone, admin);
	}
		
	void excluirUsuario(int id){
		NegocioUsuarios.getInstancia().excluirUsuario(id);
	}
		
	Usuario consultarUsuarioPorId(int id){
		return NegocioUsuarios.getInstancia().consultarId(id);	
	}
		
	Usuario consultarUsuarioPorCpf(int cpf){
		return NegocioUsuarios.getInstancia().consultarCpf(cpf);	
	}
		
	Usuario consultarUsuarioPorNome(String nome){
		return NegocioUsuarios.getInstancia().consultarNome(nome);	
	}
		
	Usuario consultarUsuarioEmail(String email){
		return NegocioUsuarios.getInstancia().consultarEmail(email);	
	}
		
	Usuario[] listarUsuarios(){
		return NegocioUsuarios.getInstancia().listarUsuarios();	
	}
	
	void cadastrarFilme(int id, String nome, String genero, double preco){
		NegocioFilmes.getInstancia().cadastrarFilme(id,nome,genero,preco);
	}
	
	 void alterarFilme(int id, String nome, String genero, double preco){
		 NegocioFilmes.getInstancia().alterarFilme(id, nome, genero, preco);
	 }
	 
	 void excluirFilme(int id){
		 NegocioFilmes.getInstancia().excluirFilme(id);
	 }
	 
	 void confirmarDevolucao(int id){
		 NegocioFilmes.getInstancia().confirmarDevolucao(id);
	 }
	 
	 //Opções de Usuario e Admin
	 
	 void locarFilme(int id){
		 NegocioFilmes.getInstancia().locarFilme(id);
	 }
	 
	 Filme consultarFilmePorId(int id){
		 return NegocioFilmes.getInstancia().consultarId(id);
	 }
	 
	 Filme consultarFilmePorNome(String nome){
		return NegocioFilmes.getInstancia().consultarNome(nome);
	 }
	 
	 Filme[] listarFilmes(){
		return NegocioFilmes.getInstancia().listarFilmes(); 
	 }
	 
	 Filme[] listarGenero(String genero){
		 return NegocioFilmes.getInstancia().listarGenero(genero);
	 }
}
