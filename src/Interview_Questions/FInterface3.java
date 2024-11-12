package Interview_Questions;

public interface FInterface3 extends FInterface1,Finterface2 {


    @Override
    default int sum() {
        return 0;
    }
    @Override
    default int sub() {
        return 0;
    }
    @Override
    default void defaultMethod() {
        FInterface1.super.defaultMethod();
    }
}
