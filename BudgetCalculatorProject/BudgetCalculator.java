package BudgetCalculatorProject;
public class BudgetCalculator {

    //Define Constants
    public static final double SALARY = 4000.0;
    public static final double SAVINGS_PERCENT = 0.10;
    public static final double RENT_PERCENT = 0.30;
    public static final double GROCERIES_PERCENT = 0.15;
    public static final double ENTERTAINMENT_PERCENT = 0.10;
    
    public static void main(String[] args) {

        //Declare variables
        double monthlySalary = SALARY;
        double savedAmount, rentAmount, groceriesAmount, entertainmentAmount;
        double totalExpenses, remainingBalance;
    

        //Perform calculations
        savedAmount = monthlySalary * SAVINGS_PERCENT;
        rentAmount = monthlySalary * RENT_PERCENT;
        groceriesAmount = monthlySalary * GROCERIES_PERCENT;
        entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;
        totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        remainingBalance = monthlySalary - totalExpenses;
        
        //Display
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Amount Saved $" + savedAmount);
        System.out.println("Amount spent on rent $" + rentAmount);
        System.out.println("Amount spent on groceries $" + groceriesAmount);
        System.out.println("Amount spent on entertainment $" + entertainmentAmount);
        System.out.println("Total expenses $" + totalExpenses);
        System.out.println("Total remaining balance $" + remainingBalance);
    }
}
