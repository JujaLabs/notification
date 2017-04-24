package juja.microservices.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Danil Kuznetsov
 */

@SpringBootApplication
public class NotificationServiceStarter {

    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceStarter.class, args);
    }
}
