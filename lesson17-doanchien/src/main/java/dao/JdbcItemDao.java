package dao;

import java.sql.ResultSet;
import java.util.List;

import bean.Item;
import bean.ItemGroup;

public class JdbcItemDao extends AbstractJdbcDao implements ItemDao{
	private static final String PROP_ITEM_GROUP_ID = String.join("_", 
			Item.PROP_ITEM, ItemGroup.PROP_ITEM_GROUP, ItemGroup.PROP_ID);
	
	private static final String PROP_ITEM_GROUP_NAME = String.join("_", 
			Item.PROP_ITEM, ItemGroup.PROP_ITEM_GROUP, ItemGroup.PROP_NAME);
	
	private static final String PROP_ITEM_GROUP_DESC = String.join("_", 
			Item.PROP_ITEM, ItemGroup.PROP_ITEM_GROUP, ItemGroup.PROP_DESC);
	

	private static final String GET_ALL_ITEMS = ""
			+ "SELECT it.ID         " + Item.PROP_ID         + ", \n"
			+ "       it.`NAME`     " + Item.PROP_NAME       + ", \n"
					+ "       ig.`NAME`     " + PROP_ITEM_GROUP_NAME + ", \n"
					+ "       ig.`DESC`     " + PROP_ITEM_GROUP_DESC + "  \n"
					+ "  FROM ITEM it \n"
					+ "  JOIN ITEM_GROUP ig \n"
					+ "    ON it.ITEM_GROUP_ID = ig.ID";
	
	public List<Item> getAll() {
		return getAll(GET_ALL_ITEMS, () -> transformer(rs));
	}
	@Override
	public List<Item> getItems() {
		return getElements(
				GET_ALL_ITEMS,
				() -> transformer(rs),
				pst -> {});
	}
	
	private static Item transformer(ResultSet rs) {
		Item item = null;
		try {

			item = new Item(
					rs.getInt(Item.PROP_ID),
					rs.getString(Item.PROP_NAME)
					
					);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return item;
	}
}
