
public class Worker extends Person {

    private double hourlyPayRate;
    public Worker(Person person, double hourlyPayRate){
        super(person.getID(), person.getFirstName(), person.getLastName(), person.getTitle(), person.getYOB());
        this.hourlyPayRate = hourlyPayRate;
    }
    double calculateWeeklyPay(double hoursWorked){
        if (hoursWorked <= 40) {
            return hourlyPayRate * hoursWorked;
        }
        else
        {
            double otHours = 0;
            otHours = hoursWorked -40;
            return ((hoursWorked - otHours) * hourlyPayRate) + (otHours * ((hourlyPayRate/2)+hourlyPayRate));
        }
    }
    String displayWeeklyPay(double hoursWorked){
        double otHours = hoursWorked - 40;
        double regularHours = hoursWorked - otHours;
        double regularPay = regularHours * hourlyPayRate;
        double overtimePay = otHours * ((hourlyPayRate/2)+hourlyPayRate);
        double totalWeeklyPay = calculateWeeklyPay(hoursWorked);

        String display = String.format(
                "Regular hours: %.2f\nRegular pay: %.2f\nOvertime hours: %.2f\nOvertime pay: %.2f\nTotal weekly pay: %.2f",
                regularHours, regularPay, otHours, overtimePay, totalWeeklyPay);

        return display;
    }


}