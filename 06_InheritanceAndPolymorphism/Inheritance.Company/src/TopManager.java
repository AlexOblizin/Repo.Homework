public class TopManager implements Employee {

    private Company company;

    private final double min = 16000.00;
    private final double max = 18000.00;
    private final double fixedSalaryTopManager = (int) (min + (Math.random() * max));

    private final double BONUS = 1.5;
    private final double PLAN_OF_INCOME = 10000000.00;

    @Override
    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        double salaryTopManager;
        if (company.getIncome() > PLAN_OF_INCOME) {
            salaryTopManager = fixedSalaryTopManager + (fixedSalaryTopManager * BONUS);
        } else {
            salaryTopManager = fixedSalaryTopManager;
        }
        return salaryTopManager;
    }
}
