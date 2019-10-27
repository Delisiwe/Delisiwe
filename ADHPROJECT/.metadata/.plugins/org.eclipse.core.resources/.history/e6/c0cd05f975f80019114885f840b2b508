package entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tweets_tbl")
public class TweetEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
	private String tweetbody;
	private Date timestamp;
	
	public String tweetbody() {
		return tweetbody;
	}
	public void settweetbody(String tweetbody) {
		this.tweetbody = tweetbody;
	}
	public Date gettimestamp() {
		return timestamp;
	}
	public void settimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
