package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import dto.ItemDto;
import dto.ItemDtoByIG;
import bean.ItemGroup;
import utils.DateUtils;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao {
	
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	private static final String GET_ITEMS_DATE = ""
			+ "SELECT it.id, it.name, TIME(OR.ORDER_TIME) ORDER_TIME\n"
			+ "FROM item it \n"
			+ "JOIN ORDER_DETAIL ORD\n"
			+ "ON it.id = ORD.ID\n"
			+ "JOIN ORDER OR\n"
			+ "ON ORD.ID = OR.ID\n"
			+ "WHERE DATE(ORDER_TIME) = ? ";
	private static final String GET_TOP3_ITEMS = ""
			+ "SELECT IT.ID, IT.NAME, SUM(OR.AMOUNT) TOTAL_AMOUNT\n"
			+ "FROM item IT\n"
			+ "JOIN ORDER_DETAIL ORD\n"
			+ "ON IT.ID = ORD.ID\n"
			+ "JOIN ORDER OR\n"
			+ "ON OR.ID = ORDER.ID\n"
			+ "WHERE year(or.ORDER_TIME) = ? \n"
			+ "GROUP BY it.id\n"
			+ "limit 3";
	private static final String GET_ITEMS_GROUPBY_IG = ""
			
	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}
	@Override
	public List<ItemDto> getItems(LocalDate lDate) {
		List<ItemDto> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(GET_ITEMS_DATE);
			pst.setDate(1, DateUtils.toSDate(lDate));
			rs = pst.executeQuery();
			while(rs.next())
			{
				ItemDto item = new ItemDto(rs.getInt("ID"),
										   rs.getString("NAME"), 
										   DateUtils.toST(rs.getTime("ORDER_TIME")));
				result.add(item);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		return null;
	}
	@Override
	public List<ItemDto> getTopThreeItemByYear(int year) {
		List<ItemDto> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(GET_TOP3_ITEMS);
			Year y = Year.of(year);
			pst.setInt(1, y.getValue());
			rs = pst.executeQuery();
			while(rs.next())
			{
				ItemDto item = new ItemDto(rs.getInt("ID"),
										   rs.getString("NAME"), 
										   rs.getInt("TOTAL_AMOUNT"));
				result.add(item);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		return null;
	}
	@Override
	public List<ItemDtoByIG> getItemsGroupByItemGroup() {
		List<ItemDtoByIG> result = new ArrayList()<>();
		try {
			pst = connection.prepareStatement(GET_ITEMS_GROUPBY_IG);
			rs = pst.executeQuery();
			while(rs.next())
			{
				ItemDtoByIG item = new ItemDtoByIG(rs.getInt("ID"),
										   rs.getString("NAME"), 
										   rs.getString("COLOR"),
										   new ItemGroup(rs.getInt("ITEM_GROUP_ID"),null),
										   rs.getDouble("SELL_PRICE"));
				result.add(item);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		return null;
	}
}
