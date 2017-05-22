package com.modelUtility;

public class FacebookPageModel {

	//access_token
	private String accessToken;
	//name
	private String name;
	//id
	private String id;
	//category
	private String category;
	// can_post
	private boolean canPost;
	
	private String pageProfilePic;
	// is_published
	private boolean isPublished;
	// fan_count
	private long fanCount;
	// is_verified
	private boolean isVerified;
	// can_checkin
	private boolean canCheckin;
	// global_brand_page_name
	private String globalBranPageName;
	// link
	private String pageLink;
	// new_like_count
	private long newLikeCount;
	// overall_star_rating
	private long overallStarRating;
	
	public boolean isCanPost() {
		return canPost;
	}
	public void setCanPost(boolean canPost) {
		this.canPost = canPost;
	}
	public String getPageProfilePic() {
		return pageProfilePic;
	}
	public void setPageProfilePic(String pageProfilePic) {
		this.pageProfilePic = pageProfilePic;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isPublished() {
		return isPublished;
	}
	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}
	public long getFanCount() {
		return fanCount;
	}
	public void setFanCount(long fanCount) {
		this.fanCount = fanCount;
	}
	public boolean isVerified() {
		return isVerified;
	}
	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	public boolean isCanCheckin() {
		return canCheckin;
	}
	public void setCanCheckin(boolean canCheckin) {
		this.canCheckin = canCheckin;
	}
	public String getGlobalBranPageName() {
		return globalBranPageName;
	}
	public void setGlobalBranPageName(String globalBranPageName) {
		this.globalBranPageName = globalBranPageName;
	}
	public String getPageLink() {
		return pageLink;
	}
	public void setPageLink(String pageLink) {
		this.pageLink = pageLink;
	}
	public long getNewLikeCount() {
		return newLikeCount;
	}
	public void setNewLikeCount(long newLikeCount) {
		this.newLikeCount = newLikeCount;
	}
	public long getOverallStarRating() {
		return overallStarRating;
	}
	public void setOverallStarRating(long overallStarRating) {
		this.overallStarRating = overallStarRating;
	}
}
