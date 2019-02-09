package com.example.health.boundary;

import com.example.ping.boundary.PingResource;
import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;

@Health
@ApplicationScoped
public class LivenessCheck implements org.eclipse.microprofile.health.HealthCheck {

    @Override
    public HealthCheckResponse call() {
        if (!isHealthy()) {
            return HealthCheckResponse.named(PingResource.class.getSimpleName())
                    .withData("services", "not available").down()
                    .build();
        }
        return HealthCheckResponse.named(PingResource.class.getSimpleName())
                .withData("services", "available").up().build();
    }

    private boolean isHealthy() {
        // Do health checks
        return true;
    }
}
