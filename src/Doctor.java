public class Doctor {
    private String specialization;
    private int category;
    private String name;
    private Nurse nurse;
    protected String type;


    public Doctor(String specialization,int category,String name){
        this.specialization = specialization;
        this.category = category;
        this.name = name;
        this.type = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Doctor " + name + " ";
    }
}
