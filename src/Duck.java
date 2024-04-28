import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Goable,Flyble,Swimble{
    protected Duck(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        super(name, birthDate, vaccination, illness, ownerName);
    }

    @Override
    public void lifeCircle() {

    }

    @Override
    public double fly() {
        System.out.printf("%s %s is flying~ ",type,name);
        return 30;
    }

    @Override
    public double run() {
        System.out.printf("%s %s is running~ ",type,name);
        return 10;
    }

    @Override
    public double swim() {
        System.out.printf("%s %s is swimming~ ",type,name);
        return 0;
    }
}