package utils;

import java.sql.ResultSet;

import bean.ItemGroup;

public class SqlUtils {
	public static void close(AutoCloseable...closeables) {
		for (AutoCloseable closeable : closeables) {
			try {
				closeable.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static ItemGroup transformer(ResultSet rs) {
		ItemGroup itemGroup = null;
		try {
			itemGroup = new ItemGroup(
										rs.getInt(ItemGroup.PROP_ID), 
										rs.getString(ItemGroup.PROP_NAME), 
										rs.getString(ItemGroup.PROP_DESC));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return itemGroup;
	}
}
