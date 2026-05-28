package com.tibame.Blog;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "blog")
public class BlogVO implements java.io.Serializable { // 對應 Blog

	private static final long serialVersionUID = 1L; //Java class 的版本控制號碼

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "blog_id", updatable = false)
	private Integer blogId; // 不能有底線，代價是處理表單接收、JSON 轉換、JSP 渲染以及資料庫存取時，
	// 會不斷遭遇到框架底層機制因為「找不到標準方法名稱」而引發的各種詭異 Bug。

	@Column(name = "blog_title")
	private String blogTitle;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "farmer_id")
	private Integer farmerId;

	@Column(name = "blog_type_id")
	private Integer blogTypeId;

	@Column(name = "product_id")
	private Integer productId;

	@Column(name = "blog_content")
	private String blogContent;

	@Lob
	@Column(name = "blog_img")	
	private byte[] blogImg;

	@Column(name = "blog_like")
	private Integer blogLike;

	@Column(name = "blog_time")
	private Timestamp blogTime;

	@Column(name = "blog_status")
	private String blogStatus;

	public BlogVO() {
		super();
	}

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(Integer farmerId) {
		this.farmerId = farmerId;
	}

	public Integer getBlogTypeId() {
		return blogTypeId;
	}

	public void setBlogTypeId(Integer blogTypeId) {
		this.blogTypeId = blogTypeId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	public byte[] getBlogImg() {
		return blogImg;
	}

	public void setBlogImg(byte[] blogImg) {
		this.blogImg = blogImg;
	}

	public Integer getBlogLike() {
		return blogLike;
	}

	public void setBlogLike(Integer blogLike) {
		this.blogLike = blogLike;
	}

	public Timestamp getBlogTime() {
		return blogTime;
	}

	public void setBlogTime(Timestamp blogTime) {
		this.blogTime = blogTime;
	}

	public String getBlogStatus() {
		return blogStatus;
	}

	public void setBlogStatus(String blogStatus) {
		this.blogStatus = blogStatus;
	}
}
