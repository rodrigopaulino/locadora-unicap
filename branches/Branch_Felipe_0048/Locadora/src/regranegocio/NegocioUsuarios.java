package regranegocio;
import repositorios.IRepositorioUsuarios;
import basicas.Usuario;

public class NegocioUsuarios {
	
	private static NegocioUsuarios aNegocioUsuarios;
	private IRepositorioUsuarios repositorio;
	
	private NegocioUsuarios(){
		
	}
	
	public static NegocioUsuarios getInstancia(){
		if(NegocioUsuarios.aNegocioUsuarios == null){
			NegocioUsuarios.aNegocioUsuarios = new NegocioUsuarios();
		}
		return NegocioUsuarios.aNegocioUsuarios;
	}
	
	public void cadastrarUsuario(int id, String email, String senha, String nome, int cpf, 
			int fone, boolean admin){
	//checar se id, cpf e fone sao apenas numeros.
	//checar se email é válido?
	//checar se nome é apenas letras?
	Usuario u = new Usuario(id,email,senha,nome,cpf,fone,admin);
	repositorio.cadastrarUsuario(u);	
	}
	
	public void alterarUsuario(int id, String login, String senha, String nome, int cpf, String email, int fone, boolean admin){
	repositorio.alterarUsuario();
	}
	
	public void excluirUsuario(int id){
	repositorio.excluirUsuario(id);
	}
	
	public Usuario consultarId(int id){
	return repositorio.consultarId(id);	
	}
	
	public Usuario consultarCpf(int cpf){
	return repositorio.consultarCpf(cpf);	
	}
	
	public Usuario consultarNome(String nome){
	return repositorio.consultarNome(nome);	
	}
	
	public Usuario consultarEmail(String email){
	return repositorio.consultarEmail(email);	
	}
	
	public Usuario[] listarUsuarios(){
	return repositorio.listarUsuarios();	
	}
	
}
