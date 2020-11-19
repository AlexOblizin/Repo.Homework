public interface IfExt1 {

    void meth1();
    void meth2();
    int aaa();

    default String getStringDefaultMeth(){
        System.out.println();
        return "и ещё метод по умолчанию";
    }

}
