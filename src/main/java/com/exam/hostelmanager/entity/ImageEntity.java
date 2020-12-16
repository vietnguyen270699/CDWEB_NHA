package com.exam.hostelmanager.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "image")
public class ImageEntity extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imageid;
	@Column
	private String link;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private PostEntity post_id;

	
	public ImageEntity(String createDate, String createBy, String modifyDate, String modifyBy, int imageid, String link,
			PostEntity post_id) {
		super(createDate, createBy, modifyDate, modifyBy);
		this.imageid = imageid;
		this.link = link;
		this.post_id = post_id;
	}

	public int getImageid() {
		return imageid;
	}

	public void setImageid(int imageid) {
		this.imageid = imageid;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public PostEntity getPost_id() {
		return post_id;
	}

	public void setPost_id(PostEntity post_id) {
		this.post_id = post_id;
	}
	
}
