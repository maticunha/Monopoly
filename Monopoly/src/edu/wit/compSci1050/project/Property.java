package edu.wit.compSci1050.project;

public class Property implements Space {
	int ownedBy;
	String name;
	int position;
	int value;
	
	
	public Property(String name, int position, int value) {
		this.name = name;
		this.position = position;
		this.value = value;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getPosition() {
		return position;
	}
	
	public int getOwnedBy() {
		return ownedBy;
	}
	
	public void setOwnedBy(int n) {
		ownedBy = n;
	}

	@Override
	public void setPosition(int position) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValue(int n) {
		// TODO Auto-generated method stub
		
	}

}
