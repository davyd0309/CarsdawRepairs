package pl.dawydiuk.CarsdawRepairs

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest(classes = CarsdawRepairsApplication)
@AutoConfigureMockMvc
@ActiveProfiles("local")
class CarRepairControllerTest extends Specification {

    @Autowired
    private MockMvc mvc

    def "when get is performed then the response has status 200 and content is "() {
        expect: "Status is 200 and the response is 'Hello world!'"
        mvc.perform(get("/repairs"))
                .andExpect(status().isOk())
                .andExpect(content().json("""[
   {
      "id":1,
      "car":"Opel Astra",
      "description":"Serwis klimatyzacji",
      "price":250
   },
   {
      "id":2,
      "car":"Volvo V50",
      "description":"Remont silnika",
      "price":3500
   }
]"""));

    }

}
