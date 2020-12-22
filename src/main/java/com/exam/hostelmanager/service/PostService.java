package com.exam.hostelmanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.exam.hostelmanager.entity.ImageEntity;
import com.exam.hostelmanager.entity.PostEntity;
import com.exam.hostelmanager.repository.PostReponsitory;

public interface PostService {

	void deleteAll();

	void deleteAll(List<PostEntity> entities);

	void delete(PostEntity entity);

	void deleteById(Long id);

	long count();

	List<PostEntity> findAllById(List<Long> ids);

	Iterable<PostEntity> findAll();

	boolean existsById(Long id);

	Optional<PostEntity> findById(Long id);

	List<PostEntity> saveAll(List<PostEntity> entities);

	PostEntity save(PostEntity entity);



//	void deleteAll();
//
//	void deleteAll(List<PostEntity> entities);
//
//	void delete(PostEntity entity);
//
//	void deleteById(Integer id);
//
//	long count();
//
//	List<PostEntity> findAllById(List<Integer> ids);
//
//	Iterable<PostEntity> findAll();
//
//	boolean existsById(Integer id);
//
//	Optional<PostEntity> findById(Integer id);
//
//	List<PostEntity> saveAll(List<PostEntity> entities);
//
//	PostEntity save(PostEntity entity);
//
//	List<ImageEntity> findAllImage();



}
