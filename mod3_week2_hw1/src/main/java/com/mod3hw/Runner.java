package com.mod3hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Runner {
	
	private String name;
	private int age;
	private double finishTime;
	
	@Autowired
	private MarathonId marathonid;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getFinishTime() {
		return finishTime;
	}


	public void setFinishTime(double finishTime) {
		this.finishTime = finishTime;
	}


	public MarathonId getMarathonid() {
		return marathonid;
	}


	public void setMarathonid(MarathonId marathonid) {
		this.marathonid = marathonid;
	}

	
	public void show () {
		System.out.println("Name: " + name + " | Age: " + age + " | Finish time: " + finishTime);
	}


}
