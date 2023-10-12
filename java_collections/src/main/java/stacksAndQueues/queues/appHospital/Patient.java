package stacksAndQueues.queues.appHospital;

public class Patient implements  Comparable<Patient>{
    private String name;
    private Integer edge;
    private Gravity gravity;

    public Patient() {
    }

    public Patient(String name, Integer edge, Gravity gravity) {
        this.name = name;
        this.edge = edge;
        this.gravity = gravity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEdge() {
        return edge;
    }

    public void setEdge(Integer edge) {
        this.edge = edge;
    }

    public Gravity getGravity() {
        return gravity;
    }

    public void setGravity(Gravity gravity) {
        this.gravity = gravity;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", edge=" + edge +
                ", gravity=" + gravity +
                '}';
    }

    @Override
    public int compareTo(Patient patient) {
        return patient.gravity.getLevel() - this.gravity.getLevel();
    }
}
