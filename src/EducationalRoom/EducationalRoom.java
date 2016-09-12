package src.EducationalRoom;

import src.DepartmentRoom.DepartmentRoom;

public class EducationalRoom extends DepartmentRoom {
	
	int numberOfRoom;
	
	public EducationalRoom(int floor, int n) {
		super(floor);
		numberOfRoom = n;
	}	
		
	public void open() {		
	
	}	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) { 
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		EducationalRoom edRoom = (EducationalRoom) obj;
		if (numberOfRoom != edRoom.numberOfRoom){
			return false;
		}
		
		return true;
	}
}