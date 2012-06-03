package conexao_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

public class ConexaoMySQL {
	
	private static final String DRIVERNAME = "com.mysql.jdbc.Driver";
	private static final String SERVERNAME = "localhost";
	private static final String DATABASE = "locadora";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "password";
	private static String status = "N�o conectou...";
	
	public ConexaoMySQL() {

    }

	public static Connection getConexaoMySQL() {
		Connection connection = null;
		try {

			Class.forName(DRIVERNAME);

            String url = "jdbc:mysql://" + SERVERNAME + "/" + DATABASE;
            
            connection = DriverManager.getConnection(url, USERNAME, PASSWORD);

            if (connection != null) {
                status = ("STATUS: Conectado com sucesso!");
            } else {
                status = ("STATUS: N�o foi possivel realizar conex�o");
            }

            return connection;
        } catch (ClassNotFoundException e) {  // Driver n�o encontrado: ocorre quando a biblioteca do mysql n�o est� associada
        	System.out.println("O driver expecificado nao foi encontrado.");
        	return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
	}

    public static String statusConection() {
        return status;
    }

    public static boolean fecharConexao(Connection pConnection) {

        try {
        	pConnection.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static Connection ReiniciarConexao(Connection pConnection) {
        fecharConexao(pConnection);
        return ConexaoMySQL.getConexaoMySQL();
    }
    
    /**
     * main de teste de conex�o...aplica��o n�o deve rodar por ele
     * @param args
     */
    public static void main(String[] args){
    	System.out.println(ConexaoMySQL.statusConection());
    	Connection con = ConexaoMySQL.getConexaoMySQL();
    	System.out.println(ConexaoMySQL.statusConection());
    	System.out.println(ConexaoMySQL.fecharConexao(con));
    }
}