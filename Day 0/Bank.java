public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }
    
    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }
    
    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public int computeTotalEmployees() {
        int totalEmployees = numberOfLoanOfficers + numberOfTellers;
        return totalEmployees;
    }

    public String toString() {
        String employees = "This bank has "
            + numberOfLoanOfficers
            + " loan officers and "
            + numberOfTellers + " tellers";
        return employees;
    }

    public boolean equals(Bank otherBank) {
        if (
            this.numberOfLoanOfficers == otherBank.numberOfLoanOfficers
                && this.numberOfTellers == otherBank.numberOfTellers) {
            return true;
        } else {
            return false;
        }
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (
            isLoanOfficer == true) {
            numberOfLoanOfficers = numberOfLoanOfficers + numberToHire;
        } else {
            numberOfTellers = numberOfTellers + numberToHire;
        }
    }

}