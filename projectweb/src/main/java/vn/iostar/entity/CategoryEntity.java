package vn.iostar.entity;

import java.io.Serializable;

public class CategoryEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer categoryId;
	private String categoryName;
	private String images;
	private int status;


	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CategoryEntity [categoryId=" + categoryId + ", categoryName=" + categoryName + ", images=" + images
				+ ", status=" + status + "]";
	}
}
