package bean;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;


    // constructor
    private User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phone = builder.phone;
        this.address = builder.address;
        this.age = builder.age;
    }

    public static Builder builder(){
        return new Builder();
    }

    // getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    // nested class
    public static class Builder{
        private String firstName, lastName, phone, address;
        private int age;

        private Builder(){

        }

        // setter
        public Builder withFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder withPhone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder withAddress(String address){
            this.address = address;
            return this;
        }

        public Builder withAge(int age){
            this.age = age;
            return this;
        }

        // Build
        public User build(){
            // this = current Builder
            return new User(this);
        }
    }

}
