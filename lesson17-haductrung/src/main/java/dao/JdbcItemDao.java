package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.ItemDto;
import connection.DbConnection;

public class JdbcItemDao implements ItemDao {
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}
	
	public List<ItemDto> getItemsbyDate1(LocalDate deliveryOrder) {
		List<ItemDto> result = new ArrayList<ItemDto>();
		String sql = ""
				+ "select mh.MaMH, mh.TenMH, TIME(dh.ThoiGianDatHang) ThoiGianDatHang from donhang dh \r\n"
				+ "join chitietdonhang ctdh \r\n"
				+ "on ctdh.MaDH = dh.MaDH\r\n"
				+ "join mathang mh\r\n"
				+ "on mh.MaMH = ctdh.MaMH\r\n"
				+ "where Date(dh.ThoiGianDatHang) = ?";
		try {
			pst= connection.prepareStatement(sql);
			pst.setDate(1, Date.valueOf(deliveryOrder));
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemDto item = new ItemDto(rs.getInt("MaMH"), 
						rs.getString("TenMH"),
						rs.getTime("ThoiGianDatHang").toLocalTime());
				result.add(item);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public List<ItemDto> getItemsbyDate(LocalDate deliveryOrder) {
		// TODO Auto-generated method stub
		return null;
	}

}
