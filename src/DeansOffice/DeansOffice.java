package src.DeansOffice;

import src.EducationalRoom.EducationalRoom;
import src.TimetableRoom.TimetableRoom;
import src.TimetableRoomImpl.TimetableRoomImpl;

public class DeansOffice extends EducationalRoom implements TimetableRoom{
	
	String nameDean;
	TimetableRoomImpl timetableRoom;
	static Integer hourStarted = 8;
	static Integer hourShutdown = 17;	
	
	public DeansOffice(int floor, int numberOfRoom, String nd){
		super(floor, numberOfRoom);	
		nameDean = nd;
		timetableRoom = new TimetableRoomImpl(hourStarted, hourShutdown);
	}		
	
	@Override
	public int getWorkdaySize(){
		return hourShutdown - hourStarted;
	}
	
	public static void main(String args[]){
		EducationalRoom educationalRoom = new EducationalRoom(1, 11);		
		educationalRoom.open("DeansOffice opens!");
		DeansOffice deansOffice = new DeansOffice(1, 11, "Ivanov");
		System.out.println(deansOffice.getWorkdaySize());
	}
		
}