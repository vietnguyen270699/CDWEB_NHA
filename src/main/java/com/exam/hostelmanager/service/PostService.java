package com.exam.hostelmanager.service;

import java.util.List;
import java.util.Optional;

import com.exam.hostelmanager.entity.FeeEntity;
import org.hibernate.mapping.Collection;
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

	List<PostEntity> findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqual(String city,
			Double acreage, Double price);

	List<PostEntity> findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqualOrderByContentPriceDesc(
			String city, Double acreage, Double price);

	List<PostEntity> findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqualOrderByContentPriceAsc(
			String city, Double acreage, Double price);

	List<PostEntity> findByContentCityAndContentAcreageLessThanEqualAndContentPriceGreaterThanEqual(String city,
			Double acreage, Double price);

	List<PostEntity> findByContentCityAndContentAcreageGreaterThanEqualAndContentPriceLessThanEqual(String city,
			Double acreage, Double price);

	List<PostEntity> findByContentCityAndContentAcreageGreaterThanEqualAndContentPriceGreaterThanEqual(String city,
			Double acreage, Double price);

	List<PostEntity> findByContentPriceGreaterThanEqualOrderByContentPriceDesc(Double price);

	List<PostEntity> findByContentPriceGreaterThanEqualOrderByContentPriceAsc(Double price);

	List<PostEntity> findByFeeEntityPriceGreaterThanOrderByFeeEntityPriceDesc(Double fee);

	List<PostEntity> findByTitleOrderByFeeEntityPriceDesc(String title);

	List<PostEntity> findByIdIn(List<Long> ids);

	List<PostEntity> findByUserEntityId(Long userid);

	List<PostEntity> findByContentCity(String city);

	

	

}
