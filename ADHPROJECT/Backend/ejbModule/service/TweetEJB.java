package service;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.TweetEntity;

@Stateless
@LocalBean
public class TweetEJB {

	

	@PersistenceContext
	private EntityManager em;
	
	
	  public TweetEJB() {
	        // TODO Auto-generated constructor stub
	    }
	    
	    public void addTweet(TweetEntity tweetEntity)
	    {
	    	System.out.println("---adding tweets to database---");
	    	em.persist(tweetEntity);
	    }
}