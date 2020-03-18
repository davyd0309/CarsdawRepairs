package pl.dawydiuk.CarsdawRepairs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.dawydiuk.CarsdawRepairs.domain.CarRepairFacade;
import pl.dawydiuk.CarsdawRepairs.dto.CarRepairDto;

import java.util.List;

@RestController
@RequestMapping("/repairs")
public class CarRepairController {

    private CarRepairFacade carRepairFacade;

    public CarRepairController(CarRepairFacade carRepairFacade) {
        this.carRepairFacade = carRepairFacade;
    }

    @GetMapping
    public String getAllCarRepairs() {
        return "{" +
                "MY ALL REPAIRS" +
                "}";
    }

    public CarRepairDto addRepair(CarRepairDto carRepairDto) {
        return carRepairFacade.addRepair(carRepairDto);
    }

    public CarRepairDto getCarRepairById(Integer carRepairId) {
        return carRepairFacade.getCarRepairById(carRepairId);
    }

}
