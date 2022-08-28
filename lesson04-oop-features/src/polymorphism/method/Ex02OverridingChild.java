package polymorphism.method;

public class Ex02OverridingChild extends Ex02OverridingParent{
    String text = "hi";
    @Override
    void log() {
        System.out.println("Child --> log");
    }
}
