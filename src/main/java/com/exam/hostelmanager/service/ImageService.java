package com.exam.hostelmanager.service;

import java.util.List;
import java.util.Optional;

import com.exam.hostelmanager.entity.ImageEntity;

public interface ImageService {

	void deleteAll();

	void deleteAll(List<ImageEntity> entities);

	void delete(ImageEntity entity);

	void deleteById(Integer id);

	long count();

	List<ImageEntity> findAllById(List<Integer> ids);

	Iterable<ImageEntity> findAll();

	boolean existsById(Integer id);

	Optional<ImageEntity> findById(Integer id);

	List<ImageEntity> saveAll(List<ImageEntity> entities);

	ImageEntity save(ImageEntity entity);

}
