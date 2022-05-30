package Persistence;

public class PersistenceMain {

	public static void main(String[] args) {
		Persistence fp=new FilePersistence();
		fp.persist();
		Persistence dp=new DataPersistence();
		dp.persist();
	}

}
