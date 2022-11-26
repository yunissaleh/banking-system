package Y2_Lab1;
import java.util.ArrayList;

public class Client {
    private String name;
    private String bday;
    private String CNP;
    private Address address;
    ArrayList<Account> accounts = new ArrayList<Account>();


    public Client(String name, String bday, String CNP, Address address) {
        this.name = name;
        this.bday = bday;
        this.CNP = CNP;
        this.address = address;
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public boolean removeAccount(String iban) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getIban().equals(iban)) {
                accounts.remove(i);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String text = " ";
        for (int i = 0; i < accounts.size(); i++) {
            text += accounts.get(i).getIban();
        }
        return name + ", accounts: " + text;
    }

}
