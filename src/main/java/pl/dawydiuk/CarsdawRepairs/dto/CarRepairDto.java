package pl.dawydiuk.CarsdawRepairs.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CarRepairDto {

    private Integer id;

    private String car;

    private String description;

    private BigDecimal price;
}
