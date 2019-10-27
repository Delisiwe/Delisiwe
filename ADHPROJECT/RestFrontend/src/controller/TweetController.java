package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import model.Tweet;
import service.TweetEJB;

@ManagedBean(name = "tweetcontroller")
@SessionScoped
public class TweetController {
	
	
	 @EJB
	    private TweetEJB tweetEJB;
	    
	  //from form
	  	@ManagedProperty(value="#{tweet}")
	    private Tweet tweet;
	  	
	    private List<Tweet> tweetList = new ArrayList<>();
	 
	   public List<Tweet> getTweetList() {
	      
	        return tweetList;
	    }
	 
	   public String viewTweet(){
	        return "tweetList.xhtml";
	    }
	   
	    public String addNewTweet() {
	         tweetEJB.addTweet(tweet.getEntity());
	      //  employeeList = employeeEJB.findEmployees();
	        return "tweetList.xhtml";
	    }

		public Tweet getTweet() {
			return tweet;
		}

		public void setTweet(Tweet tweet) {
			this.tweet = tweet;
		}

}