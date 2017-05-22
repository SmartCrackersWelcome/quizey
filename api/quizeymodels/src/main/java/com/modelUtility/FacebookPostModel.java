package com.modelUtility;

import java.util.Date;
import java.util.List;

public class FacebookPostModel {

	private String id;
	private String message;
	private String sourceUrl;
	private String imageUrl;
	private String sourceType;
	private String story;
	private long totalLikes;
	private long totalComments;
	private Date createdAt;
	private List<FacebookLikeModel> likes;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	public long getTotalLikes() {
		return totalLikes;
	}
	public void setTotalLikes(long totalLikes) {
		this.totalLikes = totalLikes;
	}
	public long getTotalComments() {
		return totalComments;
	}
	public void setTotalComments(long totalComments) {
		this.totalComments = totalComments;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public List<FacebookLikeModel> getLikes() {
		return likes;
	}
	public void setLikes(List<FacebookLikeModel> likes) {
		this.likes = likes;
	}
}
