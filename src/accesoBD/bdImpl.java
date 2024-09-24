package accesoBD;
import java.sql.Connection;
import org.postgresql.ds.PGSimpleDataSource;

public class bdImpl implements bdInterfaz {

	@Override
	public Connection abreConexion() {

		// Crear y configurar el DataSource
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setServerNames(new String[]{"localhost"});
        dataSource.setDatabaseName("database1");
        dataSource.setUser("postgres");
        dataSource.setPassword("1234");
        Connection conexion = null;
        try {
			conexion = dataSource.getConnection();
			System.out.println("Conexion hecha");
		} catch (Exception e) {
			System.out.println(e);
		}
		
        return conexion;
		
	}

	public void cierraConexion(Connection conexion) {
		try {
			conexion.close();
			System.out.println("Conexion cerrada.");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	
	

}
