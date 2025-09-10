/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(tulsaRiot);
		
		
		String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
			tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		RevisedHistoricalEvent tulsaMassacre = new RevisedHistoricalEvent(tulsaDescription, tulsaDay,
			tulsaRevised, tulsaCitation);
		
		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		tulsaMassacre.teach();

		String BreifSummaryColumbas = "Christopher Columbas set sail west towards Asia in 1492. He defied Spanish officials in his journy to the west to find faster travel to Asia because although he was certain the world was round, and the trip would be faster, the officials were not. In doing so Columbas landed in the americas.";
		Date ColumbasDate = new Date(8, 3, 1492);

		System.out.println("\n\n");

		HistoricalEvent ColumbasSailsTowardsAsia = new HistoricalEvent(BreifSummaryColumbas, ColumbasDate);
		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(ColumbasSailsTowardsAsia);

		String ColumbasRevised = "It is almost certain that in 1490, almost no-one belived the earth was flat, especialy edjucated people such as columbas and local officials and government. The reason Columbas actualy ran into trouble funding his unconventual journy to Asia was because he incorrectly believed the circumference of Earth was extreamly small. And after years of negotiation he eventualy convinced Ferdinand II of Spain and his wife to fund his new possible trade route. His foolish expediton would then land him in america.";
		String ColumbasCite = "https://www.history.com/articles/christopher-columbus-never-set-out-to-prove-the-earth-was-round";
		RevisedHistoricalEvent ColumbasFoolishness = new RevisedHistoricalEvent(BreifSummaryColumbas, ColumbasDate,
				ColumbasRevised, ColumbasCite);
		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		ColumbasFoolishness.teach();
	}
}