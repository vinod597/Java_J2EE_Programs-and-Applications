package Tasks;

import java.util.Scanner;
import Tasks.OverException.RrateException;

class OverException extends Exception {
	public String toString() {
		return "overs must be below 50";
	}

	class RrateException extends Exception {
		public String toString() {
			return "Runrate must be below of 37";
		}
	}
}

public class Cricket {
	public int score(float overs, float rrate) {
		int score = (int) (overs * rrate);
		return score;
	}

	public int wickets(int i, float overs, String name1) {
		if (overs < 50) {
			System.out.println(name1 + "Total score" + i + "/" + "10");
		} else {
			System.out.println(name1 + "Total score" + i + "/" + "9");
		}

		return i;

	}

	public int score1(float overs1, float rrate1) {
		int score1 = (int) (overs1 * rrate1);
		return score1;
	}

	public int wickets1(int i1, float overs1, String name2) {
		if (overs1 < 6) {
			System.out.println(name2 + "Total score" + i1 + "/" + "7");
		} else {
			System.out.println(name2 + "Total score" + i1 + "/" + "9");
		}

		return i1;

	}

	public void overs40(String name1, String name2) throws OverException, RrateException {
		Scanner scan = new Scanner(System.in);
		Cricket cr = new Cricket();
		// Scanner scan = new Scanner(System.in);
		// Cricket cr = new Cricket();
		System.out.println("Weather it is rain(1-yes/2-no): ");
		int weather = scan.nextInt();
		if (weather == 1) {
			System.out.println("Match delay with 2 hours overs may reduced to 20");
			cr.overs20(name1, name2);

		} else {
			System.out.println("Match Starts between: " + name1 + " " + "vs" + " " + name2);
			System.out.println("Enter the overs for - " + name1 + ":");
			Float overs = scan.nextFloat();
			System.out.println("Enter the Run rate : ");
			float rrate = scan.nextFloat();
			if (rrate > 40) {
				throw new OverException().new RrateException();
			} else {
				int i = cr.score(overs, rrate);
				int overall = cr.wickets(i, overs, name1);
				// System.out.println(noverall);

				System.out.println("Enter the overs for - " + name2 + ":");
				Float overs1 = scan.nextFloat();
				System.out.println("Enter the Run rate : ");
				float rrate1 = scan.nextFloat();
				int i1 = cr.score(overs1, rrate1);
				int overall1 = cr.wickets1(i1, overs1, name2);

				int won = 0;
				int won1 = 0;
				if (i < i1) {
					won = i1 - i;
					System.out.println(name2 + " won :" + won + " by Runs ");
				} else {
					won1 = i - i1;
					System.out.println(name1 + "won :" + won1 + "by runs");
				}
			}
		}
	}

	public void overs50(String name1, String name2) throws OverException, RrateException {
		Scanner scan = new Scanner(System.in);
		Cricket cr = new Cricket();
		System.out.println("Match Starts between: " + name1 + " " + "vs" + " " + name2);
		System.out.println("Enter the overs for - " + name1 + ":");
		Float overs = scan.nextFloat();
		if (overs > 50) {
			throw new OverException();
		} else {
			System.out.println("Enter the Run rate : ");
			float rrate = scan.nextFloat();
			if (rrate > 40) {
				throw new OverException().new RrateException();
			} else {
				int i = cr.score(overs, rrate);
				int overall = cr.wickets(i, overs, name1);
				// System.out.println(noverall);

				System.out.println("Enter the overs for - " + name2 + ":");
				Float overs1 = scan.nextFloat();
				System.out.println("Enter the Run rate : ");
				float rrate1 = scan.nextFloat();
				int i1 = cr.score(overs1, rrate1);
				int overall1 = cr.wickets1(i1, overs1, name2);

				int won = 0;
				int won1 = 0;
				if (i < i1) {
					won = i1 - i;
					System.out.println(name2 + " won :" + won + " by Runs ");
				} else {
					won1 = i - i1;
					System.out.println(name1 + "won :" + won1 + "by runs");
				}

			}
		}
	}

	public void overs20(String name1, String name2) throws OverException, RrateException {
		Scanner scan = new Scanner(System.in);
		Cricket cr = new Cricket();
		System.out.println("Weather it is rain(1-yes/2-no): ");
		int weather = scan.nextInt();
		if (weather == 1) {
			System.out.println("Match has been called off Due to Heavy Rain");

		} else {
			System.out.println("Match Starts between: " + name1 + " " + "vs" + " " + name2);
			System.out.println("Enter the overs for - " + name1 + ":");
			Float overs = scan.nextFloat();
			if (overs > 50) {
				throw new OverException();
			} else {

				System.out.println("Enter the Run rate : ");
				float rrate = scan.nextFloat();
				if (rrate > 40) {
					throw new OverException().new RrateException();
				} else {
					int i = cr.score(overs, rrate);
					int overall = cr.wickets(i, overs, name1);
					// System.out.println(noverall);

					System.out.println("Enter the overs for - " + name2 + ":");
					Float overs1 = scan.nextFloat();
					System.out.println("Enter the Run rate : ");
					float rrate1 = scan.nextFloat();
					int i1 = cr.score(overs1, rrate1);
					int overall1 = cr.wickets1(i1, overs1, name2);

					int won = 0;
					int won1 = 0;
					if (i < i1) {
						won = i1 - i;
						System.out.println(name2 + " won :" + won + " by Runs ");
					} else {
						won1 = i - i1;
						System.out.println(name1 + "won :" + won1 + "by runs");
					}

				}
			}
		}
	}

	public void weather(String name1, String name2) throws OverException, RrateException {
		Scanner scan = new Scanner(System.in);
		Cricket cr = new Cricket();
		System.out.println("Weather it is rain(1-yes/2-no): ");
		int weather = scan.nextInt();
		if (weather == 1) {
			System.out.println("Match delay with one hour, Overs may Reduced to 40 ");
			cr.overs40(name1, name2);

		} else {
			cr.overs50(name1, name2);

		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Cricket cr = new Cricket();

		System.out.println("Welcome to ODI International Cricket");
		Scanner scan = new Scanner(System.in);
		System.out.println("First Team: ");
		String name1 = scan.next();
		System.out.println("Second Team: ");
		String name2 = scan.next();
		cr.weather(name1, name2);

	}

}
