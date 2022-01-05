package org.mesonmsit.handlers;

import java.sql.SQLException;

import org.json.simple.JSONObject;
import org.mesonmsit.dao.UserSearchDao;
import org.mesonmsit.dto.ResponseDto;
import org.mesonmsit.dto.UserSearchDetailsDto;
import org.mesonmsit.utils.Constants;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class AlumniDetailsHandler implements RequestHandler<JSONObject, Object> {

	
	/**
	 * This method is used to fetch all details of a alumni
	 */
	@Override
	public ResponseDto handleRequest(JSONObject input, Context context) {
		
		UserSearchDao dao = new UserSearchDao();
		
		ResponseDto response = new ResponseDto();
        try {
			response.setResponse(dao.getUser());
		} catch (SQLException e) {
			e.printStackTrace();
		}

        return response;	
        }

}
