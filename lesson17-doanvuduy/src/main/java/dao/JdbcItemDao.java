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
import persistence.ItemGroup;
import utils.DateUtils;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao {
	
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	private static final String GET_ITEMS_DATE = ""
			 "SELECT item.ID MaMH, item.`NAME` TenMH, DATE_FORMAT(`order`.ORDER_TIME, '%H:%i:%s') ThoiGianDatHang\n"
				+ "FROM item\n"
				+ "JOIN order_detail ON order_detail.ITEM_ID = item.ID\n"
				+ "JOIN `order` ON order_detail.ORDER_ID = `order`.ID\n"
				+ "WHERE `order`.ORDER_TIME = ?;";
	private static final String GET_TOP3_ITEMS = ""
			+ "SELECT it.ID " + ItemAmountDto.PROP_ID +", \n"
			+ "		it.NAME " + ItemAmountDto.PROP_NAME +", \n"
			+ "        SUM(odd.AMOUNT) " + ItemAmountDto.PROP_AMOUNT +"\n"
			+ "   FROM `ORDER`od \n"
			+ "   JOIN ORDER_DETAIL odd \n"
			+ "	 ON od.ID = odd.ORDER_ID \n"
			+ "   JOIN ITEM it \n"
			+ "     ON odd.ITEM_ID = it.ID \n"
			+ "  WHERE YEAR(od.ORDER_TIME) = ? \n"
			+ "  GROUP BY it.ID"
			+ "  ORDER BY SUM(odd.AMOUNT) DESC \n"
			+ "  LIMIT 3";
	private static final String GET_ITEMS_GROUPBY_IG = ""
			+ "WITH MAX_SELL_PRICE_ITEMS AS ( \n"
			+ "SELECT ig.ID IG_ID, \n"
			+ "	  MAX(it.SELL_PRICE) MAX_PRICE \n"
			+ "  FROM ITEM_GROUP ig \n"
			+ "  JOIN ITEM it \n"
			+ "    ON ig.ID = it.ITEM_GROUP_ID \n"
			+ " GROUP BY ig.ID) \n"
			+ " \n"
			+ "SELECT it.ID " + ItemSellPriceDto.PROP_ID + ", \n"
			+ "	      it.NAME " + ItemSellPriceDto.PROP_NAME + ", \n"
			+ "       it.ITEM_GROUP_ID " + ItemSellPriceDto.PROP_ITEM_GROUP_ID + ", \n"
			+ "       it.SELL_PRICE " + ItemSellPriceDto.PROP_SELL_PRICE + " \n"
			+ "  FROM ITEM it, \n"
			+ "	      MAX_SELL_PRICE_ITEMS ms \n"
			+ " WHERE it.ITEM_GROUP_ID = ms.IG_ID \n"
			+ "   AND it.SELL_PRICE = ms.MAX_PRICE";
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
				ItemDto item = new ItemDto(rs.getInt("MaMH"),
										   rs.getString("TenMH"), 
										   DateUtils.toST(rs.getTime("ThoiGianDatHang")));
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
				ItemDto item = new ItemDto(rs.getInt("MaMH"),
										   rs.getString("TenMH"), 
										   rs.getInt("TongSoLuong"));
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
		List<ItemDtoByIG> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(GET_ITEMS_GROUPBY_IG);
			rs = pst.executeQuery();
			while(rs.next())
			{
				ItemDtoByIG item = new ItemDtoByIG(rs.getInt("MaMH"),
										   rs.getString("TenMH"), 
										   rs.getString("MauSac"),
										   new ItemGroup(rs.getInt("MaLH"),null),
										   rs.getDouble("GiaBan"));
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