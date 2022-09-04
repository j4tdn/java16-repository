package ex01_studentmanagement;

/**
 * Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3, trong đó:
	1. sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số, thông tin biết rồi
	khỏi nhập từ bàn phím).
	2. sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông số, thông tin
	biết rồi khỏi nhập từ bàn phím).
	3. sv3 tạo bằng constructor mặc định. Tạo hàm nhập các thông tin cho sv3 từ bàn phím sau
	đó dùng setter để gán các thuộc tính tương ứng.
	4. Viết hàm tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5
	5. Viết hàm tìm thông tin sinh viên có điểm LT lớn hơn điểm TH
 */

public class App {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student(123, "Đoàn Nhật Tân", 2, 1);
		students[1] = new Student(456, "Nguyễn Dũng", 3, 1);
		students[2] = new Student();

		StudentUtils.inputStudent(students[2]);

		Condition avgGreater = new Condition() {

			@Override
			public boolean test(float lecPoint, float labPoint) {

				return (lecPoint + labPoint) / 2 > 8.5;
			}
		};

		Condition lecGreaterLab = new Condition() {

			@Override
			public boolean test(float lecPoint, float labPoint) {
				return lecPoint > labPoint;
			}
		};

		System.out.println("\n => Sinh viên có điểm trung bình lớn hơn 8.5: ");
		StudentUtils.printf(students, avgGreater);

		System.out.println("\n => Sinh viên có điểm lý thuyết lớn hơn thực hành: ");
		StudentUtils.printf(students, lecGreaterLab);

	}
}
