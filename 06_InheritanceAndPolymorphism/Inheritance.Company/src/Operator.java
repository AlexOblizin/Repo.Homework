public class Operator implements Employee {
    private Company company;
    private final double min = 5000.00;
    private final double max = 7000.00;
    private final int salaryOperator = (int) (min + (int) (Math.random() * max));

    @Override
    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        return salaryOperator;
    }
}
