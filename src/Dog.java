import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Goable,Swimble{
    public Dog(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        super(name, birthDate, vaccination, illness, ownerName);
    }

    @Override
    public void lifeCircle() {
        System.out.println("dskjgdjabdjah");
    }


    @Override
    public double run() {
        System.out.printf("%s %s is running",type,name);
        return 0;
    }

    @Override
    public double swim() {
        System.out.printf("%s %s is swimming",type,name);
        return 0;
    }
}