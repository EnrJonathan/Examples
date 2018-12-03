public class VenmoAccountClient {
	public static void main (String args []) {
		VenmoAccount acc = new VenmoAccount();
		System.out.println("id = " + acc.id + "balance = " + acc.balance);
		acc.addFunds(5);
		System.out.println("id = " + acc.id + "balance = " + acc.balance);
	}

}
