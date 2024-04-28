public class Nurse extends Doctor{
    private Doctor doctor;
    public Nurse(String specialization, int category, String name, Doctor doctor) {
        super(specialization, category, name);
        this.doctor = doctor;
    }

}