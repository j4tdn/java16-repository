package utils;

public class SqlUtils {
	public static void close(AutoCloseable ...closables) {
		for (AutoCloseable closable : closables) {
			try {
				closable.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
