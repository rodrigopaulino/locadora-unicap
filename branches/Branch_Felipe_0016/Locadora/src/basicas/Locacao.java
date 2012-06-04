package basicas;
import java.sql.Date;


public class Locacao {
	private int idFilme;
	private int idUsuario;
	private Date dataLocacao;
	private Date dataDevolucao;
	
	public Locacao(int idFilme, int idUsuario, Date dataLocacao, Date dataDevolucao) {
		this.idFilme = idFilme;
		this.idUsuario = idUsuario;
		this.dataLocacao = dataLocacao;
		this.dataDevolucao = dataDevolucao;
	}

	public int getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Date getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	
	
	
}
