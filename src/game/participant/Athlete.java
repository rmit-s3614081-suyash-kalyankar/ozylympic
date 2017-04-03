package game.participant;



import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
/**
 * 
 * @author ASHISH
 * Athletes class inheriting the Participants and implementing Comparable ,Comparator interfaces
 * 
 *
 */
public class Athlete extends Participant implements Comparable<Athlete>, Comparator<Athlete> {
	
	private int totalPoints;     //total points of Athletes
	
	private char athleteType;     //type of Athlete
	private int finishTimer;      //finish time of Athlete
	Set<Athlete> athleteList;
	
	public int getFinishTimer() {
		return finishTimer;
	} 


	public void setFinishTimer(int finishTimer) {
		this.finishTimer = finishTimer;
	}


	public int getTotalPoints() {
		return totalPoints;
	}


	
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}


	public char getAthleteType() {
		return athleteType;
	}


	public void setAthleteType(char athleteType) {
		this.athleteType = athleteType;
	}

	
	
	public Athlete(String athleteId, String athleteName, int athleteAge, String athleteState, char athleteType) {
		super(athleteId,athleteName,athleteAge,athleteState);
		this.athleteType = athleteType;
	}
/**
 * @description displaying the list of Athletes
 */
	public void athleteDisplay(){
		Athlete currentAthlete;
		Iterator iterator = this.athleteList.iterator();
		while(iterator.hasNext()){
			currentAthlete = (Athlete)iterator.next();
			System.out.println(currentAthlete);
	}
	}
	public void compete(int minTimer, int maxTimer){
		Random random = new Random();
		int finishTimer = random.nextInt(maxTimer-minTimer)+minTimer;
		this.setFinishTimer(finishTimer);
		
	}
/**
 * @description comparing the Athletes
 * @param firstAthlete Object of first Athlete
 * @param secondAthlete Object of second Athlete
 * @return difference of firstAthlete finish time and second Athlete finish time
 */
	@Override
	public int compare(Athlete firstAthlete, Athlete secondAthlete) {
		// TODO Auto-generated method stub
		return firstAthlete.getFinishTimer() - secondAthlete.getFinishTimer();
	}

	/**
	 * @description comparing the two different Athlete objects
	 * @param athlete passing athlete objects
	 * @return 1,0,-1 based on result
	 */
	@Override
	public int compareTo(Athlete athlete) {
		// TODO Auto-generated method stub
		return this.compare(this, athlete);
	}

}
