public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double iBalance, double iRate){
        this.balance = iBalance;
        this.interestRate = iRate;
    }
    public void printBalance(){
        System.out.println(this.balance);
    }
    public void waitOneYear(){
       this.balance = this.balance * this.interestRate;
    }
    public static void main(String[] args){
        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
}