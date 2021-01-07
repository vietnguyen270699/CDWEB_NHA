package com.exam.hostelmanager.service.impl;

import java.util.List;
import java.util.Optional;

import com.exam.hostelmanager.entity.FeeEntity;
import org.apache.taglibs.standard.lang.jstl.IntegerDivideOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.hostelmanager.entity.ImageEntity;
import com.exam.hostelmanager.entity.PostEntity;
import com.exam.hostelmanager.repository.PostReponsitory;
import com.exam.hostelmanager.service.PostService;

@Service
public class PostEntityServiceImpl implements PostService {
	@Autowired
	PostReponsitory postReponsitory;

	@Override
	public PostEntity save(PostEntity entity) {
		return postReponsitory.save(entity);
	}

	@Override
	public List<PostEntity> saveAll(List<PostEntity> entities) {
		return (List<PostEntity>) postReponsitory.saveAll(entities);
	}

	@Override
	public Optional<PostEntity> findById(Long id) {
		return postReponsitory.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		return postReponsitory.existsById(id);
	}

	@Override
	public Iterable<PostEntity> findAll() {
		return postReponsitory.findAll();
	}

	
	
	@Override
	public List<PostEntity> findByUserEntityId(Long userid) {
		return postReponsitory.findByUserEntityId(userid);
	}

	@Override
	public List<PostEntity> findAllById(List<Long> ids) {
		return (List<PostEntity>) postReponsitory.findAllById(ids);
	}
	

	@Override
	public List<PostEntity> findByContentCity(String city) {
		return postReponsitory.findByContentCity(city);
	}


	@Override
	public List<PostEntity> findByIdIn(List<Long> ids) {
		return postReponsitory.findByIdIn(ids);
	}

	@Override
	public List<PostEntity> findByTitleOrderByFeeEntityPriceDesc(String title) {
		return postReponsitory.findByTitleOrderByFeeEntityPriceDesc(title);
	}

	@Override
	public List<PostEntity> findByFeeEntityPriceGreaterThanOrderByFeeEntityPriceDesc(Double fee) {
		return postReponsitory.findByFeeEntityPriceGreaterThanOrderByFeeEntityPriceDesc(fee);
	}

	@Override
	public List<PostEntity> findByContentPriceGreaterThanEqualOrderByContentPriceAsc(Double price) {
		return postReponsitory.findByContentPriceGreaterThanEqualOrderByContentPriceAsc(price);
	}

	@Override
	public List<PostEntity> findByContentPriceGreaterThanEqualOrderByContentPriceDesc(Double price) {
		return postReponsitory.findByContentPriceGreaterThanEqualOrderByContentPriceDesc(price);
	}

	@Override
	public List<PostEntity> findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqual(String city,
			Double acreage, Double price) {
		return postReponsitory.findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqual(city,
				acreage, price);
	}

	@Override
	public List<PostEntity> findByContentCityAndContentAcreageGreaterThanEqualAndContentPriceLessThanEqual(String city,
			Double acreage, Double price) {
		return postReponsitory.findByContentCityAndContentAcreageGreaterThanEqualAndContentPriceLessThanEqual(city,
				acreage, price);
	}

	@Override
	public List<PostEntity> findByContentCityAndContentAcreageLessThanEqualAndContentPriceGreaterThanEqual(String city,
			Double acreage, Double price) {
		return postReponsitory.findByContentCityAndContentAcreageLessThanEqualAndContentPriceGreaterThanEqual(city,
				acreage, price);
	}

	@Override
	public List<PostEntity> findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqualOrderByContentPriceAsc(
			String city, Double acreage, Double price) {
		return postReponsitory
				.findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqualOrderByContentPriceAsc(city,
						acreage, price);
	}

	@Override
	public List<PostEntity> findByContentCityAndContentAcreageGreaterThanEqualAndContentPriceGreaterThanEqual(
			String city, Double acreage, Double price) {
		return postReponsitory.findByContentCityAndContentAcreageGreaterThanEqualAndContentPriceGreaterThanEqual(city,
				acreage, price);
	}

	@Override
	public List<PostEntity> findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqualOrderByContentPriceDesc(
			String city, Double acreage, Double price) {
		return postReponsitory
				.findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqualOrderByContentPriceDesc(
						city, acreage, price);
	}

	@Override
	public long count() {
		return postReponsitory.count();
	}

	@Override
	public void deleteById(Long id) {
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
