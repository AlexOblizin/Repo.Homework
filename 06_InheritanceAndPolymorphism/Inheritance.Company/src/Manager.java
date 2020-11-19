public class Manager implements Employee {
    private Company company;
    private final double min = 10000.00;
    private final double max = 12000.00;
    private final double salaryManager = (int) (min + (int) ((Math.random() * max)));
    private final double BONUS = 0.05;

    private final double MIN_INCOME = 115000.00;
    private final double MAX_INCOME = 140000.00;
    private final double income =
            (int) (MIN_INCOME + (int) (Math.random() * ((MAX_INCOME - MIN_INCOME) + 1)));


    @Override
    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        return salaryManager + (income * BONUS);
    }
}
