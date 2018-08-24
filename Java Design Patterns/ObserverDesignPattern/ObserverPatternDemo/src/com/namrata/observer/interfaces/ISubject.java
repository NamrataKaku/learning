package com.namrata.observer.interfaces;

import com.namrata.observer.classes.Observer;

public interface ISubject {

	void register(Observer observer);
	void unregister(Observer observer);
	void notifyObservers();
}
