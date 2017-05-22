package com.constatnts;

public class FacebookURL {

	public static String PAGES = "me/accounts?fields=access_token,category,id,perms,picture{url},can_post,is_published,cover,fan_count,is_verified,can_checkin,global_brand_page_name,link,country_page_likes,is_always_open,is_community_page,new_like_count,overall_star_rating,name";
	
	private static String PAGE_DETAILS_BY_PAGEID = "{pageId}?fields=access_token,category,id,picture{url},can_post,is_published,cover,fan_count,is_verified,can_checkin,global_brand_page_name,link,country_page_likes,is_always_open,is_community_page,new_like_count,overall_star_rating,name";
	
	public static String getPageDetailsByPpageId(String pageId){
		
		return (pageId!=null ? PAGE_DETAILS_BY_PAGEID.replace("{pageId}", pageId):null);
	}
	
	public static String ME = "me?fields=id,name,about,birthday,cover,gender,education,email,first_name,last_name,languages,hometown";
	public static String ME_ID = "me?fields=id";
	public static String ME_NAME = "me?fields=name";
	public static String ME_ABOUT = "me?fields=adout";
	public static String ME_BIRTHDAY = "me?fields=birthday";
	public static String ME_COVER = "me?fields=cover";
	public static String ME_GENDER = "me?fields=gender";
	public static String ME_EDUCATION = "me?fields=education";
	public static String ME_EMAIL = "me?fields=email";
	public static String ME_FIRST_NAME = "me?fields=first_name";
	public static String ME_LAST_NAME = "me?fields=last_name";
	public static String ME_LANGUAGES = "me?fields=languages";
	public static String ME_HOMETOWN = "me?fields=hometown";
	public static String FRIEND_LIST = "me/friendlists?limit=5000&offset=0";
	public static String TAGGABLE_FRIENDS = "me/taggable_friends?fields=id,last_name,first_name,middle_name,name,picture&limit=5000";
	
	public static String POSTS_DETAILS = "me/posts?fields=type,source,full_picture,likes.limit(5000){name,id,username,pic_large,profile_type},message,story,comments.limit(5000){comment_count,from,created_time,message,attachment},reactions.limit(5000){id,name,pic_large,type,profile_type,username},created_time&limit=5000&offset=0";
	public static String POSTS_COMMENTS_DETAILS = "me/posts?fields=type,source,full_picture,message,story,comments.limit(5000){comment_count,from,created_time,message,attachment},created_time&limit=5000&offset=0";
	public static String POSTS_LIKES_DETAILS = "me/posts?fields=type,source,full_picture,message,story,likes.limit(5000){id,name,profile_type,pic_large,username},created_time&limit=5000&offset=0";
	public static String POSTS_ACTIONS = "me/posts?fields=type,source,full_picture,message,story,actions,created_time&limit=5000&offset=0";
	public static String POSTS_REACTIONS_DETAILS = "me/posts?fields=type,source,full_picture,message,story,reactions.limit(5000){id,name,pic_large,type,profile_type,username},created_time&limit=5000&offset=0";
	
	
	private static String POST_DETAILS_BY_POSTID = "{postId}?fields=type,source,full_picture,likes.limit(5000){name,id,username,pic_large,profile_type},message,story,comments.limit(5000){comment_count,from,created_time,message,attachment},reactions.limit(5000){id,name,pic_large,type,profile_type,username},created_time";
	private static String POSTS_COMMENTS_DETAILS_BY_POSTID = "{postId}?fields=type,source,full_picture,message,story,comments.limit(5000){comment_count,from,created_time,message,attachment},created_time";
	private static String POSTS_LIKES_DETAILS_BY_POSTID = "{postId}?fields=type,source,full_picture,message,story,likes.limit(5000){id,name,profile_type,pic_large,username},created_time";
	private static String POSTS_ACTIONS_BY_POSTID = "{postId}?fields=type,source,full_picture,message,story,actions,created_time";
	private static String POSTS_REACTIONS_DETAILS_BY_POSTID = "{postId}?fields=type,source,full_picture,message,story,reactions.limit(5000){id,name,pic_large,type,profile_type,username},created_time";
	
	public static String getUrlPostsDetails(Long limit,Long offset){
		limit = (limit == null ? 100 : limit);
		offset = (offset == null ? 0 : offset);
		
		return  "me/posts?fields=type,source,full_picture,likes.limit(5000){name,id,username,pic_large,profile_type},message,story,comments.limit(5000){comment_count,from,created_time,message,attachment},reactions.limit(5000){id,name,pic_large,type,profile_type,username},created_time&limit="+limit+"&offset="+offset;
	}
	
	public static String getUrlPostsCommentDetails(Long limit,Long offset){
		limit = (limit == null ? 100 : limit);
		offset = (offset == null ? 0 : offset);
		
		return "me/posts?fields=type,source,full_picture,message,story,comments.limit(5000){comment_count,from,created_time,message,attachment},created_time&limit="+limit+"&offset="+offset;
	}
	
	public static String getUrlPostsLikesDetails(Long limit,Long offset){
		limit = (limit == null ? 100 : limit);
		offset = (offset == null ? 0 : offset);
		
		return "me/posts?fields=type,source,full_picture,message,story,likes.limit(5000){id,name,profile_type,pic_large,username},created_time&limit="+limit+"&offset="+offset;
	}
	
	public static String getUrlPostsActions(Long limit,Long offset){
		limit = (limit == null ? 100 : limit);
		offset = (offset == null ? 0 : offset);
		
		return "me/posts?fields=type,source,full_picture,message,story,actions,created_time&limit="+limit+"&offset="+offset;
	}
	
	public static String getUrlPostsReactions(Long limit,Long offset){
		limit = (limit == null ? 100 : limit);
		offset = (offset == null ? 0 : offset);
		
		return "me/posts?fields=type,source,full_picture,message,story,reactions.limit(5000){id,name,pic_large,type,profile_type,username},created_time&limit="+limit+"&offset="+offset;
	}
	
	public static String getUrlPostDetailsByPostId(String postId){
		
		return (postId!=null? POST_DETAILS_BY_POSTID.replace("{postId}", postId) : null);
	}
	
	public static String getUrlPostsCommentsDetailsByPostId(String postId){
		
		return (postId!=null?POSTS_COMMENTS_DETAILS_BY_POSTID.replace("{postId}", postId):null);
	}
	
	public static String getUrlPostsLikesDetailsByPostId(String postId){
		
		return (postId!=null ? POSTS_LIKES_DETAILS_BY_POSTID.replace("{postId}", postId):null);
	}
	
	public static String getUrlPostsActionsByPostId(String postId){
		
		return (postId!=null? POSTS_ACTIONS_BY_POSTID.replace("{postId}", postId):null);
	}
	
	public static String getUrlPostsReactionsDetailsByPostId(String postId){
		
		return (postId!=null?POSTS_REACTIONS_DETAILS_BY_POSTID.replace("{postId}", postId):null);
	}
	
}
