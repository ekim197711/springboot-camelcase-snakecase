package com.codeinvestigator.camelcasesnakecase.space;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceController {

    @GetMapping("/spacecraft")
    public SpaceCraft spaceCraft(){
        return SpaceCraft.builder()
                .fuelPercentageInThePrimaryTank(80.5d)
                .nameOfSpaceCraft("Hawk")
                .numberOfCrewMembersCurrentAboard(4123)
                .build();
    }

    @GetMapping("/alien")
    public Alien alien(){
        return Alien.builder()
                .birthNameOfAlien("ASDFAwefsdfsdf adadsf")
                .heightOfAlientIncludingTentacles(123.2)
                .weightOfAlientWhenHungry(73374.23)
                .build();
    }

    @GetMapping("/spacestation")
    public SpaceStation station(){
        return SpaceStation.builder()
                .isActiveNowForPeopleToUse(true)
                .lengthOfSpaceStationIncludingSolarPanels(123124.2)
                .weightOfSpaceStation(123123.5)
                .build();
    }


}
