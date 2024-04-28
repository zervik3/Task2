import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat boris = new Cat("Boris",
                LocalDate.of(
                        2005,
                        12,
                        21),
                new ArrayList<>(),
                "Distemper",
                "Vasiliy Berezov",
                4);
        Dog sosiska = new Dog("Sosiska",
                LocalDate.of(
                        2001,
                        3,
                        14),
                new ArrayList<String>(List.of("SAS", "SDDS")),
                "ORVI",
                "Agatha Smirnova");
        Turkey josef = new Turkey("Josef",
                LocalDate.of(
                        2023,
                        4,
                        1),
                new ArrayList<String>(List.of("H5N1", "PHAIZER", "SPUTNIC")),
                "Bird Flu",
                "Ursul Umbaku");
        Monkey michael = new Monkey("Michael",
                LocalDate.of(
                        2010,
                        5,
                        12),
                new ArrayList<String>(List.of("PHIZER", "SPUTNIC", "KAZVAK")),
                "Diarrhea",
                "Research Institute",
                40);
        Turkey yusuf = new Turkey("Yusuf",
                LocalDate.of(
                        2010,
                        3,
                        15),
                new ArrayList<String>(List.of("SDsadas","sdasdsa")),
                "Flu",
                "Samantha Smith");
        Fish samuel = new Fish("Samuel",
                LocalDate.of(
                        2022,
                        1,
                        18),
                new ArrayList<String>(),
                "Fish flu",
                "Cathrine Forman");
        Duck kryakva = new Duck("Kryakva",
                LocalDate.of(
                        2023,
                        1,
                        14),
                new ArrayList<>(),
                "Bird Flu",
                "Sebastian Schwanshtaiger");

        List<Animal> animalList = new ArrayList<>();
        animalList.add(boris);
        animalList.add(sosiska);
        animalList.add(josef);
        animalList.add(michael);
        animalList.add(yusuf);
        animalList.add(kryakva);

        VetClinic vetClinic01 = new VetClinic();
        vetClinic01.staff = new HashMap<>();

        Doctor johnson = new Doctor("Therapist",1,"Steven Johnson");
        Doctor miles = new Doctor("Veterinarian",2,"Meredith Miles");
        Nurse marks = new Nurse("Paramedic",3,"Cathrine Marks",johnson);
        Nurse howland = new Nurse("Nurse",3,"Sarah Howland",miles);

        vetClinic01.addStaff(johnson,marks);
        vetClinic01.addStaff(miles,howland);

        vetClinic01.doctorsAppointment = new HashMap<>();

        System.out.println("Reception schedule");

        vetClinic01.addAppointment(boris,johnson);
        vetClinic01.addAppointment(sosiska,johnson);
        vetClinic01.addAppointment(josef,johnson);
        vetClinic01.addAppointment(yusuf,miles);
        vetClinic01.addAppointment(kryakva,miles);
        vetClinic01.showAppointment();


    }
}