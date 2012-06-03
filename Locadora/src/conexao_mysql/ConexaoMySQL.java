package conexao_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

public abstract class ConexaoMySQL {
	
	private static final String DRIVERNAME = "com.mysql.jdbc.Driver";
	private static final String SERVERNAME = "localhost";
	public static final String DATABASE = "locadora";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "password";
	private static String status = "Não conectou...";
	
	public Connection getConexaoMySQL() {
		Connection connection = null;
		try {

			Class.forName(DRIVERNAME);

            String url = "jdbc:mysql://" + SERVERNAME + "/" + DATABASE;
            
            connection = DriverManager.getConnection(url, USERNAME, PASSWORD);

            if (connection != null) {
                status = ("STATUS: Conectado com sucesso!");
            } else {
                status = ("STATUS: Não foi possivel realizar conexão");
            }

            return connection;
        } catch (ClassNotFoundException e) {  // Driver não encontrado: ocorre quando a biblioteca do mysql não está associada
        	System.out.println("O driver expecificado nao foi encontrado.");
        	return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
	}

    public String statusConection() {
        return status;
    }

    public boolean fecharConexao(Connection pConnection) {
        try {
        	pConnection.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public Connection ReiniciarConexao(Connection pConnection) {
        fecharConexao(pConnection);
        return this.getConexaoMySQL();
    }
}