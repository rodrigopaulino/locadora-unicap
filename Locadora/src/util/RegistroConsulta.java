package util;

import java.util.Hashtable;

public class RegistroConsulta {
	
	private Hashtable<String, Object> aValoresColunas;
	
	public RegistroConsulta(){
		this.aValoresColunas = new Hashtable<String, Object>();
	}
	
	public void incluirValorColuna(String pColuna, Object pValor){
		if(pValor == null){
			throw new NullPointerException();
		}else{
			if(this.aValoresColunas != null && !pColuna.equals("")){
				this.aValoresColunas.put(pColuna, pValor);
			}else{
				throw new NullPointerException();
			}
		}
	}
	
	public Object getValorColuna(String pColuna){
		if(this.aValoresColunas != null && this.aValoresColunas.containsKey(pColuna)){
			return this.aValoresColunas.get(pColuna);
		}else{
			throw new NullPointerException();
		}
	}
	
	public boolean removeValorColuna(String pColuna){
		if(this.aValoresColunas != null && this.aValoresColunas.containsKey(pColuna)){
			this.aValoresColunas.remove(pColuna);
			return true;
		}else{
			return false;
		}
	}
	
	public boolean existeValorColuna(String pColuna){
		if(this.aValoresColunas != null && this.aValoresColunas.containsKey(pColuna)){
			return true;
		}else{
			return false;
		}
	}
}
