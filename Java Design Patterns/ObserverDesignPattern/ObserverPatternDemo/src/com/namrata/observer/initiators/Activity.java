package com.namrata.observer.initiators;

import com.namrata.observer.classes.Observer;
import com.namrata.observer.classes.Subject;

public class Activity {

	public static void main(String[] args) {
		
		Subject emailService = new Subject();
		
		Observer person1 = new Observer();
		
		Observer person2 = new Observer();
		
		emailService.register(person1);
		emailService.register(person2);
		
		emailService.setChangingNumber(10);
		emailService.setChangingNumber(20);
		emailService.setChangingNumber(30);
		
		emailService.unregister(person2);
		
		emailService.setChangingNumber(40);
		emailService.setChangingNumber(50);
		
		
		emailService.unregister(person1);
		
		emailService.setChangingNumber(60);
		emailService.setChangingNumber(70);
		
		emailService.register(person1);
		emailService.setChangingNumber(80);

	}

}
