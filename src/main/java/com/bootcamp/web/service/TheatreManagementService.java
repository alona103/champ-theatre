package com.bootcamp.web.service;

import java.util.List;

import com.bootcamp.web.entity.Theatre;

public interface TheatreManagementService {
	
	List<Theatre> getAllTheatre();

	void changeTheatreStatus(Theatre theatre);
	
	void updateTheatreDetails(Theatre theatre);
}
