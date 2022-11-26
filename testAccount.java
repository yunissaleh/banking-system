package Y2_Lab1;

public class testAccount {

public static void main(String[] args) {

    DebitAccount ac = new DebitAccount( 0, "NI329");
    Address adr = new Address("Bucharest", 38,"Gramont");
    Client cl = new Client("Yunis", "27/05/2001", "549120101341",adr);
    System.out.print("was the withdrawal succesful? " + ac.withdraw(324));
    System.out.println();
    ac.deposit(23);
    System.out.println("23$ deposited");
    System.out.print("was the withdrawal succesful? " + ac.withdraw(23));
    System.out.println();
    Account a = new DebitAccount(324,"12CDLKAN");
    Account b = new DebitAccount(213,"14deLKbN");
    Account c = new CreditAccount("32421mvlv", 42, 1000);
    cl.addAccount(a);
    cl.addAccount(b);
    cl.addAccount(c);
    System.out.println("Get accounts info and print them in an output file: ");
    a.store("info.txt"); b.store("info.txt"); c.store("info.txt");
    System.out.println(a); System.out.println(b); System.out.println(c);


}

}
