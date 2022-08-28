package example;

public class PersonDemo {
    public static void main(String[] args) {
        Student stA = new Student() {
            @Override
            public void gender() {
                System.out.println("MALE");
            }
        };

        Employee empB = new Employee() {
            @Override
            public void gender() {
                System.out.println("MALE");
            }
        };

        stA.eat();
        empB.eat();
    }
}
