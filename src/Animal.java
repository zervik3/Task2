import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccination;
    protected String illness;
    protected String type;
    protected String ownerName;

    protected Animal(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccination = vaccination;
        this.illness = illness;
        this.ownerName = ownerName;
        this.type = getClass().getSimpleName();

    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccination() {
        return vaccination;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccination=" + vaccination +
                ", illness='" + illness + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    public void animalWakeUp() {
        System.out.printf("%s %s wakeup \n",type,name);
    }


    private void animalEat() {
        System.out.printf("%s %s ate \n",type,name);
    }

    protected void animalPlay() {
        System.out.printf("%s %s played \n",type,name);
    }

    private void animalSleep() {
        System.out.printf("%s %s sleep \n",type,name);
    }

//    protected void fly() {
//        System.out.printf("%s %s can fly and flying \n",type,name);
//    }
//    protected void toGo(){
//        System.out.printf("%s %s going \n",type,name);
//    }
//    protected void swim(){
//        System.out.printf("%s %s Swimming \n",type,name);
//    }

    public abstract void lifeCircle();
//    public void additionalAbilities(){
//        fly();
//        toGo();
//        swim();
//    }
}