package Interview_Questions;
@FunctionalInterface
public interface FInterface1 {
    public abstract int sum();
    default void defaultMethod() {
        System.out.println("Interface 1 default method");
    }
}
