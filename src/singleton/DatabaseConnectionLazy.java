package singleton;

public class DatabaseConnectionLazy {
	
	private static DatabaseConnectionLazy instance;
	
	private DatabaseConnectionLazy() {
		
	}

	public static DatabaseConnectionLazy getInstance() {
	
		/* 
		* dve if provere zbog boljih performansi, s obzirom na to
		* da synchronized zauzima više resursa
		*/
		if(instance == null) 
			synchronized(DatabaseConnectionLazy.class) {
				if(instance == null) 
					instance = new DatabaseConnectionLazy();
			}

		return instance;
	}
	

}
