package pl.dawydiuk.CarsdawRepairs.domain;

import pl.dawydiuk.CarsdawRepairs.dto.CarRepairDto;

class CarRepairCreator {

    CarRepair from(CarRepairDto carRepairDto) {
        return CarRepair.builder()
                .id(carRepairDto.getId())
                .description(carRepairDto.getDescription())
                .car(carRepairDto.getCar())
                .price(carRepairDto.getPrice())
                .build();
    }

}
