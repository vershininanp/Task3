package com.vershininanp.javatasks.task3.lectureroom;

import com.vershininanp.javatasks.task3.educationalroom.EducationalRoom;

public class LectureRoom extends EducationalRoom {

	int numberOfSeats;
	
	public LectureRoom(int floor, int numberOfRoom, int ns) {
		super(floor, numberOfRoom);	
		numberOfSeats = ns;
	}
	
	public void open() {
		System.out.println("LectureRoom opens!");
	}

}