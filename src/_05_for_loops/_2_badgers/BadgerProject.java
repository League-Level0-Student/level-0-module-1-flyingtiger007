package _05_for_loops._2_badgers;

public class BadgerProject {

	public static void main(String[] args) {

		String badger = "Badger";
		String mushroom = "Mushroom";

		for (int times2=0; times2 < 2; times2+=1) {
			for (int times=0; times < 12; times +=1) {

				System.out.print(badger);

				if (times<11) {

					System.out.print(", ");

				}
				else {
					System.out.println();
				}



			}

			

			for (int times=0; times < 2; times += 1) {

				System.out.print(mushroom);

				if (times < 1) {

					System.out.print(", ");

				}
				else {
					System.out.println();
				}
			}

			System.out.println();

		}

System.out.println();
		

		System.out.print("A Snake!!!");






















	}

}
