package com.grape.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Image;
import com.grape.model.mapper.base.ImageMapper;
import com.grape.service.ImageService;
@Service
public class ImageServiceImpl implements ImageService {

	@Autowired
	ImageMapper imageMapper;
	@Override
	public void save(Image image) {
		
		imageMapper.insert(image);

	}

}
