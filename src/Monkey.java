import java.time.LocalDate;
import java.util.List;

public class Monkey extends Animal{
    private int iq;
    protected Monkey(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName,int iq) {
        super(name, birthDate, vaccination, illness, ownerName);
        this.iq = iq;
    }

    @Override
    public void lifeCircle() {
        System.out.println("dsgfjdsgjf");
    }
}
