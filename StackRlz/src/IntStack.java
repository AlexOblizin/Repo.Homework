/*
Создадим сначала интерфейс, определяющий целочисленный стек, разместив
его в файле IntStack.java. Этот интерфейс будет использоваться в обеих реализациях
стека.
*/

interface IntStack {
void push(int item); // сохранить элемент в стеке
int pop(); // извлечь элемент из стека

    //метод с реализацией по умолчанию, возвращающий массив из n элементов, начиная с вершины стека
    default int[] popNElements(int n){
        //возвратить запрашиваемые элементы из стека
        return getElements(n);
    }

    //метод с реализацией по умолчанию, возвращающий из стека массив из n элементов, следующих
    // после указанного количества пропускаемых элементов
    default int[] skipAndPopNElements(int skip, int n){
        //пропустить указанное количество элементов в стеке
        getElements(skip);
        // возвратить запрашиваемые элементы из стека
        return getElements(n);
    }

    //закрытый метод, возвращающий массив из n элементов, начиная с вершины стека
    private int[] getElements(int n){
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) elements[i] = pop();
        return elements;
    }

    default void clear(){
        System.out.println("Метод clear() не реализован."); // в будущем должен генерировать исключение
    }
}
