package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bean.Item;
import bean.ItemGroup;

public class JdbcItemDao extends AbstractJdbcDao implements ItemDao{
	
	private static final String PROP_ITEM_GROUP_ID = String.join("_", 
			Item.PROP_ITEM,	ItemGroup.PROP_ITEM_GROUP, ItemGroup.PROP_ID);
	private static final String PROP_ITEM_GROUP_NAME = String.join("_", 
			Item.PROP_ITEM,	ItemGroup.PROP_ITEM_GROUP, ItemGroup.PROP_NAME);
	private static final String PROP_ITEM_GROUP_DESC = String.join("_", 
			Item.PROP_ITEM,	ItemGroup.PROP_ITEM_GROUP, ItemGroup.PROP_DESC);
	
	private static final String GET_ALL_ITEMS = ""
			+ "select i.ID  " + Item.PROP_ID + ", \n"
			+ "		i.`NAME` " + Item.PROP_NAME + ", \n"
			+ "		i.COLOR " + Item.PROP_COLOR + ", \n"
			+ "		i.BUYPRICE " + Item.PROP_BUYPRICE + ", \n"
			+ "		i.SELLPRICE " + Item.PROP_SELLPRICE + ", \n"
			+ "		i.MATERIAL " + Item.PROP_MATERIAL + ", \n"
			+ "		ig.ID " + PROP_ITEM_GROUP_ID + ", \n"
			+ "		ig.`NAME` " + PROP_ITEM_GROUP_NAME + ", \n"
			+ "		ig.`DESC` " + PROP_ITEM_GROUP_DESC + "\n"
			+ "from item i\n"
			+ "join item_group ig\n"
			+ "on i.ITEM_GROUP_ID = ig.ID";
	
	
	private static final String GET_ITEMS_BY_IG_ID = ""
			+ GET_ALL_ITEMS + " \n"
			+ "where ig.id = ?";
	
	
	public JdbcItemDao() {
		super();
		
	}

	@Override
	public List<Item> getAll() {
		return getAll(GET_ALL_ITEMS, () -> transformer(rs));
	}
	
	public static Item transformer(ResultSet rs) {
		ItemGroup ig;
		try {
			ig = new ItemGroup(
					rs.getInt(PROP_ITEM_GROUP_ID), 
					rs.getString( PROP_ITEM_GROUP_NAME ), 
					rs.getString( PROP_ITEM_GROUP_DESC ));
			return new Item(
					rs.getInt("" + Item.PROP_ID), 
					rs.getString(Item.PROP_NAME),
					rs.getString(Item.PROP_COLOR),
					rs.getDouble(Item.PROP_BUYPRICE),
					rs.getDouble(Item.PROP_SELLPRICE),
					rs.getString(Item.PROP_MATERIAL),
					ig);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public List<Item> getItems(int igId) {
		return getElements(GET_ITEMS_BY_IG_ID, () -> transformer(rs), (pst) -> {
			try {
				pst.setInt(1, igId);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
	}

}
