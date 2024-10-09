package CarmineGargiulo;

import com.github.javafaker.Faker;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Locale;

public class Application {
    private static final Faker faker = new Faker(Locale.ITALY);
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestione-eventi");
    public static void main(String[] args) {

    }
}
