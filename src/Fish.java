import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal implements Swimble{
    protected Fish(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        super(name, birthDate, vaccination, illness, ownerName);
    }

    @Override
    public void lifeCircle() {
        System.out.println("sdasdas");
    }

    @Override
    public double swim() {
        System.out.printf("%s %s can swim ~ ",type,name);
        return 40;
    }
}