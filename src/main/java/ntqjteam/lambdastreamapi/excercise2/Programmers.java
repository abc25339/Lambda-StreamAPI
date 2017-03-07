package ntqjteam.lambdastreamapi.excercise2;

import java.util.ArrayList;
import java.util.List;

import ntqjteam.lambdastreamapi.excercise2.Programmer.Gender;

public class Programmers {

	public static List<Programmer> initProgrammers(){
		List<Programmer> programmerList = new ArrayList<>();
		Programmer programmer1 = new Programmer("1", "PROGRAMMER1", "division1", "team1", Programmer.Gender.MALE);
		Programmer programmer2 = new Programmer("2", "PROGRAMMER2", "division2", "team2", Programmer.Gender.FEMALE);
		programmerList.add(programmer1);
		programmerList.add(programmer2);
		return programmerList;
	}
	
}
