import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class VetClinic {
    protected Map<Doctor, Nurse> staff;
    private List<Animal> patients = new ArrayList<>();
    protected Map<Animal, Doctor> doctorsAppointment;

    public void addStaff(Doctor doctor, Nurse nurse) {
        staff.put(doctor, nurse);
    }

    public void showStaff() {
        for (Map.Entry<Doctor, Nurse> entry : staff.entrySet()) {
            Doctor key = entry.getKey();
            Nurse value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }

    public void addAppointment(Animal animal, Doctor doctor) {
        doctorsAppointment.put(animal, doctor);
    }

    public void showAppointment() {
        for (Map.Entry<Animal, Doctor> entry : doctorsAppointment.entrySet()) {
            Animal key = entry.getKey();
            Doctor value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }

    public void addPatient(Animal animal) {
        patients.add(animal);
    }

    public void addPatients(Animal... animals) {
        Collections.addAll(patients, animals);
    }

    public List<Goable> getGoables() {
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal a : patients) {
            if (a instanceof Goable) {
                result.add((Goable) a);
            }
        }
        return result;
    }

    public List<Flyble> getFlyables() {
        List<Flyble> result = new ArrayList<>(patients.size());
        for (Animal a : patients) {
            if (a instanceof Flyble) {
                result.add((Flyble) a);
            }
        }
        return result;
    }

    public List<Swimble> getSwimble() {
        List<Swimble> result = new ArrayList<>(patients.size());
        for (Animal a : patients) {
            if (a instanceof Swimble) {
                result.add((Swimble) a);
            }
        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }

}
