package org.mesonmsit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mesonmsit.dto.UserSearchDetailsDto;
import org.mesonmsit.utils.Bundles;
import org.mesonmsit.utils.DBConnection;


public class UserSearchDao {
	
	public List<UserSearchDetailsDto> getUser() throws SQLException {
		
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement statement = conn.prepareStatement(Bundles.QUERY.getString("USER_PUBLIC_DTLS"));
		ResultSet result = statement.executeQuery();
		
		List<UserSearchDetailsDto> userList = new ArrayList<UserSearchDetailsDto>();
		while (result.next()){
			UserSearchDetailsDto user = new UserSearchDetailsDto();
		    user.setFullName(result.getString("full_name"));
		    user.setMemberId(result.getLong("member_id"));
		    user.setPassoutYr(result.getString("passout_year"));
		    user.setStream(result.getString("stream"));
		    userList.add(user);
		}
		DBConnection.closeConnection(conn);
		return userList;
	}
	

}
