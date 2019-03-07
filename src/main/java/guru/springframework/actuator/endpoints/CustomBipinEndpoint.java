package guru.springframework.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomBipinEndpoint extends AbstractEndpoint<List<String>> {

    public CustomBipinEndpoint() {
        super("customBipinEndpoint", false);
    }

    @Override
    public List<String> invoke() {

        List<String> list = new ArrayList<>(3);
        list.add("Bipins's");
        list.add("McGee");
        list.add("THis is my thang!");
        list.add("Some more data!");
        list.add("last!");
        return list;
    }

}
