package mintic.usa.ciclo4.web;

import mintic.usa.ciclo4.web.repositorios.CloneCrudRepository;
import mintic.usa.ciclo4.web.repositorios.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto2Application implements CommandLineRunner{
        @Autowired
        private CloneCrudRepository cloneRepository;
        
        @Autowired
        private UserCrudRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(Reto2Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        cloneRepository.deleteAll();
    }

}

/*



*/
