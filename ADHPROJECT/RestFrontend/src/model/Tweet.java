package model;


import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.TweetEntity;

@ManagedBean(name = "tweet")
@SessionScoped
public class Tweet {

	
private static final long serialVersionUID = 1L;
	
	private String tweetbody;
	private java.sql.Date timestamp;
	
	
	public String gettweetbody() {
		return tweetbody;
	}
	public void settweetbody(String tweetbody) {
		this.tweetbody = tweetbody;
	}
	
	
	public Date gettimestamp() {
		return timestamp;
	}
	public void settimestamp(java.sql.Date timestamp) {
		this.timestamp = timestamp;
	}
	
	public TweetEntity getEntity()
	{
		TweetEntity tweetEntity = new TweetEntity();
		tweetEntity.settimestamp(timestamp);
		tweetEntity.settweetbody(tweetbody);
		return tweetEntity;
		
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
	
	
	
