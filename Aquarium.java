package com.wcs.java.basics.exercises.w3c.AquariumTest;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

	public static void main(String[] args) {

//		Guppi guppi = new Guppi(3, 1, 1);
//
//		Guppi guppi2 = new Guppi(2, 2, 1);
//
//		Guppi guppi3 = new Guppi(2, 2, 1);
//
//		List<Guppi> fishList = new ArrayList<Guppi>();
//
//		fishList.add(0, guppi);
//		fishList.add(1, guppi2);
//		fishList.add(2, guppi3);
//
//		for (int i = 0; i < fishList.size(); i++) {
//			System.out.println(fishList.get(i).getAussehen());
//		}

		AquariumBecken aquariumBecken = new AquariumBecken();

		Guppi guppi = new Guppi(1, 1, 1);
		guppi.swim1();
	}
}
