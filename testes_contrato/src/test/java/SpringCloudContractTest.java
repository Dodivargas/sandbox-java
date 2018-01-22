import io.restassured.module.mockmvc.specification.MockMvcRequestSpecification;
import io.restassured.response.ResponseOptions;
import org.junit.Test;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.assertj.core.api.Assertions.assertThat;


public class SpringCloudContractTest extends MvcTest {


    @Test
    public void validaCpf() throws Exception {

        // given:
        MockMvcRequestSpecification request = given()
                .header("Content-Type", "application/json")
                .body("{\"nome\":\"douglas\",\"cpf\":123.456.789-10}");

        // when:
        ResponseOptions response = given().spec(request)
                .post("/pessoa");
        // then:
        assertThat(response.statusCode()).isEqualTo(200);
    }

}