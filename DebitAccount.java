package Y2_Lab1;

public class DebitAccount extends Account {

    public DebitAccount(int ammount, String iban) {
        super(iban, ammount);
    }

    @Override
    public boolean withdraw(int a) {
        if (a <= getAmmount()) {
            setAmmount(getAmmount()-a);
            return true;
        }
        return false;
    }

    public String toString() {
        return "Iban: " + getIban()+ ", Ammount: " + getAmmount();
    }
}
