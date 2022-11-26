package Y2_Lab1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public abstract class Account implements Comparable<Account>, Storable{
    private String iban;
    private int ammount;


    public Account(String iban, int ammount) {
        this.iban = iban;
        this.ammount = ammount;
    }

    public abstract boolean withdraw(int ammount);

    public void deposit(int amount) {
        ammount += amount;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public String getIban() {
        return iban;
    }

    public int compareTo(Account aThat) {

        if (this == aThat) return 0;

        return this.getIban().compareTo(aThat.getIban());

    }

    @Override
    public boolean store(String file)  {

        try {
            FileOutputStream outputFile=new FileOutputStream(file, true);
            OutputStreamWriter outputStream=new OutputStreamWriter(outputFile);
            PrintWriter pw=new PrintWriter(outputStream);
            pw.println(this.toString());
            pw.flush();
            pw.close();
            return true;
        }

        catch(IOException a) {
            a.printStackTrace();
        }
        return false;
    }

}
