package nl.han.ooad.twitter;

import java.util.ArrayList;

public class TwitterUser { // Observable class

	protected String id;
	private TweetDateFormatter dateFormatter = new TweetDateFormatter();
	private ArrayList<IFollower> followers = new ArrayList<IFollower>(); // Hoort bij Observable
	
	String lastTweet = null;
	
	public TwitterUser(String id) {
		this.id = id;
	}

	public void tweet(String tweet) {
		lastTweet = "@" + id + ": " + tweet + " "
				+ dateFormatter.formattedTweetDate();
		System.out.println(lastTweet);
		notifyFollowers(tweet);
	}

	public String getId() {
		return id;
	}

	private void notifyFollowers(String tweet) { // Hoort bij de observable
		for (IFollower follower : followers) {
			follower.update(this, tweet);
		}
	}

	public void addFollower(IFollower follower) {
		followers.add(follower);
	} // Hoort bij de observable

	public void removeFollower(IFollower follower) {
		followers.remove(follower);
	} // Hoort bij de observable

	public void setDateFormatter(TweetDateFormatter dateFormatter) {
		this.dateFormatter = dateFormatter;
	}

}