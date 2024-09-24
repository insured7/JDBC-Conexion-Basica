package accesoBD;

import java.sql.Connection;

public interface bdInterfaz {

	/**
	 * Abre conexion y muestra en consola el resultado
	 */
	public Connection abreConexion();
	
	/**
	 * Cierra la conexion y envia mensaje
	 * 
	 */
	
	public void cierraConexion(Connection conexion);
}
