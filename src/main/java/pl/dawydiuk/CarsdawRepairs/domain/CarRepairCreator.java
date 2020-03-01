package pl.dawydiuk.CarsdawRepairs.domain;

import pl.dawydiuk.CarsdawRepairs.dto.CarRepairDto;

class CarRepairCreator {

    CarRepair from(CarRepairDto carRepairDto) {
        return CarRepair.builder()
                .car(carRepairDto.getCar())
                .name(carRepairDto.getName())
                .build();
    }

}
