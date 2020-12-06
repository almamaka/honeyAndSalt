package webler.szakdolgozat.honeyAndSalt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import webler.szakdolgozat.honeyAndSalt.entity.Ingredients;
import webler.szakdolgozat.honeyAndSalt.entity.Recipe;
import webler.szakdolgozat.honeyAndSalt.entity.Role;
import webler.szakdolgozat.honeyAndSalt.entity.User;
import webler.szakdolgozat.honeyAndSalt.repository.HoneyAndSaltRepository;
import webler.szakdolgozat.honeyAndSalt.repository.RoleRepository;
import webler.szakdolgozat.honeyAndSalt.repository.UserRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private HoneyAndSaltRepository honeyrepo;
	
	@Autowired
	private UserRepository userRepo;
	
	
	@Autowired
	private PasswordEncoder passEncoder;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		User u = new User();
		u.setUsername("almamaka");
		u.setPassword(passEncoder.encode("11111111"));
		
		Role role = new Role();
		role.setName("admin");
		role.getUsers().add(u);

		u.getRoles().add(role);
		userRepo.save(u);	
			
		Recipe r = new Recipe();
		r.setName("Rakott tócsni liszt nélkül");
		r.setPrepTime(60);
		r.setCookTime(30);
		r.setInstructions("<p>Gluténmentes recept. A burgonyát, sárgarépát és a hagymát megtisztítjuk és lereszeljük. Hozzáadjuk a fűszereket és a tojásokat."
				+ "Sütőpapírral bélelt tepsibe öntjük a masszát. 170 °C előmelegített sütőben szép aranyszínűre sütjük."
				+ "Ha megsült, felkockázzuk. A kockákat megkenjük a sajtkrémmel."
				+ "A sajtkrémre ráfektetjük a felvágottat. Minden kockára teszünk. Arra a spenótlevelek. Arra a gombaszeletek. De csak 6 kockára teszünk gombát. Ahogy a képen látható. A gombásokra tesszük a lapka sajtokat is. Végül összefordítjuk a kockákat. A tetejére teszünk 1-1 szelet felvágottat még és megszórjuk reszelt sajttal. Visszatesszük a sütőbe még annyi időre, hogy a sajt szép aranybarna legyen rajta.</p><p> ~ https://cookpad.com/</p>");
		r.setImg("img/tocsni.jpg");
		
		Ingredients i = new Ingredients();
		i.setName("1,5 kg burgonya");
		i.setRecipe(r);
		
		Ingredients i2 = new Ingredients();
		i2.setName("3 db sárgarépa");
		i2.setRecipe(r);
		
		Ingredients i3 = new Ingredients();
		i3.setName("2 fej vöröshagyma");
		i3.setRecipe(r);
		
		Ingredients i4 = new Ingredients();
		i4.setName("só");
		i4.setRecipe(r);
		
		Ingredients i5 = new Ingredients();
		i5.setName("bors");
		i5.setRecipe(r);
		
		Ingredients i6 = new Ingredients();
		i6.setName("rozmaring");
		i6.setRecipe(r);
		
		Ingredients i7 = new Ingredients();
		i7.setName("fokhagymapor");
		i7.setRecipe(r);
		
		Ingredients i8 = new Ingredients();
		i8.setName("8 db tojás");
		i8.setRecipe(r);
		
		Ingredients i9 = new Ingredients();
		i9.setName("180 g lapka sajt");
		i9.setRecipe(r);
		
		Ingredients i10 = new Ingredients();
		i10.setName("2 db sajtkrém");
		i10.setRecipe(r);
		
		Ingredients i11 = new Ingredients();
		i11.setName("2 fej gomba");
		i11.setRecipe(r);
		
		Ingredients i12 = new Ingredients();
		i12.setName("12 db spenótlevél");
		i12.setRecipe(r);
		
		Ingredients i13 = new Ingredients();
		i13.setName("18 szelet felvágott");
		i13.setRecipe(r);
		
		r.getIngredients().add(i);
		r.getIngredients().add(i2);
		r.getIngredients().add(i3);
		r.getIngredients().add(i4);
		r.getIngredients().add(i5);
		r.getIngredients().add(i6);
		r.getIngredients().add(i7);
		r.getIngredients().add(i8);
		r.getIngredients().add(i9);
		r.getIngredients().add(i10);
		r.getIngredients().add(i11);
		r.getIngredients().add(i12);
		r.getIngredients().add(i13);
		
		honeyrepo.save(r);
		
		Recipe r2 = new Recipe();
		r2.setName("Olasz pizzatészta");
		r2.setPrepTime(30);
		r2.setCookTime(10);
		r2.setInstructions("<p>Langyos víz felében oldjuk fel az élesztőt, majd adjuk hozzá a liszt felét és a sót.Hagyjuk állni szobahőmérsékleten körülbelül negyed órát." + 
				"Adjuk hozzá a maradék lisztet, és gyúrjuk a tésztát keverőgépben vagy kézzel, amíg megfelelő állagú nem lesz." + 
				"A tésztából formázzunk kis zsemléket, és hagyjuk őket állni letakarva körülbelül 8 órán át." + 
				"Miután megkeltek a tészták, nyújtsuk ki őket kerek pizza formára, és helyezzük rájuk a feltéteket." + 
				"220-250 fokon előmelegített sütőben készre sütjük.</p> <div id='forras'>~ forrás: nosalty.hu</div>");
		r2.setImg("img/pizzateszta.jpg");
		
		Ingredients r2i = new Ingredients();
		r2i.setName("1 kg liszt");
		r2i.setRecipe(r2);
		
		Ingredients r2i2 = new Ingredients();
		r2i2.setName("2 g élesztő");
		r2i2.setRecipe(r2);
		
		Ingredients r2i3 = new Ingredients();
		r2i3.setName("640 ml víz");
		r2i3.setRecipe(r2);
		
		Ingredients r2i4 = new Ingredients();
		r2i4.setName("30 g só");
		r2i4.setRecipe(r2);
		
		r2.getIngredients().add(r2i);
		r2.getIngredients().add(r2i2);
		r2.getIngredients().add(r2i3);
		r2.getIngredients().add(r2i4);
		
		honeyrepo.save(r2);
		
		Recipe r3 = new Recipe();
		r3.setName("Fokhagymakrémleves");
		r3.setPrepTime(30);
		r3.setCookTime(10);
		r3.setInstructions("<p>A burgonyát megpucolom, majd kis kockákra vágom. A fokhagymát fokhagymanyomón átnyomom és a vajon kicsit megpirítom (világosra).</p>" + 
				"<p>Majd felöntöm alaplével, hozzáadom a kockára vágott burgonyát is. Sózom és addig főzöm, amíg a burgonya puha nem lesz (15 perc után kóstolom). Ha puha a krumpli, akkor botmixerrel pürésítem.</p>" + 
				"<p>Pirított kenyérkockával tálalom.</p> <div id='forras'>forrás: cookpad.com</div>");
		r3.setImg("img/fokhagymakremleves.jpg");
		
		Ingredients r3i = new Ingredients();
		r3i.setName("6 gerezd fokhagyma");
		r3i.setRecipe(r3);
		
		Ingredients r3i2 = new Ingredients();
		r3i2.setName("1 evőkanál vaj");
		r3i2.setRecipe(r3);
		
		Ingredients r3i3 = new Ingredients();
		r3i3.setName("1,5 liter zöldségalaplé");
		r3i3.setRecipe(r3);
		
		Ingredients r3i4 = new Ingredients();
		r3i4.setName("só");
		r3i4.setRecipe(r3);
		
		Ingredients r3i5 = new Ingredients();
		r3i5.setName("5 db burgonya");
		r3i5.setRecipe(r3);
		
		r3.getIngredients().add(r3i);
		r3.getIngredients().add(r3i2);
		r3.getIngredients().add(r3i3);
		r3.getIngredients().add(r3i4);
		r3.getIngredients().add(r3i5);

		honeyrepo.save(r3);
	}
}
