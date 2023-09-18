public class SalaryWorker extends Worker{
    private double annualSalary;

    public SalaryWorker(Person person, double annualSalary) {
        super(person, 0);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        return "Weekly pay: " + weeklyPay;
    }
}
