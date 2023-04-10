package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import configuration.DbConnection;
import dto.ItemGroupDto;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao{

	private Connection connection;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcItemGroupDao() {
		connection = DbConnection.getConnection();
	}
	
	private static final String Q_GETS_ITEMS_BY_ITEM_GROUP = ""
			+ "SELECT ig.ID " + ItemGroupDto.ID_ITEM_GROUP  + " , \n"
			+ "       ig.`NAME` " + ItemGroupDto.NAME_ITEM_GROUP + " ,\n"
			+ "	   GROUP_CONCAT(CONCAT(it.`NAME`, '-', id.SIZE_ID, '-', id.AMOUNT, it.`NAME`, id.AMOUNT) SEPARATOR ', ') iTEM_SIZE_DETAIL, \n"
			+ "       SUM(id.AMOUNT) TOTAL_AMOUNT " + ItemGroupDto.NUMBER_OF_ITEMS_BY_ITEM_GROUP + " ,\n"
			+ "	FROM ITEM_GROUP ig \n"
			+ "    JOIN ITEM it \n"
			+ "	  ON ig.ID = it.ITEM_GROUP_ID \n"
			+ "	JOIN ITEM_DETAIL id\r\n"
			+ "	  ON it.ID = id.ITEM_GROUP_ID \n"
			+ "GROUP BY ig.ID;";

	public List<ItemGroupDto> getItemsByItemGroup() {
		List<ItemGroupDto> result = new ArrayList<ItemGroupDto>();
		
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GETS_ITEMS_BY_ITEM_GROUP);
			while(rs.next()) {
				result.add(ItemGroupDto.addResultTransformer(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs,st);
		}
		
		return result;
	}

}