package com.vershininanp.javatasks.task3.educationalroom;

import com.vershininanp.javatasks.task3.departmentroom.DepartmentRoom;

public class EducationalRoom extends DepartmentRoom {
	
	private int numberOfRoom;
	
	public EducationalRoom(int floor, int n) {
		super(floor);
		numberOfRoom = n;
	}	
		
	public void open() {		
	
	}	

	/*public int getNumberOfRoom(){
		return numberOfRoom;
	}*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) { 
			return false;
		}
		
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		EducationalRoom edRoom = (EducationalRoom) obj;
		if (this.numberOfRoom != edRoom.numberOfRoom){
			return false;
		}
		
		return true;
	}


}