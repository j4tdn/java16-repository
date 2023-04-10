package utils;

public class SqlUtils {
	private SqlUtils() {
		// TODO Auto-generated constructor stub
	}
	public static void close(AutoCloseable...closeables) {
		for (AutoCloseable closeable : closeables) {
			try {
				closeable.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
