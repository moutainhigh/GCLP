package com.grape.service;

import java.util.List;

import com.grape.model.db.Shufflingfigure;

public interface ShufflingfigureService {
	
	List<Shufflingfigure> findShufflingfigurePC();
	
	List<Shufflingfigure> findShufflingfigureAPP();
}
