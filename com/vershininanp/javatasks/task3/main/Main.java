package com.vershininanp.javatasks.task3.main;

import java.util.*;
import com.vershininanp.javatasks.task3.departmentroom.DepartmentRoom;
import com.vershininanp.javatasks.task3.educationalroom.EducationalRoom;
import com.vershininanp.javatasks.task3.deansoffice.DeansOffice;
import com.vershininanp.javatasks.task3.lectureroom.LectureRoom;


public class Main {	

	public static void main(String[] args) {
		try { 			
			DepartmentRoom[] departmentRooms = {new EducationalRoom(1, "10"), new EducationalRoom(1, "11"), 
												new DeansOffice(1, "13", "Ivanov"), new DeansOffice(1, "16", "Petrov"), 
												new LectureRoom(1, "13", 15), new LectureRoom(1, "14", 10)};
			
			ArrayList<LectureRoom> lectureRooms = new ArrayList();
		
			for(int i = 0; i < departmentRooms.length; i++)	{
				for(int j = 0; (j < departmentRooms.length) && (j != i); j++) {
					if((departmentRooms[i].equals(departmentRooms[j])) 
							&& (departmentRooms[i].getClass() != departmentRooms[j].getClass())
							&& (departmentRooms[j].getClass().getName() != "com.vershininanp.javatasks.task3.educationalroom.EducationalRoom")) {
						throw new DublicateException("Exception! There was a duplicate of the room!");
					} 
				}
				
				departmentRooms[i].open(); 
								
				if (departmentRooms[i] instanceof LectureRoom) {
					lectureRooms.add((LectureRoom)departmentRooms[i]);
				}
			}								
											
		} catch (IllegalArgumentException ex) { 
			System.out.println("IllegalArgumentException!"); 
			return;
			
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException!"); 
			return;
			
		}  catch (DublicateException ex) { 
			System.out.println(ex.getMessage());				
		}
	}
}

class DublicateException extends Exception {
	
	String message;
	
	public DublicateException(String msg) {
		message = msg;
	}
	
	public String getMessage(){
		return message;
	}
}