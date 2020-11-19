public class InterfacesExtend {
    public static void main(String[] args) {
        IfExt2 ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
        System.out.println(ob.aaa());
        ob.meth3def(); // реализация метода по умолчанию. meth3def() не обязательно реализовывать -
                       // можно его закомментить и программа скомпилируется без ошибки
                       // и при этом НЕ НУЖНО объявлять класс MyClass АБСТРАКТНЫМ. Тем более мы реализуем default
                        // метод даже не прописывая его в классе MyClass, а сразу в методе main(). default метод
                        // определяется в MyClass автоматически. (Разумеется, реализация метода
                     // getStringDefaultMeth() в классе потребуется в том случае,
        // если его предполагается использовать в этом классе для каких-нибудь других целей,
        // а не только по умолчанию.)


        System.out.println(ob.getStringDefaultMeth()); // еще один метод по умолчанию, но из интерфейса IfExt1
    }

}

class MyClass implements IfExt2{
    public void meth1(){
        System.out.println("Реализация метода meth1()");
    }
    public void meth2(){
        System.out.println("Реализация метода meth2()");
    }
    public void meth3(){
        System.out.println("Реализация метода meth3()");
    }
    public int aaa(){
        return 12;
    }

    // переопределение default метода getStringDefaultMeth()
    // определенного в интерфейсе
    /*@Override
    public String getStringDefaultMeth() {
        return "Переопределение метода";
    }*/
}