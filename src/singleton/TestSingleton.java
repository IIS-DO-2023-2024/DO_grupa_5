package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		// kreira dva razlicita objekta
		//DatabaseConnection databaseConnection1 = new DatabaseConnection();
		//DatabaseConnection databaseConnection2 = new DatabaseConnection();
		
		// primena singletona, kreiranje jednog objekta
		DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
		DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
		
		System.out.println(databaseConnection1);
		System.out.println(databaseConnection2);
		System.out.println(Integer.toHexString(databaseConnection1.hashCode()));
		
		DatabaseConnectionLazy databaseConnection3 = DatabaseConnectionLazy.getInstance();
		DatabaseConnectionLazy databaseConnection4 = DatabaseConnectionLazy.getInstance();
		System.out.println(databaseConnection3);
		System.out.println(databaseConnection4);

	}

}
