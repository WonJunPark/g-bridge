package bridgeweb.addrbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddrBookDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	// H2 DB 연결 정보
	String jdbc_driver = "org.h2.Driver";
	String jdbc_url = "jdbc:h2:tcp://localhost/~/bridgedb";
	
	// DB 연결
	void connect() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url,"sa","1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// DB 연결 종료
	// try catch 자동 생성 : alt+shift+z
	void close() {
		try {
		pstmt.close();
		conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	// 목록 가지고 오기
	public List<AddrBook> getDBList(){
		connect();
		List<AddrBook> datas = new ArrayList<>();
		
		String sql = "select * from addrbook";
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				AddrBook ab = new AddrBook();
				ab.setAb_id(rs.getInt("ab_id"));
				ab.setAb_name(rs.getString("ab_name"));
				ab.setAb_email(rs.getString("ab_email"));
				ab.setAb_tel(rs.getString("ab_tel"));
				ab.setAb_birth(rs.getString("ab_birth"));
				ab.setAb_comdept(rs.getString("ab_comdept"));
				ab.setAb_memo(rs.getString("ab_memo"));

				datas.add(ab);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return datas;
	}
	
	// 데이터 등록
	public boolean insertDB(AddrBook addrbook) {
		connect();
		String sql = "insert into addrbook(ab_name, ab_email, ab_birth, ab_tel, ab_comdept, ab_memo) values(?,?,?,?,?,?)";
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  addrbook.getAb_name());
			pstmt.setString(2,  addrbook.getAb_email());
			pstmt.setString(3,  addrbook.getAb_birth());
			pstmt.setString(4,  addrbook.getAb_tel());
			pstmt.setString(5,  addrbook.getAb_comdept());
			pstmt.setString(6,  addrbook.getAb_memo());
			pstmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		close();
		return true;
	}
}
