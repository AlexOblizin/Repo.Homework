import java.lang.module.ModuleDescriptor;

public class Override {
    public static void main(String[] args) {
    B newOb = new B (1,2,3);

      newOb.show("Это k: "); // вызвать метод show() из класса B
      newOb.show(); // вызвать метод show() из класса A

    }
}
class A {
    int a,b;
    A(int c, int d){
        a = c;
        b = d;

    }
    //метод для вывода переменнных a и b
    void show(){
        System.out.println("a и b: " + a + " и " + b);
    }

}
    class B extends A{ // создаем подкласс B путем расширения класса A
    int k;
    B(int c, int d, int e){
        super(c,d);
        k = e;
    }
    void show(String msg){ // перегружаем метод super()
        System.out.println(msg + k);

    }
}
//Вариант метода show (), определенный в классе В, принимает строковый параметр.
//В итоге его сигнатура типа отличается от сигнатуры типа метода без параметров
//из класса А. Поэтому никакого переопределения (или сокрытия имени)
//не происходит. Вместо этого выполняется перегрузка варианта метода show ( ) ,
//определенного в классе А, вариантом, определенным в классе В.