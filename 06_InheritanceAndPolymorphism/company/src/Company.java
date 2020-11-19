import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Company {


    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();


    }



    public void hire(List<Employee> employeeList, Employee employee) {
        employeeList.add(employee);
    }

    public void fire(List<Employee> employeeList,int num) {
        employeeList.remove(num);

    }

//    public void hireAll(List<Employee> emloyeesList) {
//
//        employees.addAll(emloyeesList);
//    }

    public ArrayList<Employee> getLowestEmployees(int count){


        return new ArrayList<Employee>();
    }

    public ArrayList<Employee> getTopEmployees(int count){


        return new ArrayList<Employee>();
    }

    public static int getIncome() {

        Random randomIncomeOfCompany = new Random();
        int income = (randomIncomeOfCompany.nextInt(100000) + 800000) * 12;

        return income;
    }

}
