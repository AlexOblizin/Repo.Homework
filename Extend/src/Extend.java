public class Extend {
    public static void main(String[] args) {
        Programmer p = new Programmer("Виктор", "Нижний Новгород", 19, 3);
        System.out.println("Программист - " + p.getTextInfo());

    Worker w = new Worker();
    {
    w.setSalary(50000);
    System.out.println("Рабочий - " + w.getTextInfo());
    System.out.println((new Worker()).getTextInfo());//а можно и так System.out.println(new Worker().getTextInfo());
    // т.е. new Worker() не заключать в скобки
    }
    Person prog = new Programmer("Лев", "Москва",33,15); // пример полиморфизма
    // (взаимозаменяемости объектов) - и Programmer и Worker это разновидности класса Person, поэтому
    // все наследники удовлетворяют требованию принадлежности к классу Person. Так писать можно.
    // но обратно делать нельзя (типа Worker work = new Person(), так как каждый Programmer и Worker является Person,
    // но не каждый Person является Worker или Programmer)
        System.out.println(prog.getTextInfo());



    }
}
