public class Money {
    private final int euros;
    private final int cents;
    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }
    public int euros() {
        return euros;
    }
    public int cents() {
        return cents;
    }
    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    public boolean lessThan(Money compared){
        if(this.euros >= compared.euros){
            return false;
        } else if(this.cents > compared.cents){
            return false;
        } else return true;
    }
    public Money minus(Money decreaser) {
        int euroDiff = euros-decreaser.euros();
        int centDiff = cents-decreaser.cents();
        int totalDiffInCents = euroDiff*100 + centDiff;

        if(totalDiffInCents <= 0){
            return new Money(0,0);
        }else{
            int eurosRtn = totalDiffInCents/100;
            int centRtn = totalDiffInCents%100;
            return new Money(eurosRtn, centRtn);
        }
    }
    public static void main(String[] args){
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
//  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}
