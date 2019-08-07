package com.LearnSpring;

import java.util.List;

public class Triangle {
	
	private String type;
	private int height;
	private Coordinates cordA;
	private Coordinates cordB;
	private Coordinates cordC;
	
	
	 static {
		System.out.println("Loading Triange Bean class");
	}
	private List<Coordinates> coordinateList;
	
	public List<Coordinates> getCoordinateList() {
		return coordinateList;
	}
	public void setCoordinateList(List<Coordinates> coordinateList) {
		this.coordinateList = coordinateList;
	}
	public Coordinates getCordA() {
		return cordA;
	}
	public void setCordA(Coordinates cordA) {
		this.cordA = cordA;
	}
	public Coordinates getCordB() {
		return cordB;
	}
	public void setCordB(Coordinates cordB) {
		this.cordB = cordB;
	}
	public Coordinates getCordC() {
		return cordC;
	}
	public void setCordC(Coordinates cordC) {
		this.cordC = cordC;
	}
	public String getType() {
		return type;
	}
	public Triangle(String type){
		this.type = type;
	}
	
	public Triangle(String type, int height ){
		this.type = type;
		this.height = height;
		System.out.println("Invoked from spring.xml");
	}
	public void shape(){
		System.out.println("The height of this "+type+" triagnle is"+ height);
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	
	public void printCoordinates(){
		System.out.println("Coordinates for Point A:"+ cordA.getX() + ","+ cordA.getY());
		System.out.println("Coordinates for Point B:"+ cordB.getX() + ","+ cordB.getY());
		System.out.println("Coordinates for Point C:"+ cordC.getX() + ","+ cordC.getY());
	}
	
	public void printCoordinateList(){
		for(Coordinates coor:this.coordinateList){
			System.out.println("Coordinates for Point :"+ coor.getX() + ","+ coor.getY());
		}
	}
	
}
