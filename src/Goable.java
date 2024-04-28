@FunctionalInterface
public interface Goable {
    public final static int i = 10;

    double run();

    default double acceleration() {
        return 9.8;
    }
}