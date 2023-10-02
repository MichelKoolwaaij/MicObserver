package nl.han.ooad.twitter;

public interface IFollower { // Observer interface
	void update(TwitterUser user, String tweet); // Deze hoort bij de observer interface
	public String getLastTweet();
}
