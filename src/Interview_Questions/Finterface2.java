package Interview_Questions;
import java.lang.FunctionalInterface;
@FunctionalInterface
public interface Finterface2 {
    public abstract int sub();
    default void defaultMethod() {
        System.out.println("Interface 2 default method");
    }
}
