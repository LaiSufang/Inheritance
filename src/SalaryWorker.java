public class SalaryWorker extends Worker{
    private double annualSalary;

    /**
     * @param ID worker id
     * @param firstName first name
     * @param lastName last name
     * @param title title
     * @param YOB year of birth
     * @param hourlyPayRate pay rate per hour
     * @param annualSalary annual salary
     */
    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    /**
     * @return return the weekly pay
     */
    public double calculateWeeklyPay(double hoursWorked) {
        return Math.round(annualSalary/52 * 100.0) / 100.0;
    }

    /**
     * print information of weekly pay on console
     * @param hoursWorked
     */
    public void displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        System.out.println("Weekly pay: $" + weeklyPay + ", is a fraction of the yearly salary: $" + annualSalary);
    }
    /**
     *
     * @return return a string of the salaryworker object
     */
    public String toString() {
        return "SalaryWorker{" +
                "annualSalary=" + annualSalary +
                '}';
    }
    /**
     *
     * @return return a string of the salaryworker object in CSV format
     */
    public String toCSV() {
        return "<Worker>" + "</Worker>" + "<annualSalary>" + annualSalary + "</annualSalary>";
    }
    /**
     *
     * @return return a string of the salaryworker object in JSON format
     */
    public String toJSON() {
        return "{" +
                ", \"annualSalary\":" + annualSalary +
                '}';
    }
}
