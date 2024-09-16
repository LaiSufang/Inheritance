public class Worker extends Person {
    private double hourlyPayRate;

    /**
     * @param ID worker id
     * @param firstName first name
     * @param lastName last name
     * @param title title
     * @param YOB year of birth
     * @param hourlyPayRate pay rate per hour
     */
    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    /**
     * function to calculate the total pay
     * @param hoursWorked
     * @return total pay
     */
    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hourlyPayRate * hoursWorked;
        }
        else {
            return (hourlyPayRate * 40) + (hoursWorked - 40) * hourlyPayRate * 1.5;
        }
    }

    /**
     * print information of weekly pay on console
     * @param hoursWorked
     */
    public void displayWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            System.out.println("Total hours worked: " + hoursWorked + "hours. Total pay: $" + calculateWeeklyPay(hoursWorked));
        }
        else {
            System.out.println("Total hours worked: " + hoursWorked + "hours. " + "Overtime hours: " + (hoursWorked-40) + ". Overtime pay: $" + (hoursWorked - 40) * hourlyPayRate * 1.5 + "Total pay: $" + calculateWeeklyPay(hoursWorked));
        }
    }

    /**
     *
     * @return return a string of the worker object
     */
    @Override
    public String toString() {
        return "Worker{" +
                "hourlyPayRate=" + hourlyPayRate +
                '}';
    }
    /**
     * @return return an XML formatted String of the worker object
     */
    public String toMXL() {
        return "<Person>" + "</Person>" + "<hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate>";
    }

    /**
     * @return return a JSON formatted String of the object worker
     */
    public String toJSON() {
        return "{" +
                ", \"hourlyPayRate\":" + hourlyPayRate +
                '}';
    }

}
