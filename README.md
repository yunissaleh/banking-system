# banking-system
This project consists of a simple banking system that has three classes (Account, CreditAccount, DebitAccount), one interface (Storable),
and one test class (testAccount).

- The Account class is an abstract class that has two child classes,
DebitAccount and CreditAccount.
- The Client class contains an ArrayList of Account objects and manages the accounts of each client.
- The Storable interface is used to allow Account objects to be stored in an output file. 
- The testAccount class is used to test the functionalities of the banking system.

The Account class has methods to withdraw and deposit money from the account, as well as methods to get and set the account amount and IBAN. 

The CreditAccount class extends the Account class and has an additional attribute, maxCredit, that represents the maximum amount of credit allowed for the account.

The DebitAccount class extends the Account class and overrides the withdraw method to allow only withdrawals up to the amount available in the account.

The Client class manages the accounts of each client, allowing the addition and removal of accounts.

The toString method is used to return a string representation of the client's name and their account information.

The testAccount class is used to test the functionalities of the banking system.

It creates instances of DebitAccount, CreditAccount, and Client classes and tests the methods of these classes.

It also stores account information in an output file using the Storable interface.

Overall, this project is a simple implementation of a banking system that demonstrates object-oriented programming concepts such as inheritance, abstraction, and interfaces.
