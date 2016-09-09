package src.EducationalRoom;

import src.DepartmentRoom.DepartmentRoom;

public class EducationalRoom extends DepartmentRoom{
	
	int numberOfRoom;
	
	public EducationalRoom(int floor, int n){
		super(floor);
		numberOfRoom = n;
	}	
		
	public void open(String s){
		System.out.println(s);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		EducationalRoom edRoom = (EducationalRoom) obj;
		if (this.numberOfRoom != edRoom.numberOfRoom)
			return false;		

	}
}