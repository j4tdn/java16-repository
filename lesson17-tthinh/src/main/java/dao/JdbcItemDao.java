package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import configuration.DbConnection;
import dto.ItemDto;
import utils.DateUtils;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao {
	private Connection connection;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}
	
	private static final String Q_GETS_ITEMS_BY_DATE = ""
			+ "SELECT it.ID         "  + ItemDto.ITEM_ID         + ", \n"
			+ "       it.`NAME`     "  + ItemDto.ITEM_NAME       + ", \n"
			+ "       od.ORDER_TIME "
			+ "	FROM ITEM it \n"
			+ "    JOIN ORDER_DETAIL odd \n"
			+ "     ON it.ID = odd.ITEM_ID \n"
			+ "    JOIN ORDER od \n"
			+ "     ON od.ID = odd.ORDER_ID \n"
			+ "	WHERE CAST(od.ORDER_TIME AS DATE) = ?";

	private static String Q_GETS_THREE_ITEMS_BEST_SEELING_OF_THE_YEAR = ""
			+ "SELECT 	it.`NAME`     "  + ItemDto.ITEM_NAME       + ", \n"
			+ "FROM item it\n"
			+ "JOIN item_detail itt \n"
			+ "	ON itt.ID = it.ID\n"
			+ "JOIN item_group ig\n"
			+ "	ON ig.ID = it.ID\n"
			+ "JOIN order_detail odd\n"
			+ "	ON odd.ID = it.ID\n"
			+ "JOIN order od \n"
			+ "	ON od.ID = odd.ID\n"
			+ "WHERE YEAR(od.ORDER_TIME) = ? \n"
			+ "ORDER BY itt.AMOUNT DESC\n"
			+ "LIMIT 3;";
	
	public List<ItemDto> getItemsByDate(LocalDate orderDate) {
			List<ItemDto> result = new ArrayList<ItemDto>(); 
		
		try {
			pst = connection.prepareStatement(Q_GETS_ITEMS_BY_DATE);
			pst.setDate(1, DateUtils.toDate(orderDate));
			rs = pst.executeQuery();
			while(rs.next()) {
				result.add(ItemDto.addResultTransformer(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs,pst);
		}
		
		return result;
	}



	public List<String> getThreeItemBestSellingOfTheYear(int year) {
		List<String> result = new ArrayList<String>();
		try {
			pst = connection.prepareStatement(Q_GETS_THREE_ITEMS_BEST_SEELING_OF_THE_YEAR);
			pst.setInt(1, year);
			rs = pst.executeQuery();
			while(rs.next()) {
				result.add(rs.getString("`NAME`"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs,pst);
		}
		
		
		return result;
	}
}