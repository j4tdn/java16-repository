package view;

public class Ex01Main {
	public static void main(String[] args) {
		Ex01Student[] students = { new Ex01Student(102, "Nam", "C"), new Ex01Student(103, "Bảo", "F"),
				new Ex01Student(104, "Hoàng", "D"), new Ex01Student(105, "Nguyên", "B"), new Ex01Student(107, "Vũ", "F"),
				new Ex01Student(109, "Lan", "A"), new Ex01Student(202, "Đạt", "C"), new Ex01Student(103, "Bảo", "F"),
				new Ex01Student(107, "Vũ", "C"), new Ex01Student(104, "Hoàng", "B") };
		System.out.print("Danh sach sinh vien dat loai A trong nam 2021: ");
		type(students);
		System.out.print("Danh sach sinh vien hoc lai: ");
		restudy(students);
	}

	private static void type(Ex01Student[] students) {
		for (Ex01Student st : students) {
			if (st.getType().equals("A")) {
				System.out.println(st.getName());
			}
		}

	}

	private static void restudy(Ex01Student[] students) {
		for (Ex01Student st : students) {
			if (st.getType().equals("F")) {
				System.out.print(st.getName() + " ");
			}
		}

	}
}
