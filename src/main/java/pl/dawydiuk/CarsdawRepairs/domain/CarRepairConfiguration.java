package pl.dawydiuk.CarsdawRepairs.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CarRepairConfiguration {

    @Bean
    CarRepairCreator carRepairCreator() {
        return new CarRepairCreator();
    }

    @Bean
    CarRepairFacade carRepairFacade(CarRepairRepository carRepairRepository, CarRepairCreator carRepairCreator) {
        return new CarRepairFacade(carRepairRepository, carRepairCreator);
    }


}
