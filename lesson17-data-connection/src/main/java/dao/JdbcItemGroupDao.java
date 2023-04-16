package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bean.ItemGroup;
import utils.SqlUtils;

public class JdbcItemGroupDao extends AbstractJdbcDao implements ItemGroupDao{
	
	private static final String GET_ALL = ""
			+ "select ID "+ ItemGroup.PROP_ID + ", \n"
			+ "`NAME` "+ ItemGroup.PROP_NAME + ", \n"
			+ "`DESC` " + ItemGroup.PROP_DESC + " \n"
			+ "from ITEM_GROUP";
	
	public JdbcItemGroupDao(){
		super();
	}

	@Override
	public List<ItemGroup> getAll() {
		return getAll(GET_ALL, () -> transformer(rs));
	}
	
	public static ItemGroup transformer(ResultSet rs){
		try {
			return new ItemGroup(
					rs.getInt("" + ItemGroup.PROP_ID), 
					rs.getString(ItemGroup.PROP_NAME),
					rs.getString(ItemGroup.PROP_DESC) );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ItemGroup get(int igId) {
		ItemGroup ig = new ItemGroup();
		String sql = "select ID "+ ItemGroup.PROP_ID + ", "
				+ "`NAME` "+ ItemGroup.PROP_NAME +", "
				+ "`DESC` " + ItemGroup.PROP_DESC 
				+ " from ITEM_GROUP"
				+ " where ID = " + igId;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ig = transformer(rs);
				break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return ig;
	}

	@Override
	public void save(ItemGroup ig) {
		String sql = "insert into ITEM_GROUP values (?, ?, ?) " ;
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, ig.getId());
			pst.setString(2, ig.getName());
			pst.setString(3, ig.getDescription());

			System.out.println("rs save: " + pst.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
	}

	@Override
	public void update(ItemGroup ig) {
		String sql = "update ITEM_GROUP "
				+ "set `NAME` = ? , "
				+ " `DESC` = ? "
				+ " where ID = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, ig.getName());
			pst.setString(2, ig.getDescription());
			pst.setInt(3, ig.getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}			
	}

	@Override
	public ItemGroup get(String name) {
		ItemGroup ig = new ItemGroup();
		String sql = "select ID "+ ItemGroup.PROP_ID + ", "
				+ "`NAME` "+ ItemGroup.PROP_NAME + ", "
				+ "`DESC` " + ItemGroup.PROP_DESC 
				+ " from ITEM_GROUP"
				+ " where `NAME` = ?" ;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			while(rs.next()) {
				ig = transformer(rs);
				break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return ig;
	}
}
