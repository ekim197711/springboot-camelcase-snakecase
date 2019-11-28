package com.codeinvestigator.camelcasesnakecase.space;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategy.LowerDotCaseStrategy.class)
public class SpaceCraft {
    private String nameOfSpaceCraft;
    private Integer numberOfCrewMembersCurrentAboard;
    private Double fuelPercentageInThePrimaryTank;
}
