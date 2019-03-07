package guru.springframework.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//uncomment @Component to enable this indicator
//@Component
public class CustomBipinHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        if (LocalDateTime.now().getMinute() % 2 == 0) {
            return Health.down()
                    .withDetail("ERR-002", "Even minutes, app only works on odd minutes")
                    .build();
        }

        return Health.up().build();
    }
}
