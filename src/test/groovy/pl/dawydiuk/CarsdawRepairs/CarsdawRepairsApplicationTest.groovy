package pl.dawydiuk.CarsdawRepairs

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

@SpringBootTest
@ActiveProfiles("local")
class CarsdawRepairsApplicationTest extends Specification {

    @Autowired(required = false)
    private CarRepairController controller

    def "when context is loaded then all expected beans are created"() {
        expect: "the CarRepairController is created"
        controller
    }
}
