package basicas;

public class Filme {
	private int id;
	private String titulo;
	private String genero;
	private double preco;
	private boolean locado;
	
	public Filme (int id, String nome, String genero, double preco){
		this.id = id;
		this.titulo = nome;
		this.genero = genero;
		this.preco = preco;
		this.locado = false;
	}
	
	public String toString(){
		String retorno = "Título: "+this.titulo + "/nGênero: " +this.genero + "/nPreço "+this.preco;
		if(locado)retorno+="/nLOCADO";
		else retorno+="/nDISPONÍVEL";
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isReservado() {
		return locado;
	}

	public void setReservado(boolean reservado) {
		this.locado = reservado;
	}
	
	
}
