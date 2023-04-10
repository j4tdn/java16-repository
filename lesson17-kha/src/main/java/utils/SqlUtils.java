package utils;

public class SqlUtils {
	private SqlUtils() {
	}

	public static void close(AutoCloseable... autoCloseables) {
		for (AutoCloseable autoCloseable : autoCloseables) {
			if (autoCloseable != null) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static <Element> void print(Element... e) {
		for (Element element : e) {
			System.out.println(element.toString());
			System.out.println();
		}
	}
}
