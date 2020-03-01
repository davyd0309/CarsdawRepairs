package pl.dawydiuk.CarsdawRepairs.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CarRepairDto {

    private String car;

    private String name;
}
