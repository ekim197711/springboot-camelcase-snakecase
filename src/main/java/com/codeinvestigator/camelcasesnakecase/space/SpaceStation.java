package com.codeinvestigator.camelcasesnakecase.space;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpaceStation {
    private String nameOfSpaceStationInEnglish;
    private Double lengthOfSpaceStationIncludingSolarPanels;
    private Double weightOfSpaceStation;
    private Boolean isActiveNowForPeopleToUse;
}
