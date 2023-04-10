package utils;

public class SQLUtils {
	public static void close (AutoCloseable...closeables) {
		for(AutoCloseable closeable: closeables) {
			try {
				closeable.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
