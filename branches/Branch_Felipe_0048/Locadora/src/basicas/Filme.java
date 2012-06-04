package basicas;

public class Filme {
	private int id;
	private String titulo;
	private int genero;
	private int copias;
	private String descricao;
	
	public Filme (int id, String nome, int genero, int copias, String descricao){
		this.id = id;
		this.titulo = nome;
		this.genero = genero;
		this.copias = copias;
		this.descricao = descricao;
	}
	
	public String toString(){
		String retorno = "Título: "+this.titulo + "\nGênero: " +this.genero + "\nCópias"+this.copias + 
				"\nDescrição"+this.descricao;
		return retorno; 
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int gettGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public int getCopias() {
		return copias;
	}

	public void setCopias(int copias) {
		this.copias = copias;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
	
}
