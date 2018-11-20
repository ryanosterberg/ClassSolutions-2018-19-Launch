package oOP;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank saving = new Bank();
		Bank checking = new Bank();
		
		System.out.println("Acount Number: " + saving.getAcount() );
		saving.deposit(100);
		System.out.println("Saving Acount Total: " + saving.getMoney() );
		checking.setRate(.18);
		
		
		
		//edti
		
		
		
		
		
		
		
	}

}
