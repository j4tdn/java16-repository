package dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import dto.ItemWithSellDateDto;

public class JdbcDatabaseDao extends AbstractJdbcDao implements DatabaseDao {

	private static final String GET_ITEMS_BY_ORDER_TIME = "SELECT IT.ID, IT.NAME, O.ORDER_TIME \n" + "FROM ITEM IT \n"
			+ "         JOIN ORDER_DETAIL OD ON IT.ID = OD.ITEM_ID \n" + "         JOIN `order` \n"
			+ "         JOIN `order` O ON OD.ORDER_ID = O.ID \n" + "WHERE date(O.ORDER_TIME) = ?";

	@Override
	public List<ItemWithSellDateDto> getItemByOrderTime(LocalDate date) {
		return getElements(GET_ITEMS_BY_ORDER_TIME, () -> transformer(rs), pst -> {
			try {
				pst.setDate(1, Date.valueOf(date));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
	}

	private static ItemWithSellDateDto transformer(ResultSet rs) {
		ItemWithSellDateDto result = null;
		try {
			result = new ItemWithSellDateDto(rs.getInt("IT.ID"), rs.getString("IT.NAME"),
					rs.getTimestamp("O.ORDER_TIME").toLocalDateTime().toLocalDate());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
