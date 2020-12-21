package com.exam.hostelmanager.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.hostelmanager.entity.PostEntity;
import com.exam.hostelmanager.repository.PostReponsitory;
import com.exam.hostelmanager.service.PostService;

@Service
public class PostEntityServiceImpl implements PostService {
	@Autowired
	private PostReponsitory postReponsitory;


	@Override
	public PostEntity  save(PostEntity entity) {
		return postReponsitory.save(entity);
	}


	@Override
	public List<PostEntity> saveAll(List<PostEntity> entities) {
		return (List<PostEntity>) postReponsitory.saveAll(entities);
	}

	
	@Override
	public Optional<PostEntity> findById(Integer id) {
		return postReponsitory.findById(id);
	}


	@Override
	public boolean existsById(Integer id) {
		return postReponsitory.existsById(id);
	}


	@Override
	public Iterable<PostEntity> findAll() {
		return postReponsitory.findAll();
	}


	@Override
	public List<PostEntity> findAllById(List<Integer> ids) {
		return (List<PostEntity>)postReponsitory.findAllById(ids);
	}


	@Override
	public long count() {
		return postReponsitory.count();
	}

	
	@Override
	public void deleteById(Integer id) {
		postReponsitory.deleteById(id);
	}


	@Override
	public void delete(PostEntity entity) {
		postReponsitory.delete(entity);
	}


	@Override
	public void deleteAll(List<PostEntity> entities) {
		postReponsitory.deleteAll(entities);
	}


	@Override
	public void deleteAll() {
		postReponsitory.deleteAll();
	}

	
}
