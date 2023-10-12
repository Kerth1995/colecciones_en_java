package stacksAndQueues.queues.appHospital;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PatientAttention {
    public static List<Patient> getAllPatients(){
        return Arrays.asList(new Patient("Patient17", 8, Gravity.MINOR),
                new Patient("Patient1", 12, Gravity.MODERATE),
                new Patient("Patient2", 16, Gravity.SEVERE),
                new Patient("Patient3", 20, Gravity.VERY_SEVERE),
                new Patient("Patient4", 28, Gravity.MINOR),
                new Patient("Patient5", 36, Gravity.MODERATE),
                new Patient("Patient6", 42, Gravity.SEVERE),
                new Patient("Patient7", 50, Gravity.VERY_SEVERE),
                new Patient("Patient8", 58, Gravity.MINOR),
                new Patient("Patient9", 62, Gravity.MODERATE),
                new Patient("Patient10", 70, Gravity.SEVERE),
                new Patient("Patient11", 78, Gravity.VERY_SEVERE),
                new Patient("Patient12", 86, Gravity.MINOR),
                new Patient("Patient13", 4, Gravity.MODERATE),
                new Patient("Patient14", 10, Gravity.SEVERE),
                new Patient("Patient15", 92, Gravity.VERY_SEVERE),
                new Patient("Patient16", 100, Gravity.MINOR),
                new Patient("Patient18", 1, Gravity.MODERATE));
    }

    public static void main(String[] args) {
        Queue<Patient> patients = new PriorityQueue<>(getAllPatients());
        //System.out.println(patients.toString());

        //patients.forEach(System.out::println);
        int listSize = patients.size();
        for (int i=0; i < listSize ; i++){
            Patient patient = patients.poll();
            System.out.println(patient.getGravity().getDescription());
        }
    }
}
