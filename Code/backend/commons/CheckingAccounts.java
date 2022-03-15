package backend.commons;

import backend.banking.visitor.Visitable;
import backend.banking.visitor.Visitor;

public class CheckingAccounts extends Account {
    public CheckingAccounts(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public String getAccountTypes(){
        return AccountTypes.Checking.name();
    }
}
