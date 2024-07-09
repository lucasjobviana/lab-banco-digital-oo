
public class SavingsAccount extends Account {

	public SavingsAccount(Client client) {
		super(client);
	}

	@Override
	public void printStatement() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.printCommonInfo();
	}
}
