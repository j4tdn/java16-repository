package homework;

public class Direction extends People {
public Direction() {
}

public void countSal() {
	salary = ((salaryFactor + positionFactor) * 300000);
}
@Override
public String toString() {
	return "Direction [Salary=" + salary + "]";
}


}
