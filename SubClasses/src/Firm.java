public class Firm {

    public String nameFirm;
    public Director director;

    public Firm (String nameFirm, String nameDirector, int ageDirector)
    {
        this.nameFirm = nameFirm;
        this.director = new Director(nameDirector, ageDirector);

    }

    class Director { //создали внутренний класс (можно создавать и не один). Фишка в том, что внутри него
        // мы имеем доступ к полям внешнего класса, даже если поля будут с модификатором private
        public String name;
        public int age;

        public Director(String name, int age){
            this.name = name;
            this.age = age;
            System.out.println("Создан директор в фирме: " + nameFirm);
        }


        public boolean isPensioner()
             {
                 return age >= 60;
             }

    }


}

