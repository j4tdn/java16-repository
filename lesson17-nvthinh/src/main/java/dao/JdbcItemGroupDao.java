package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import configuration.DbConnection;

import java.sql.Connection;
import dto.ItemGroupDto;
import utils.DateUtils;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	private static final String GET_ITEMS_GROUPS = ""
			+ "SELECT IG.*, group_concat(concat(IT.NAME, \"-\", ORD.AMOUNT)) ITEM_LIST, sum(ORD.AMOUNT) TOTAL_AMOUNT \n"
			+ "FROM ITEM_GROUP IG\n"
			+ "JOIN ITEM IT\n"
			+ "ON IG.ID = IT.ID\n"
			+ "JOIN ORDER_DETAIL ORD\n"
			+ "ON IT.ID = ORD.ID\n"
			+ "GROUP BY IG.ID";
	public JdbcItemGroupDao() {
		connection = DbConnection.getConnection();
	}
	@Override
	public List<ItemGroupDto> getItemGroupsDtos() {
		List<ItemGroupDto> result = new ArrayList();
		try {
			pst = connection.prepareStatement(GET_ITEMS_GROUPS);
			rs = pst.executeQuery();
			while(rs.next())
			{
				ItemGroupDto itemGroup = new ItemGroupDto(rs.getInt("ID"),
										   rs.getString("NAME"), 
										   rs.getString("ITEM_LIST"),
										   rs.getInt("TOTAL_AMOUNT"));
				result.add(itemGroup);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		return null;
	}
	public List<ItemGroupDto> getItemGroups() {
		// TODO Auto-generated method stub
		return null;
	}
}