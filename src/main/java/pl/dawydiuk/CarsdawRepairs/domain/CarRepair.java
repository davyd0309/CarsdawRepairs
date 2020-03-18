package pl.dawydiuk.CarsdawRepairs.domain;

import lombok.Builder;
import lombok.Getter;
import pl.dawydiuk.CarsdawRepairs.dto.CarRepairDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@Getter
class CarRepair {

    @Id
    @GeneratedValue
    private Integer id;

    private String car;

    private String name;


    CarRepairDto dto() {
        return CarRepairDto.builder()
                .car(car)
                .name(name)
                .build();
    }
}
