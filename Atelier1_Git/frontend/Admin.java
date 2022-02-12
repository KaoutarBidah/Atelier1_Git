package frontend;

import backend.Disque;

public class Admin extends Personne{
	
	public Admin(String username, String password) {
		this.setCredentials(username, password);
		System.out.println("User creation!");

	}

	public void inscrireUser(Disque disque,String name,String password) {
		if(!disque.addUser(name, password)) {
			System.out.println("User creation failed!");
			System.out.println("User creation!");
			System.out.println("User creation!");
			System.out.println("User creation!");

		}
	}
}
