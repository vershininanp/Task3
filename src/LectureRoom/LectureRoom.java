package src.LectureRoom;

import src.EducationalRoom.EducationalRoom;

public class LectureRoom extends EducationalRoom{

	int numberOfSeats;
	
	public LectureRoom(int floor, int numberOfRoom, int ns){
		super(floor, numberOfRoom);	
		numberOfSeats = ns;
	}
	
	public static void main(String args[]){
		EducationalRoom educationalRoom = new EducationalRoom(1, 11);
		educationalRoom.open("LectureRoom opens!");
	}

}