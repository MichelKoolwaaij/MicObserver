package nl.han.ooad.twitter;

public class App {
	public static void main(String[] args) {
		// Init all observables
		TwitterUser michel = new Teacher("Michel");
		TwitterUser rody = new Teacher("Rody");
		TwitterUser tineke = new Teacher("Tineke");

		// Init all observers
		IFollower aron = new Student("Aron");
		IFollower richard = new Teacher("Richard");
		IFollower wouter = new Student("Wouter");
		IFollower lieke = new Student("Lieke");

		// Add observers to observables
		michel.addFollower(aron);
		rody.addFollower(aron);
		rody.addFollower(richard);
		rody.addFollower(wouter);
		tineke.addFollower(wouter);
		tineke.addFollower(lieke);

		// observe
		michel.tweet("Laten we nog een deployment diagram doen");
		rody.tweet("Ik ben er weer!!!");
		tineke.tweet("Waar is je DROP model?");
		
	}
}
