package extend;

public class Person
{ // создали класс Person (шаблон для создания объекта (или фабрика).
  // В нем описываются свойства (характеристики или поля), методы (действия), конструкторы и пр.

            String name; // создали поля (характеристики или по-другому свойства)
            String city; // создали поля (характеристики или по-другому свойства)
            int age; // создали поля (характеристики или по-другому свойства)



            Person (String name, String city, int age) // создали конструктор (имя всегда совпадает
            {                                             // с названием класса)/ В нем 3 параметра (значения)
                                                            // которые мы запросим у пользователя
                    this.name = name; // this это текущий или этот объект,
                    this.city = city; // через точку вызываются свойства (без скобок)
                    this.age = age; // или метод (но у метода всегда скобки). Этому (this) объекту (Person)
                                    // мы его свойству name присваиваем значение (параметр) name и т.д.


            }
    public Person() {
        this("Default","Default",25);
    }

        // пишем открытый (public) метод с именем getTextInfo(без входных параметров - т.е. параметры мы не запросили),
        // который возвращает значение типа String, а именно:
        // строку ""Имя: " + this.name + "; Город: " + this.city + "; Возраст: " + this.age;"
            public String getTextInfo() // метод возвращает (return) строку (String),
                                        // но мы сами параметры не запрашиваем (поэтому в скобках нет ничего)
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

    public void setName() // перегрузка методов
    {
        setName("Default name");
    }
    public void setCity() // перегрузка методов
    {
        setCity("Default city");
    }
    public void setAge() // перегрузка методов
    {
        setAge(15);
    }
    // компилятор допускает наличие одноименных (перегруженных) методов только в том случае, если у них иное
    // количество параметров либо иные сами параметры. И при программировании кода
    // в IDE предлагает выбор между ними
    // Например: public void setName(String name) - 1 параметр name типа String, а в public void setName() -
    // - нет параметров, поэтому оба из них одновременно допускаются компилятором без ошибок.

    // то есть допускается перегрузка методов и перрегрузка конструкторов, так как конструктор это по сути тот
    // же метод, который служит для создания новых объектов.


    public void setCity(String city)
        {
        this.city = city;
        }

    public void setAge(int age)
        {
        this.age = age;
        }

        public void whoIsOlder(Person p)//метод для сравнения возрастов задаваемых объектов -
        // объекта p класса Person2 и pNew
        {
            if (this.age > p.age) System.out.println(this.name + " старше, чем " + p.name);
            else if (this.age == p.age) System.out.println(this.name + " и " + p.name + " ровесники");
            else System.out.println(this.name + " младше, чем " + p.name);
        }
}
