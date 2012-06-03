package consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import conexao_mysql.ConexaoMySQL;

public final class ConsultaTesteMySQL extends ConexaoMySQL{

	private static ConsultaTesteMySQL aConsultaTesteMySQL;
	private static final String STATEMENT_SQL = "SHOW DATABASES"; 
	
	private ConsultaTesteMySQL(){
	}
	
	public static ConsultaTesteMySQL getInstancia(){
		if(ConsultaTesteMySQL.aConsultaTesteMySQL == null){
			ConsultaTesteMySQL.aConsultaTesteMySQL = new ConsultaTesteMySQL();
		}
		return ConsultaTesteMySQL.aConsultaTesteMySQL;
	}
	
	public ArrayList consultar(){
		Connection conexao = null;
		PreparedStatement preStmt = null;
		ResultSet result = null;
		ArrayList resposta = null;
		String sql = "";
		String sqlConnector = "";
		
		try{
			sql = STATEMENT_SQL;
			sql = sql + sqlConnector;
			sqlConnector = "\nAND";
			
			conexao = this.getConexaoMySQL();
			preStmt = conexao.prepareStatement(sql);
			result = preStmt.executeQuery();
			resposta = this.getResultSetComoColecaoRegistroConsulta(result);
		}catch(Exception e){
			System.out.println("Erro");
		}finally{
			if(conexao != null)
				this.fecharConexao(conexao);
		}
		return resposta;
	}
	
	/**
	 * main para teste de consulta...a aplicação não rodará por ele.
	 * @param pArgs
	 */
	public static void main(String[] pArgs) {  
		ArrayList resposta;  
		Iterator it;  
		try {    
			resposta = ConsultaTesteMySQL.getInstancia().consultar();    
			it = resposta.iterator();
			if (it.hasNext()) {      
				System.out.println(it.next());    
			}  
		} catch(Exception e) {    
			e.printStackTrace();  
		}
	}
}
