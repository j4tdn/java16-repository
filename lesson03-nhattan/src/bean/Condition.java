package bean;

@FunctionalInterface
public interface Condition {
	boolean test(String s);
}
