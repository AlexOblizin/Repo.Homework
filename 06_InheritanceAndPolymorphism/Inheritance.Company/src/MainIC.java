public class MainIC {


    public static void main(String[] args) {
        Company company = new Company();

        for (int i = 1; i <= 180; i++) {
            company.hire(new Operator());
        }

        for (int i = 0; i < 50; i++) {
            company.hire(new Manager());
        }

        for (int i = 0; i < 15; i++) {
            company.hire(new TopManager());
        }

        company.getLowestEmployees(25);
        company.getTopEmployees(10);
        company.fire(50);
        company.getLowestEmployees(30);
        company.getTopEmployees(15);

    }


}