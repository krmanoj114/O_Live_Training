import java.util.List;
import java.util.Objects;

public class Person {
    List<Integer> rentals;
    private String firstName;
    private String lastName;
    private String address;
    private int  age;
    private String phoneNumberHome;
    private String phoneNumberOffice;

    public List<Integer> getRentals() {
        return rentals;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumberHome() {
        return phoneNumberHome;
    }

    public void setPhoneNumberHome(String phoneNumberHome) {
        this.phoneNumberHome = phoneNumberHome;
    }

    public String getPhoneNumberOffice() {
        return phoneNumberOffice;
    }

    public void setPhoneNumberOffice(String phoneNumberOffice) {
        this.phoneNumberOffice = phoneNumberOffice;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", phoneNumberHome='" + phoneNumberHome + '\'' +
                ", phoneNumberOffice='" + phoneNumberOffice + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(lastName, person.lastName) && Objects
                .equals(address, person.address) && Objects.equals(phoneNumberHome, person.phoneNumberHome) && Objects
                .equals(phoneNumberOffice, person.phoneNumberOffice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), lastName, address, age, phoneNumberHome, phoneNumberOffice);
    }
}
