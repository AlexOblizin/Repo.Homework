package access;

public class Person2
    {
    public String name;// стараемся не делать public
    protected String city; // делаем protected, ecли свойство будет использоваться в дочернем классе
    private int age;// делаем private желательно всегда (а для доступа к свойствам писать методы get и set,
                    // то есть геттеры и сеттеры)
    public static int count = 0; //слово static означает, что данное свойство count принадлежит не объекту в классе
        //Person2, а самому классу Person2


    public Person2(String name, String city, int age)
    {
        this.name = name;
        this.city = city;
        this.age = age;
        count++; //увеличиваем его на единицу при каждом создании нового объекта класса Person2
    }
    public Person2()
        {
            this("Default name","Default city",18);
        }

    public String getTextInfo()
        {
            return "Имя: " + this.name + "; Город: " + this.city + "; Возраст: " + this.age;

        }
        public String getName()
        {
            return this.name; //возвращаем поле ТЕКУЩЕГО объекта name
        }
        public String getCity()
        {
            return this.city;
        }
        public int getAge()
        {
            return this.age;
        }

        public void setName(String name) // по аналогии с Турбо Паскаль это процедура, поскольку метод не возвращает
        // никаких значений.
        {
            this.name = name;
        }

        public void setCity(String city)
        {
            this.city = city;
        }

        public void setAge(int age)
        {
            this.age = age;
        }
        public void setName()
        {
            setName("Default name");
        }
        public void setCity()
        {
            setCity("Default city");
        }
        public void setAge()
        {
            setAge(18);
        }

        /*public void whoIsOlder(Person2 p)
        {
            if (this.age > p.age) System.out.println(this.name + " старше, чем " + p.name);
            else if (this.age == p.age) System.out.println(this.name + " и " + p.name + " ровесники");
            else System.out.println(this.name + " младше, чем " + p.name);
        }*/
        public static int getCount()
        {
            return count;
        }
    }
