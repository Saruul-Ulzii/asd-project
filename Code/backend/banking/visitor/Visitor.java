package backend.banking.visitor;

import backend.banking.CheckingAccount;
import backend.banking.SavingsAccount;
import backend.creditcard.CreditCardAccount;

public interface Visitor {

    double visit(SavingsAccount savingsAccount);

    double visit(CheckingAccount checkingAccounts);

    double visit(CreditCardAccount creditCardAccount);

}
