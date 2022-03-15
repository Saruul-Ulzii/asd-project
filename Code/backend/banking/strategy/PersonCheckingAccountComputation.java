
package edu.mum.cs.cs525.labs.exercises.project.backend.banking.strategy;

import edu.mum.cs.cs525.labs.exercises.project.backend.commons.InterestComputationStrategy;

public class PersonCheckingAccountComputation implements InterestComputationStrategy{
    @Override
    public double ComputeInterest(double accountBalance) {
        if (accountBalance < 1000) return accountBalance * .015;
        else return accountBalance * .025;
    }
}
