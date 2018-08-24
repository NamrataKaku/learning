package com.namrata.observer.classes;

import java.util.ArrayList;
import java.util.List;

import com.namrata.observer.interfaces.ISubject;

public class Subject implements ISubject {

	private Integer changingNumber;
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	
	
	public Integer getChangingNumber() {
		return changingNumber;
	}

	public void setChangingNumber(Integer changingNumber) {
		System.out.println(changingNumber);
		this.changingNumber = changingNumber;
		notifyObservers();
	}

	@Override
	public void register(Observer observer) {
		
		observers.add(observer);
		
	}

	@Override
	public void unregister(Observer observer) {
		
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		
		for(Observer observer : observers) {
			observer.receiveUpdates();
		}
		
	}

}
