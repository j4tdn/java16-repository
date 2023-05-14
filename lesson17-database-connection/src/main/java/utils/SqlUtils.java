package utils;

public class SqlUtils {
	public static void close(AutoCloseable...autoCloseables) {
		for(AutoCloseable closeable: autoCloseables) {
			try {
				closeable.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
