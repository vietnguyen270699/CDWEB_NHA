package com.exam.hostelmanager.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.exam.hostelmanager.service.ImageService;
import com.exam.hostelmanager.entity.ImageEntity;
import com.exam.hostelmanager.repository.ImageReponsitory;

public class ImageEntityServiceImpl implements ImageService{

	@Autowired
	private ImageReponsitory imageReponsitory;

	@Override
	public ImageEntity save(ImageEntity entity) {
		return imageReponsitory.save(entity);
	}

	@Override
	public List<ImageEntity> saveAll(List<ImageEntity> entities) {
		return (List<ImageEntity>) imageReponsitory.saveAll(entities);
	}

	@Override
	public Optional<ImageEntity> findById(Integer id) {
		return imageReponsitory.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return imageReponsitory.existsById(id);
	}

	@Override
	public Iterable<ImageEntity> findAll() {
		return imageReponsitory.findAll();
	}

	@Override
	public List<ImageEntity> findAllById(List<Integer> ids) {
		return (List<ImageEntity>) imageReponsitory.findAllById(ids);
	}

	@Override
	public long count() {
		return imageReponsitory.count();
	}

	@Override
	public void deleteById(Integer id) {
		imageReponsitory.deleteById(id);
	}

	@Override
	public void delete(ImageEntity entity) {
		imageReponsitory.delete(entity);
	}

	@Override
	public void deleteAll(List<ImageEntity> entities) {
		imageReponsitory.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		imageReponsitory.deleteAll();
	}
	
}
