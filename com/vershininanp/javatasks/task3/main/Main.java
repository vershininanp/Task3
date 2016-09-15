package com.vershininanp.javatasks.task3.main;

import java.util.*;
import com.vershininanp.javatasks.task3.departmentroom.DepartmentRoom;
import com.vershininanp.javatasks.task3.educationalroom.EducationalRoom;
import com.vershininanp.javatasks.task3.deansoffice.DeansOffice;
import com.vershininanp.javatasks.task3.lectureroom.LectureRoom;


public class Main {
	
	public static void main(String[] args) {
		DepartmentRoom[] departmentRooms = {new EducationalRoom(1, 10), new EducationalRoom(1, 11), 
											new DeansOffice(1, 10, "Ivanov"), new DeansOffice(1, 11, "Petrov"), 
											new LectureRoom(1, 10, 15), new LectureRoom(1, 11, 10)};
											
		ArrayList lectureRooms = new ArrayList();
		
		for(int i = 0; i < departmentRooms.length; i++)	{
			departmentRooms[i].open();
			
			if (departmentRooms[i] instanceof LectureRoom) {
				lectureRooms.add(departmentRooms[i]);
			}
		}
		
	}
}