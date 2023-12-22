interface Loan{
    void loanInterest();//public abstract

    int PI = 14;//public static final

}

interface OverDraftLoan{
    void loanInterest1();
}

class PersonalLoan implements Loan, OverDraftLoan{

    @Override
    public void loanInterest() {
        System.out.println("10.75");
    }

    @Override
    public void loanInterest1() {
        System.out.println("loanInterest1 : 10.00");
    }
}

class HomeLoan implements Loan{

    @Override
    public void loanInterest() {
        System.out.println("8.70");
    }
}
public class AbstractionDemo2 {

    public static void main(String[] args) {
        Loan loan1 = new HomeLoan();
        loan1.loanInterest();
    }
}
