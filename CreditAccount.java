package Y2_Lab1;

public class CreditAccount extends Account {
    private int maxCredit;

    public CreditAccount(String iban, int ammount, int maxCredit) {
        super(iban, ammount);
        this.maxCredit = maxCredit;
    }

    public boolean withdraw(int a) {
        if (a <= getAmmount() + maxCredit) {
            setAmmount(getAmmount() - a);
            return true;
        }
        return false;
    }
    public String toString() {
        return "Iban: " + getIban()+ ", Ammount: " + getAmmount();
    }
}
