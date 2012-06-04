package repositorios;
import basicas.Usuario;


public interface IRepositorioUsuarios {

	void cadastrarUsuario(Usuario u);
	void alterarUsuario();
	void excluirUsuario(int id);
	Usuario consultarId(int id);
	Usuario consultarCpf(int cpf);
	Usuario consultarNome(String nome);
	Usuario consultarEmail(String email);
	Usuario[] listarUsuarios();
	Usuario[] listarFuncionarios();
	Usuario[] listarClientes();
	
}
