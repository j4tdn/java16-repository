package bean;

public class UserDetail {
    private String firstName, lastName, phone, address;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public UserDetail withFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public UserDetail withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public UserDetail withPhone(String phone){
        this.phone = phone;
        return this;
    }

    public UserDetail withAddress(String address){
        this.address = address;
        return this;
    }

    public UserDetail withAge(int age){
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }


}
