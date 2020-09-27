package pl.dawydiuk.CarsdawRepairs;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pl.dawydiuk.CarsdawRepairs.domain.CarRepairFacade;
import pl.dawydiuk.CarsdawRepairs.dto.CarRepairDto;

import java.util.List;

@RestController
@RequestMapping("/repairs")
@Slf4j
public class CarRepairController {

    private CarRepairFacade carRepairFacade;

    public CarRepairController(CarRepairFacade carRepairFacade) {
        this.carRepairFacade = carRepairFacade;
    }

    @GetMapping
    public List<CarRepairDto> getAllCarRepairs() {
            return carRepairFacade.getAllCarRepairs();
    }

    public CarRepairDto addRepair(CarRepairDto carRepairDto) {
        return carRepairFacade.addRepair(carRepairDto);
    }

    public CarRepairDto getCarRepairById(Integer carRepairId) {
        return carRepairFacade.getCarRepairById(carRepairId);
    }

    @GetMapping
    @RequestMapping("/test")
    public ResponseEntity testQ() {
        log.info("Send RQ for test");
        return new ResponseEntity<>("Hello KONRAD Test CarsdawRepairs !", HttpStatus.OK);
    }
}
