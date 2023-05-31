package com.cobra.testsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyMain {

	public static void main(String[] args) {

		// this is inside main
        List<LatestCycleEligibleDependentDto> programLatestCycleEligibleDependents = new ArrayList();//.getLatestCycleAllEligibleDependents(applicationId, programId);

        programLatestCycleEligibleDependents.add(new LatestCycleEligibleDependentDto(123l));
        List<Long> programLatestCycleEligibleDependentsNin = programLatestCycleEligibleDependents.stream()
                .map(LatestCycleEligibleDependentDto::getDependentNin)
                .collect(Collectors.toList());
        
        System.out.println(programLatestCycleEligibleDependentsNin.size());
        System.out.println(programLatestCycleEligibleDependentsNin.get(0));
        System.out.println("Done");
	}

}
