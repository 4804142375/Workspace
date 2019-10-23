import java.util.Scanner;

public class theOffice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Dunder Mifflin Scranton Branch. "
				+ "\nI am Michael Scott, the Regional Manager of the STARS."
				+ "\nYou are Dwight Schrute, Assistant Regional Manager."
				+ "\nWell... Assistan TO the Regional Manager."
				+ "\nYou will determine the outcome of a season of The Office."
				+ "\nYou are getting ready to give your fire safety talk."
				+ "\nDo you:"
				+ "\n1) Use PowerPoint even thought PowerPoint is boring."
				+ "\n2) Bring in a burn victim to SCARE THEM STRAIGHT!");
		int choice = scan.nextInt();
		if(choice == 1){
			System.out.println("No one payed attention to your presentation. The Office is at risk to a fire."
					+ "\nDo you:"
					+ "\n1) Start a controlled fire in a trashcan because today, smoking is going to save lives."
					+ "\n2) Give up because you are meerly Assistant to the Regional Manager.");
			choice = scan.nextInt();
			if(choice == 1){
				System.out.println("The entire office is in chaos. "
						+ "\nStanley has a heart attack, but everyone lives."
						+ "\nDo you:"
						+ "\n1) Take the rest of the day off for a dental appointment."
						+ "\n2) Wait until the end of work and go home.");
			}
				else{
					System.out.println("Michael plays with matches and everyone in the business parks dies. \nDeath Toll: 60"
							+ "\nThe End.");
				}
				choice = scan.nextInt();
				if(choice==1){
					System.out.println("Michael finds out that you went to Corporate and asked to be Regional Manager instead of going to the dentist."
							+ "\nDo you:"
							+ "\n1) Tell Michael he is wrong and that you saw your dentist named Crentist."
							+ "\n2) Confess that you went behind his back for his job.");
					choice = scan.nextInt();
					if(choice == 1){
						System.out.println("He buys your horrible excuse, but you do not get the Regional Manager position."
								+ "\nYou remain Assistant to the Regional Manager..."
								+ "\nMichael is now acting strange and he is on the roof!"
								+ "\nDo You:"
								+ "\n1) Get all the office workers and warehouse workers to come and see what's going on."
								+ "\n2) Let Michael jump with no one around.");
						choice = scan.nextInt();
						if(choice == 1){
							System.out.println("The office workers and warehouse workers come outside to see Michael's depression."
									+ "\n Michael says he is going to jump because the stress of his modern office has caused him to go into a a depression. "
									+ "\nNot just a fancy word for feeling \"bummed out\""
									+ "\nDo You:"
									+ "\n1) Convince Michael to not jump."
									+ "\n2) Fail at convincing him not to jump.");
							choice = scan.nextInt();
							if(choice == 1){
								System.out.println("Michael does not jump, however you are now out $1500 because you bought a super cool bouncy castle. "
										+ "\nWhat do you do with it now?"
										+ "\nDo you:"
										+ "\n1) Put the bouncy castle inside of Hay Place to earn your money back by charging children to bounce around."
										+ "\n2) Give it to Mose.");
								choice = scan.nextInt();
								if(choice == 1){
									System.out.println("You make your money back, but mainly from Kevin. "
											+ "\nKevin breaks the bouncy castle. "
											+ "\nIt is time to go back to work."
											+ "\nIt is the next day."
											+ "\nMichael calls frantically talking about how he burned his foot on his George Forman Grill. What do you do?"
											+ "\nDo you:"
											+ "\n1) Go pick him up from his condo and bring him to work."
											+ "\n2) Ignore him because it's just a burned foot.");
									choice = scan.nextInt();
									if(choice == 1){
										System.out.println("Michael comes into work and props his foot up on the desk. "
												+ "\nHe yells for you to go get him some ice cream."
												+ "\nThere is no ice cream in the fridge."
												+ "\nDo you: "
												+ "\n1) Make Michael some mayonaise and black olives because its comfort food."
												+ "\n2) Go out to the store to get him some ice cream.");
										choice = scan.nextInt();
										if (choice == 1) {
											System.out.println("Michael ate the whole bowl and then finished it off with an "
													+ "entire family sized chicken pot pie then promptly fell asleep."
													+ "\nThe rest of the office moved the clocks forward to 5 o'clock and went home. "
													+ "\nUsually you wouldn't condone leaving early but you have an appointment with the horse doctor. "
													+ "\nHow that horse became a doctor, I don't know."
													+ "\nYou come in the next day and Michael says \"knock knock\""
													+ "\nDo you: "
													+ "\n1) Try and tell your own knock knock joke about the KGB."
													+ "\n2) Respond with, \"Who's there?\"");											
											choice = scan.nextInt();
											if (choice == 1) {
												System.out.println("You tell your knock knock joke but the KGB overheard and showed up at the office."
														+ "\nDo you: "
														+ "\n1) Defeat each member of the KGB with one throat punch each."
														+ "\n2) Defeat each member of the KGB with Toby's \"Strike, Scream and Run\" rule.");
												choice = scan.nextInt();
												if(choice == 1) {
													System.out.println("You become a hero for taking out all of the KGB in Scranton. "
															+ "\nYou can now sleep soundly at night."
															+ "\nIt is the next day at work."
															+ "\nYou, Michael, and Andy have discovered parkour."
															+ "\nDo you: "
															+ "\n1) Practice parkour daily until you get famous."
															+ "\n2) Go outside right now and make a parkour video.");
													choice = scan.nextInt();
													if(choice == 1) {
														System.out.println("You've made millions from parkour because you have the dexterity of a monkey."
																+ "\nWhat do you do with that money?"
																+ "\nDo you:"
																+ "\n1) Buy the office building and then convert it into a volunteer sheriffs deputy headquarters."
																+ "\n2) Start a beet wine business.");
														choice = scan.nextInt();
														if (choice == 1) {
															System.out.println("You get too close to solving the case of The Scranton Strangler. "
																	+ "\nHe strangles you to death because he was a "
																	+ "deputy sheriff trying to sabotage the case from within."
																	+ "The End.");
																}
																else {
																	System.out.println("Bernard Farms puts you out of business."
																			+ "\nYou end up living on the street and die of starvation."
																			+ "\nThe End.");
																	}
															}
															else {
																System.out.println("At the end of the parkour video you decide to try a "
																		+ "gainer onto the Bob Vance Refridgeration boxes."
																		+ "\nBecause the box is empty and you suck at parkour, you break your neck and die."
																		+ "\nThe End.");
																}
														}
														else {
															System.out.println("The KGB catch up to you and kill you because Toby's method is dumb. Because Toby."
																	+ "\nThe End.");
															}
													}
													else {
														System.out.println("Michael hands you stick a butter."
																+ "\nYou eat the whole stick of butter because Jim says it tastes like beets."
																+ "\nYou develop a rare case of type A diabetes and die in your sleep."
																+ "\nThe End.");
														}
												}
												else {
													System.out.println("While on your way to the store a semi-truck decapitates you and you die instantly."
															+ "\nThe End.");
													}
											}
											else {
												System.out.println("Michael is triggered that no one came to help him so "
														+ "he visits Schrute farms at 3 am the next morning and murders you in you sleep."
														+ "\nThe End.");
												}
										}
										else{
											System.out.println("Michael jumps and you get fired. Your own depression overtakes you and you jump as well."
										+ "\nThe end.");								
											}
									}
									else{
										System.out.println("Mose uses the bouncy castle to kill you in your sleep."
												+ "\nThe End.");
										}
								}
								else{
									System.out.println("Michael jumps and causes a gas leak becaus he bursts a pipe on impact. "
											+ "\nEverone in the office dies."
											+ "\nThe end.");
								}
						}
						else{
							System.out.println("Michael sentences you to doing his luandry for the next 5 years as punishment for going behind his back. SMH"
									+ "\nThe End.");
							}
					}
					else{
						System.out.println("You went home and your cousin Mose killed you in your sleep."
								+ "\nThe end.");
					}	
			}
			else{
				System.out.print("The burn victim scared them straight but Prison Mike started screaming about dementors."
						+ "\nThe dementors showed up and sucked the soul out of all the employess weak bodies."
						+ "\nFin.");
			}
	}
}