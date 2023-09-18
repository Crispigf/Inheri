import java.util.ArrayList;
import java.util.List;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an ArrayList to hold Worker instances
        List<Worker> workers = new ArrayList<>();

        // Create 3 Worker instances with reasonable hourly rates
        Worker worker1 = new Worker(new Person("1", "John", "Smith", "MR.", 1990), 10.0);
        Worker worker2 = new Worker(new Person("2", "Jane", "Smith", "MS.", 1995), 15.0);
        Worker worker3 = new Worker(new Person("3", "Mike", "Johnson", "MR.", 1995), 20.0);

        // Create 3 SalaryWorker instances with reasonable annual salaries
        SalaryWorker salaryWorker1 = new SalaryWorker(new Person("4", "Alice", "Smith", "MRS. ", 1988), 20000);
        SalaryWorker salaryWorker2 = new SalaryWorker(new Person("5", "Bob", "Johnson", "MR. ", 1990), 40000);
        SalaryWorker salaryWorker3 = new SalaryWorker(new Person("6", "Sarah", "Johnson", "MS. ", 1992), 60000);

        // Add workers and salary workers to the ArrayList
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        // Simulate 3 weekly pay periods
        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Payroll:");

            // Calculate and display weekly pay for each worker
            for (Worker worker : workers) {
                System.out.println(worker.getFirstName());
                double hoursWorked = (week == 2) ? 50.0 : 40.0;
                String payInfo = worker.displayWeeklyPay(hoursWorked);
                System.out.println(payInfo);
            }

            System.out.println(); // Add an empty line for separation
        }
    }
}
