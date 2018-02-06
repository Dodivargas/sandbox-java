import app.endpoint.Endpoint;
import app.service.Service;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MvcTest {

    @Mock
    Service service;
    @InjectMocks
    Endpoint endpoint;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(endpoint);
    }

}
