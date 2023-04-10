package utils;

public class SqlUtils {
	public static void close(AutoCloseable...closeables) {
		for(AutoCloseable closeable: closeables) {
			try {
				closeable.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
