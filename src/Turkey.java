import java.time.LocalDate;
import java.util.List;

public class Turkey extends Animal implements Flyble,Swimble,Goable{

    protected Turkey(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        super(name, birthDate, vaccination, illness, ownerName);
    }

    @Override
    public void lifeCircle() {
        System.out.println("sadasdas");
    }


    @Override
    public double fly() {
        System.out.printf("%s %s is flying~ ",type,name);
        return 20.0;
    }

    @Override
    public double run() {
        System.out.printf("%s %s is going",type,name);
        return 10.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s %s swimming",type,name);
        return 15;
    }
    public void  sayHello(){
        System.out.println("Hello");
    }
}
