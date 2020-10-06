package pl.dawydiuk.CarsdawRepairs.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import pl.dawydiuk.CarsdawRepairs.dto.CarRepairDto;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cars_repairs")
class CarRepair {

    @Id
    @GeneratedValue
    private Integer id;

    private String car;

    private String description;

    private BigDecimal price;

    CarRepairDto dto() {
        return CarRepairDto.builder()
                .id(id)
                .car(car)
                .description(description)
                .price(price)
                .build();
    }
}
