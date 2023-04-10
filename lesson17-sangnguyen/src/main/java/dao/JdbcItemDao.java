package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.dsig.Transform;

import bean.Item;
import bean.ItemGroup;
import configuration.DbConnection;
import utils.SqlUtils;

public class JdbcItemDao extends AbstractJdbcDao implements ItemDao{
	
	
	private static final String PROP_ITEM_GROUP_ID = String.join("_",
			Item.PROP_ITEM, ItemGroup.PROP_ITEM_GROUP, ItemGroup.PROP_ID);
	
	private static final String PROP_ITEM_GROUP_NAME = String.join("_",
			Item.PROP_ITEM, ItemGroup.PROP_ITEM_GROUP, ItemGroup.PROP_NAME);
	
	private static final String PROP_ITEM_GROUP_DESC = String.join("_",
			Item.PROP_ITEM, ItemGroup.PROP_ITEM_GROUP, ItemGroup.PROP_DESC);
	
	private static final String GET_ALL_ITEMS = ""
			+ "SELECT it.ID			" + Item.PROP_ID 			+ ", \n"
			+ "		  it.`NAME`		" + Item.PROP_NAME 			+ ", \n"
			+ "		  it.COLOR		" + Item.PROP_COLOR			+ ", \n"
			+ "		  it.BUY_PRICE	" + Item.PROP_BUY_PRICE 	+ ", \n"
			+ "		  it.SELL_PRICE " +	Item.PROP_SELL_PRICE 	+ ", \n"
			+ "		  it.METERIAL	" + Item.PROP_METERIAL 		+ ", \n"
			+ "		  ig.ID			" + PROP_ITEM_GROUP_ID 		+ ", \n"
			+ "		  ig.NAME		" + PROP_ITEM_GROUP_NAME 	+ ", \n"
			+ "		  ig.IG_DESC	" + PROP_ITEM_GROUP_DESC 	+ "  \n"
			+ "	FROM ITEM it \n"
			+ "	JOIN ITEM_GROUP ig \n"
			+ "		ON it.ITEM_GROUP_ID = ig.ID";
	
	private static final String GET_ITEMS_BY_ORDER_TIME = ""
			+ "SELECT it.ID			" + Item.PROP_ID 			+ ", \n"
			+ "		  it.`NAME`		" + Item.PROP_NAME 			+ ", \n"
			+ "		  it.COLOR		" + Item.PROP_COLOR			+ ", \n"
			+ "		  it.BUY_PRICE	" + Item.PROP_BUY_PRICE 	+ ", \n"
			+ "		  it.SELL_PRICE " +	Item.PROP_SELL_PRICE 	+ ", \n"
			+ "		  it.METERIAL	" + Item.PROP_METERIAL 		+ " \n"
			+ "	FROM ITEM it\n"
			+ "	JOIN ORDER_DETAIL odd\n"
			+ "	  ON it.ID = odd.ITEM_ID\n"
			+ "	join `ORDER` od\n"
			+ "      on od.id = odd.ORDER_ID\n"
			+ "	WHERE CAST(od.ORDER_TIME AS DATE) = ?;";
	
	
	@Override
	public List<Item> getAll() {
		return getAll(GET_ALL_ITEMS,() -> transformerItem(rs, transformerItemGroup(rs)));
	}
	
	@Override
	public List<Item> getItems() {
		return getElements(GET_ALL_ITEMS, 
						   () -> transformerItem(rs, transformerItemGroup(rs)), 
						   pst -> {});
	}
	
	@Override
	public List<Item> getItems(LocalDate sellDate) {
		// TODO Auto-generated method stub
		return getElements(GET_ITEMS_BY_ORDER_TIME,
						   () -> transformerItem(rs, null),
						   pst -> {
							 try {
								pst.setDate(1, java.sql.Date.valueOf(sellDate));
							} catch (SQLException e) {
								e.printStackTrace();
							} 
						   });
	}
	
	private static ItemGroup transformerItemGroup(ResultSet rs) {
		ItemGroup ig = null;
		try {
			ig = new ItemGroup(rs.getInt(PROP_ITEM_GROUP_ID),
							   rs.getString(PROP_ITEM_GROUP_NAME),
							   rs.getString(PROP_ITEM_GROUP_DESC)
					);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ig;
	}
	
	private final Item transformerItem(ResultSet rs, ItemGroup ig){
		Item item = null;
		try {
			 item = new Item(
					rs.getInt(Item.PROP_ID),
					rs.getString(Item.PROP_NAME),
					rs.getString(Item.PROP_COLOR),
					rs.getDouble(Item.PROP_BUY_PRICE),
					rs.getDouble(Item.PROP_SELL_PRICE),
					rs.getString(Item.PROP_METERIAL),
					ig
					);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return item;
	}

	
}
