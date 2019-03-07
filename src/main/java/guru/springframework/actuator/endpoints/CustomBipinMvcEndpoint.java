package guru.springframework.actuator.endpoints;


        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter;
        import org.springframework.stereotype.Component;

@Component
public class CustomBipinMvcEndpoint extends EndpointMvcAdapter {

    @Autowired
    public CustomBipinMvcEndpoint(CustomBipinEndpoint customBipinEndpoint) {
        super(customBipinEndpoint);
    }
}
