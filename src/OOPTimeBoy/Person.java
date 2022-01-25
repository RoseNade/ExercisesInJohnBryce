package OOPTimeBoy;

public class Person {
    private int id;
    private String lastName;
    private String firstName;
    private String city;
    private Boolean isSmoking;

    // default
    public Person() {
    }

    // partial const
    public Person(int id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    // full const
    public Person(int id, String lastName, String firstName, String city, Boolean isSmoking) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.isSmoking = isSmoking;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCity() {
        return city;
    }

    public Boolean getSmoking() {
        return isSmoking;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSmoking(Boolean smoking) {
        isSmoking = smoking;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", city='" + city + '\'' +
                ", isSmoking=" + isSmoking +
                '}';
    }
}
