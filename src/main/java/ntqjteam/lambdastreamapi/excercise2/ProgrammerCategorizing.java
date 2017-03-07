package ntqjteam.lambdastreamapi.excercise2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ntqjteam.lambdastreamapi.excercise2.Programmer.Gender;

/**
 * Created by toan on 3/1/17.
 */
public class ProgrammerCategorizing {

	public static void main(String[] args) {
		List<Programmer> programmers = Programmers.initProgrammers(); // init

		// Categorize programmers into divisions
		Map<String, List<Programmer>> groupByDivision = programmers.stream()
				.collect(Collectors.groupingBy(Programmer::getDivision));

		// Categorize programmers into divisions, then teams, then genders
		Map<String, Map<String, Map<Gender, List<Programmer>>>> groupingByMultipleField = programmers.stream()
				.collect(Collectors.groupingBy(Programmer::getDivision,
						Collectors.groupingBy(Programmer::getTeam, Collectors.groupingBy(Programmer::getGender))));

	}

}
