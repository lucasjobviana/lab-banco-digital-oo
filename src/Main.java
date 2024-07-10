public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Account account = new CheckingAccount(client);

        for(int i = 0; i < 10; i++){
            account.deposit(i*10);
        }

        account.printStatement();

        account.withdraw(23);

        account.printStatement();

    }
}