package com.exam.hostelmanager.repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.mapping.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exam.hostelmanager.entity.PostEntity;

@Repository
public interface PostReponsitory extends CrudRepository<PostEntity, Long> {
	// tìm kiếm theo yêu cầu
	List<PostEntity> findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqual(
			@Param("city") String city, @Param("acreage") Double acreage, @Param("price") Double price);

	// tìm kiếm theo yêu cầu có Diện tích lớn hơn {> 70 m2}
	List<PostEntity> findByContentCityAndContentAcreageGreaterThanEqualAndContentPriceLessThanEqual(
			@Param("city") String city, @Param("acreage") Double acreage, @Param("price") Double price);

	// tìm kiếm theo yêu cầu có giá { > 4 triệu }
	List<PostEntity> findByContentCityAndContentAcreageLessThanEqualAndContentPriceGreaterThanEqual(
			@Param("city") String city, @Param("acreage") Double acreage, @Param("price") Double price);

	// tìm kiếm theo yêu cầu có giá và diện tích { > 4 triệu , > 70 m2}
	List<PostEntity> findByContentCityAndContentAcreageGreaterThanEqualAndContentPriceGreaterThanEqual(
			@Param("city") String city, @Param("acreage") Double acreage, @Param("price") Double price);

	// tìm sắp xếp tăng dần theo giá
	List<PostEntity> findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqualOrderByContentPriceAsc(
			@Param("city") String city, @Param("acreage") Double acreage, @Param("price") Double price);

	// tìm sắp xếp giảm dần theo giá
	List<PostEntity> findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqualOrderByContentPriceDesc(
			@Param("city") String city, @Param("acreage") Double acreage, @Param("price") Double price);

	// tìm sắp xếp tăng dần theo giá tất cả
	List<PostEntity> findByContentPriceGreaterThanEqualOrderByContentPriceAsc(@Param("price") Double price);

	// tìm sắp xếp tăng dần theo giá tất cả
	List<PostEntity> findByContentPriceGreaterThanEqualOrderByContentPriceDesc(@Param("price") Double price);

	// Danh sách nổi bật (sắp xếp theo fee)
	List<PostEntity> findByFeeEntityPriceGreaterThanOrderByFeeEntityPriceDesc(@Param("fee") Double fee);

	// Danh sách nổi bật theo title (sắp xếp theo fee)
	List<PostEntity> findByTitleOrderByFeeEntityPriceDesc(@Param("title") String title);

	// Danh sách Đã lưu
	List<PostEntity> findByIdIn(List<Long> ids);
	// Danh sách đã đăng
	List<PostEntity> findByUserEntityId(@Param("userid") Long userid);
	
	// Danh sách gợi ý
	List<PostEntity> findByContentCity(@Param("city") String city);



}
