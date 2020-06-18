package pl.dawydiuk.CarsdawRepairs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dawydiuk.CarsdawRepairs.domain.CarRepairFacade;
import pl.dawydiuk.CarsdawRepairs.dto.CarRepairDto;

@RestController
@RequestMapping("/repairs")
@Slf4j
public class CarRepairController {

    private CarRepairFacade carRepairFacade;

    public CarRepairController(CarRepairFacade carRepairFacade) {
        this.carRepairFacade = carRepairFacade;
    }

    @GetMapping
    public String getAllCarRepairs() {
        log.info("Send RQ for all repairs");
        return "{" +
                "MY ALL REPAIRS - HELLO" +
                "}";
    }

    public CarRepairDto addRepair(CarRepairDto carRepairDto) {
        return carRepairFacade.addRepair(carRepairDto);
    }

    public CarRepairDto getCarRepairById(Integer carRepairId) {
        return carRepairFacade.getCarRepairById(carRepairId);
    }

}
