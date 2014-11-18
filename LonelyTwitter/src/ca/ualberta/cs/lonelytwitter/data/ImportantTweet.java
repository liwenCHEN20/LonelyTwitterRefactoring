package ca.ualberta.cs.lonelytwitter.data;

import java.util.Date;



public class ImportantTweet extends LonelyTweet
{
	public ImportantTweet(){}

	public ImportantTweet(String text, Date date)
	{

		this.tweetDate = date;
		this.tweetBody = text;
	}


	public boolean isValid()
	{
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}
	
		return true;
	}
	public String toString(){
		return "IMPORTANT" + getTweetDate() + "|"+getTweetBody();
	}
}



