package webler.szakdolgozat.honeyAndSalt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import webler.szakdolgozat.honeyAndSalt.entity.Recipe;
import webler.szakdolgozat.honeyAndSalt.repository.HoneyAndSaltRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private HoneyAndSaltRepository honeyrepo;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Recipe r = new Recipe();
		r.setName("Székelykáposzta");
		r.setPrepTime(11);
		r.setCookTime(111);
		r.setInstructions("TEdd ezt, tedd azt, majd később külön komment lesz erre:)");
		
		honeyrepo.save(r);
		
		Recipe r2 = new Recipe();
		r2.setName("Székelykáposzta");
		r2.setPrepTime(22);
		r2.setCookTime(34);
		r2.setInstructions(" kettes .TEdd ezt, tedd azt, majd később külön komment lesz erre:)");
		
		honeyrepo.save(r2);
	}
}
