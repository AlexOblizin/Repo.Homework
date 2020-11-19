public class SubClass {
    public static void main(String[] args) {
        Firm f = new Firm("ООО *Рога и копыта*", "Василий Алибабаевич", 55);
        System.out.println("Имя директора: " + f.director.name);
        System.out.println("Директор является пенсионером: " + f.director.isPensioner());
        f.director.age = 78;
        System.out.println("Директор является пенсионером: " + f.director.isPensioner());

    }
}
