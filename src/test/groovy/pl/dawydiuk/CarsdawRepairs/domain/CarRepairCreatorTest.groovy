package pl.dawydiuk.CarsdawRepairs.domain

import pl.dawydiuk.CarsdawRepairs.dto.CarRepairDto
import spock.lang.Specification

class CarRepairCreatorTest extends Specification {
    private CarRepairCreator creator = new CarRepairCreator();

    def "create CarRepair from dto - if correct dto build CarRepair"() {
        when:
        CarRepair result = creator.from(CarRepairDto.builder()
                .id(1)
                .car("Volvo")
                .description("My Volvo")
                .price(new BigDecimal(20000))
                .build())
        then:
        result.getCar() == "Volvo"
        result.getId() == 1
        result.getDescription() == "My Volvo"
        result.getPrice() == 20000
    }
}
