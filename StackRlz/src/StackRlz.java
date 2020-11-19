public class StackRlz {
    public static void main(String[] args) {
        // вариант фиксированного стека

        /*В приведенной ниже программе создается класс FixedStack, реализующий
        версию целочисленного стека фиксированной длины.*/


        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);
        // разместить числа в стеке

        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Стек в mystack1: ");
        for (int i = 0; i < 5; i++) System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2: ");
        for (int i = 0; i < 8; i++) System.out.println(mystack2.pop());

        // вариант динамического стека

        /*Ниже приведена еще одна реализация интерфейса IntStack, в которой с помощью
        того же самого определения interface создается динамический стек.
        В этой реализации каждый стек создается с первоначальной длиной. При превышении
        этой начальной длины размер стека увеличивается. Каждый раз, когда возникает
        потребность в дополнительном свободном месте, размер стека удваивается.*/

        DynStack mystack11 = new DynStack(5);
        DynStack mystack22 = new DynStack(8);

        // в этих циклах увеличиваются размеры каждого стека

        for (int i = 0; i < 12; i++) mystack11.push(i);
        for (int i = 0; i < 20; i++) mystack22.push(i);

        System.out.println("Динамический стек в mystack11: ");
        for (int i = 0; i < 12; i++) System.out.println(mystack11.pop());

        System.out.println("Динамический стек в мystack22: ");
        for (int i = 0; i < 20; i++) System.out.println(mystack22.pop());

        // вариант с обеими реализациями

        /*Создать переменную интерфейса
        и обратиться к стекам через нее.*/

        /* В приведенном ниже примере создается класс, в котором используются
        обе реализации данного интерфейса в классах FixedStack и DynStack.
        Для этого применяется ссылка на интерфейс. Это означает, что поиск вариантов
        при вызове методов push ( ) и рор ( ) осуществляется во время выполнения, а не
        во время компиляции.*/

        IntStack mystack; // создать переменную ссылки на интерфейс IntStack
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds; // загрузить динамический стек
        // разместить числа в стеке
        for (int i = 0; i < 12; i++) mystack.push(i);

        mystack = fs; // разместить фиксированный стек
        for (int i = 0; i < 8; i++) mystack.push(i);

        mystack = ds;
        System.out.println("Значения в динамическом стеке: ");
        for (int i = 0; i < 12; i++) System.out.println(mystack.pop());

        mystack = fs;
        System.out.println("Значения в фиксированном стеке: ");
        for (int i = 0; i < 8; i++) System.out.println(mystack.pop());

        /*   В этом варианте переменная mystack содержит ссылку на интерфейс
        IntStack. Следовательно, когда она ссылается на переменную ds, выбираются
        варианты методов push () и рор (), определенные при реализации данного интерфейса
        в классе DynStack. Когда же она ссылается на переменную fs, выбираются
        варианты методов push () и рор (),определенные при реализации данного
        интерфейса в классе FixedStack. Как отмечалось ранее, все эти решения принимаются
        во время выполнения. Обращение к нескольким реализациям интерфейса
        через ссылочную переменную интерфейса является наиболее эффективным средством
        в Java для поддержки полиморфизма во время выполнения.*/

    }


}

// реализация интерфейса IntStack для стека фиксированного размера
class FixedStack implements IntStack{
    private int stck[];
    private int tos;
    // выделить память и инициализировать стек
    FixedStack(int size){
        stck = new int[size]; //определяется целочисленный стек размером size
        tos = -1; // инициализация вершины стека в конструкторе FixedStack()

    }
    // разместить элемент в стеке
    public void push(int item){
        if (tos == stck.length-1) // использовать поле длины стека
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }
    // извлечь элемент из стека
    public int pop(){
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else return stck[tos--];
        }

}
class DynStack implements IntStack{
    private int stck[];
    private int tos;

    // выделить память и инициализировать стек

    DynStack(int size){
        stck = new int[size];
        tos = -1;
    }
    // разместить элемент в стеке
    public void push(int item) {
        // если стек заполнен - выделить память под стек большего размера
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];
            // удвоить размер стека
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else stck[++tos] = item;
    }
        // извлечь элемент из стека
        public int pop(){
            if (tos < 0){
                System.out.println("Стек не загружен.");
                return 0;
            }
            else return stck[tos--];
        }

}
