class SavingsAccount{
    private static int annualInterestRate=4;
    private double savingsBalance;
    public SavingsAccount(double balance){
        this.savingsBalance=balance;
    }
    public static void modifyInterestRate(int new_rate){
        annualInterestRate=new_rate;
    }
    public double calculateMonthlyInterest(){
        double new_balance=(savingsBalance*annualInterestRate)/12;
        return new_balance+savingsBalance;
    }
}
 class Experiment_3{
     public static void main (String[] args) {
         SavingsAccount saver1=new SavingsAccount(2000.00);
         SavingsAccount saver2=new SavingsAccount(3000.00);
        //  saver1.modifyInterestRate(4);
        //  saver2.modifyInterestRate(4);
         System.out.println("Balance of saver1 : "+saver1.calculateMonthlyInterest());
         System.out.println("Balance of saver2 : "+saver2.calculateMonthlyInterest());
         saver1.modifyInterestRate(5);
         saver2.modifyInterestRate(5);
         System.out.println("After changing interest to 5%");
         System.out.println("Balance of saver1 : "+saver1.calculateMonthlyInterest());
         System.out.println("Balance of saver2 : "+saver2.calculateMonthlyInterest());
     }
 }


