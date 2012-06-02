import basicas.Usuario;



public class NegocioUsuarios {
	private IRepositorioUsuarios repositorio;
	
	NegocioUsuarios(){
		
	}
	
	void cadastrarUsuario(int id, String email, String senha, String nome, int cpf, 
			int fone, boolean admin){
	//checar se id, cpf e fone sao apenas numeros.
	//checar se email é válido?
	//checar se nome é apenas letras?
	Usuario u = new Usuario(id,email,senha,nome,cpf,fone,admin);
	repositorio.cadastrarUsuario(u);	
	}
	
	void alterarUsuario(int id, String login, String senha, String nome, int cpf, String email, int fone, boolean admin){
	repositorio.alterarUsuario();
	}
	
	void excluirUsuario(int id){
	repositorio.excluirUsuario(id);
	}
	
	Usuario consultarId(int id){
	return repositorio.consultarId(id);	
	}
	
	Usuario consultarCpf(int cpf){
	return repositorio.consultarCpf(cpf);	
	}
	
	Usuario consultarNome(String nome){
	return repositorio.consultarNome(nome);	
	}
	
	Usuario consultarEmail(String email){
	return repositorio.consultarEmail(email);	
	}
	
	Usuario[] listarUsuarios(){
	return repositorio.listarUsuarios();	
	}
	
}
