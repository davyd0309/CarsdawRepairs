package pl.dawydiuk.CarsdawRepairs.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import pl.dawydiuk.CarsdawRepairs.dto.CarRepairDto;

@Transactional
@AllArgsConstructor
public class CarRepairFacade {

    private CarRepairRepository carRepairRepository;
    private CarRepairCreator carRepairCreator;

    public List<CarRepairDto> getAllCarRepairs() {
        return createListFromIterable().stream()
                .map(CarRepair::dto)
                .collect(Collectors.toList());
    }

    private List<CarRepair> createListFromIterable() {
        List<CarRepair> carRepairDtoList = new ArrayList<>();
        carRepairRepository.findAll().forEach(carRepairDtoList::add);
        return carRepairDtoList;
    }

    public CarRepairDto addRepair(CarRepairDto carRepairDto) {
        CarRepair carRepair = carRepairCreator.from(carRepairDto);
        return carRepairRepository.save(carRepair).dto();
    }

    public CarRepairDto getCarRepairById(Integer carRepairId) {
        return carRepairRepository.findById(carRepairId)
                .map(CarRepair::dto).orElseThrow(RuntimeException::new);
    }
}
