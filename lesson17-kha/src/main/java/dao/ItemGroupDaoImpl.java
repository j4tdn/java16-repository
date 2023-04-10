package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbManager;
import persistence.ItemDTO;
import persistence.ItemGroup;
import persistence.ItemGroupDTO;
import utils.DateUntils;
import utils.SqlUtils;

public class ItemGroupDaoImpl implements ItemGroupDao {

	private Connection connect;
	private Statement st;
	private ResultSet rs;
	PreparedStatement prest;

	public ItemGroupDaoImpl() {
		connect = DbManager.getConnection();
	}

	public List<ItemGroupDTO> getAllItemGroupDTO() {
		List<ItemGroupDTO> results = new ArrayList();
		String sql = "SELECT item_group.ID MaLH,  item_group.`NAME` TenLH, GROUP_CONCAT(item.`NAME`) DanhSachMatHang, SUM(item_detail.AMOUNT) SoLuong\n"
				+ "FROM item\n"
				+ "JOIN item_detail ON item.ID = item_detail.ITEM_ID\n"
				+ "JOIN item_group ON item_group.ID = item.ITEM_GROUP_ID\n"
				+ "GROUP BY item_group.`NAME`;";
		try {
			prest = connect.prepareStatement(sql);
			rs = prest.executeQuery();
			while (rs.next()) {
				ItemGroupDTO itemG = new ItemGroupDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
				results.add(itemG);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, prest);
		}
		return results;
	}

	public List<String> getNameItem(int Year) {
		List<String> results = new ArrayList();
        String sql = "select ITEM.NAME from ITEM\n"
        		+ "JOIN ITEM_DETAIL ON ITEM_DETAIL.ITEM_ID = ITEM.ID\n"
        		+ "JOIN ORDER_DETAIL ON ORDER_DETAIL.ITEM_ID = ITEM_DETAIL.ITEM_ID\n"
        		+ "JOIN `ORDER` ON `ORDER`.ID = ORDER_DETAIL.ORDER_ID\n"
        		+ "where YEAR(date(ORDER_TIME )) = ?\n"
        		+ "ORDER BY ITEM_DETAIL.AMOUNT DESC\n"
        		+ "LIMIT 3;";
        try {
            prest = connect.prepareStatement(sql);
            prest.setInt(1, Year);
            rs = prest.executeQuery();
            while (rs.next()) {
                results.add(rs.getString(1));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            SqlUtils.close(rs, prest);
        }
        return results;
	}

	public boolean add(List<ItemGroup> listIG) {
		int result = 0;
		String sql = "INSERT INTO item_group(`ID`, `NAME`, `DESC`) VALUES (?, ?, ?)";

		try {
			for (ItemGroup itemGroup : listIG) {
				prest = connect.prepareStatement(sql);
				prest.setInt(1, itemGroup.getID());
				prest.setString(2, itemGroup.getNAME());
				prest.setString(3, itemGroup.getDESC());
				
				result += prest.executeUpdate();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(prest);
		}

		return result > 0 ? true : false;
	}

	

}
