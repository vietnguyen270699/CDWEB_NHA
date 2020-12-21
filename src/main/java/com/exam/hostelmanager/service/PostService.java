package com.exam.hostelmanager.service;

import java.util.List;
import java.util.Optional;

import com.exam.hostelmanager.entity.PostEntity;

public interface PostService {

	void deleteAll();

	void deleteAll(List<PostEntity> entities);

	void delete(PostEntity entity);

	void deleteById(Integer id);

	long count();

	List<PostEntity> findAllById(List<Integer> ids);

	Iterable<PostEntity> findAll();

	boolean existsById(Integer id);

	Optional<PostEntity> findById(Integer id);

	List<PostEntity> saveAll(List<PostEntity> entities);

	PostEntity save(PostEntity entity);

}
