package ex01_studentmanagement;

@FunctionalInterface
public interface Condition {
	boolean test(float lecPoint, float labPoint);
}
