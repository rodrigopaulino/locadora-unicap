package basicas;

import java.sql.Date;

public class Usuario {
	private int id;
	private String email;
	private String senha;
	private String nome;
	private String sobrenome;
	private int cpf;
	private int fone;
	private boolean admin;
	private Date nasc;
	
	public Usuario(int id,String email, String senha, String nome, String sobrenome, int cpf, 
			int fone, boolean admin, Date nasc) {
		
		this.setId(id);
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.setSobrenome(sobrenome);
		this.cpf = cpf;
		this.fone = fone;
		this.admin = admin;
		this.nasc = nasc;
	}
	
	public String toString(){
		String retorno = "Nome: "+this.nome + "\nCPF: " +this.cpf + "\nE-mail "+this.email +
				"\nTelefone"+this.fone;
		if(admin)retorno+="\nFUNCIONÁRIO";
		else retorno+="\nCLIENTE";
		return retorno; 
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public Date getNasc() {
		return nasc;
	}

	public void setNasc(Date nasc) {
		this.nasc = nasc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	
}
