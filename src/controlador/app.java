package controlador;
import accesoBD.bdInterfaz;

import java.sql.Connection;

import accesoBD.bdImpl;
public class app {

	public static void main(String[] args) {
		
		bdInterfaz bdInt = new bdImpl();
		
		Connection conexion = bdInt.abreConexion();
		
		bdInt.cierraConexion(conexion);

	}

}
