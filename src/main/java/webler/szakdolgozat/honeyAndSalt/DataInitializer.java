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
		
		
		Recipe r4 = new Recipe();
		r4.setName("NUTELLA®-val töltött churros");
		r4.setPrepTime(45);
		r4.setCookTime(15);
		r4.setInstructions("<p>A vizet és a vajat egy csipet sóval egy lábasba tesszük, felforraljuk, majd beleszórjuk a lisztet, és folyamatosan kevergetve 4-5 percig pirítjuk, amíg a tészta elválik az edény falától. Melós a dolog, de meg kell csinálni. Ezután a tésztát kiborítjuk egy vágódeszkára, és kicsit szétterítjük, hogy hamar kihűljön. \r\n" + 
				"\r\n" + 
				"A tésztát visszatesszük az edénybe, és először az egyik tojást dolgozzuk bele, majd a másikat is. A kész tésztát egy csillagcsöves habzsákba töltjük, majd 170 fokra melegített olajba 8-10 cm hosszú rudakat nyomunk belőle úgy, hogy a végét ollóval vágjuk el. Pár perc alatt aranybarnára sütjük (egyszerre mindig csak 4-5 darabot, nehogy összetapadjanak), majd törlőpapírra szedjük őket. \r\n" + 
				"\r\n" + 
				"A NUTELLA®-t belekanalazzuk egy másik habzsákba, aminek a végét éppen csak milliméteresre vágjuk. A még meleg churrosokat egy hurkapálcával csak az egyik oldalukon kilyukasztjuk, majd a mélyedést a hurkapálcát mozgatva kicsit kitágítjuk, és beletöltjük a NUTELLA®-t a habzsákból.</p> <div id='forras'>~ forrás: streetkitchen.hu</div>");
		r4.setImg("img/nutella.jpg");
		
		Ingredients r4i = new Ingredients();
		r4i.setName("250 ml víz");
		r4i.setRecipe(r4);
		
		Ingredients r4i2 = new Ingredients();
		r4i2.setName("100 g vaj");
		r4i2.setRecipe(r4);
		
		Ingredients r4i3 = new Ingredients();
		r4i3.setName("csipt só");
		r4i3.setRecipe(r4);
		
		Ingredients r4i4 = new Ingredients();
		r4i4.setName("140 g liszt");
		r4i4.setRecipe(r4);
		
		Ingredients r4i5 = new Ingredients();
		r4i5.setName("60 g Nutella");
		r4i5.setRecipe(r4);
		
		Ingredients r4i6 = new Ingredients();
		r4i6.setName("2 tojás");
		r4i6.setRecipe(r4);
		
		Ingredients r4i7 = new Ingredients();
		r4i7.setName("olaj");
		r4i7.setRecipe(r4);
		
		r4.getIngredients().add(r4i);
		r4.getIngredients().add(r4i2);
		r4.getIngredients().add(r4i3);
		r4.getIngredients().add(r4i4);
		r4.getIngredients().add(r4i5);
		r4.getIngredients().add(r4i6);
		r4.getIngredients().add(r4i7);
		
		honeyrepo.save(r4);
		
		Recipe r5 = new Recipe();
		r5.setName("Zöld pestos-húsos tortellini");
		r5.setPrepTime(15);
		r5.setCookTime(15);
		r5.setInstructions("<p>A zöld pesztós-húsos tortellini a tészta elkészítésével kezdődik. A tortellinit lobogó, forró vízben kifőzzük. Ez mindössze egy perc. Ne főzzük túl, mert könnyen kilyukadhat, és kiesik belőle a töltelék.\r\n" + 
				"\r\n" + 
				"Egy serpenyőben elkeverjük a pesztót és a tejszínt, hozzáadjuk a zúzott fokhagymát, és az egészet összeforraljuk. A végén beledobjuk a vajat, és ha szükséges, megsózzuk. Amikor a mártás elkészült, belekeverjük a tortellinit, és már tálalhatjuk is. Tálalásnál meglocsoljuk egy kevés olívaolajjal, a tetejét pár levél friss bazsalikommal díszítjük, és ráreszeljük a trappistát.</p> <div id='forras'>~ forrás: streetkitchen.hu</div>");
		r5.setImg("img/tortellini.jpg");
		
		Ingredients r5i = new Ingredients();
		r5i.setName("500 g tortellini");
		r5i.setRecipe(r5);
		
		Ingredients r5i2 = new Ingredients();
		r5i2.setName("200 g pesto");
		r5i2.setRecipe(r5);
		
		Ingredients r5i3 = new Ingredients();
		r5i3.setName("300 ml tejszín");
		r5i3.setRecipe(r5);
		
		Ingredients r5i4 = new Ingredients();
		r5i4.setName("2 gerezd fokhagyma");
		r5i4.setRecipe(r5);
		
		Ingredients r5i5 = new Ingredients();
		r5i5.setName("1 kanál vaj");
		r5i5.setRecipe(r5);
		
		Ingredients r5i6 = new Ingredients();
		r5i6.setName("só");
		r5i6.setRecipe(r5);
		
		Ingredients r5i7 = new Ingredients();
		r5i7.setName("olaj");
		r5i7.setRecipe(r5);
		
		Ingredients r5i8 = new Ingredients();
		r5i8.setName("100 g trappista");
		r5i8.setRecipe(r5);
		
		Ingredients r5i9 = new Ingredients();
		r5i9.setName("bazsalikom");
		r5i9.setRecipe(r5);
		
		r5.getIngredients().add(r5i);
		r5.getIngredients().add(r5i2);
		r5.getIngredients().add(r5i3);
		r5.getIngredients().add(r5i4);
		r5.getIngredients().add(r5i5);
		r5.getIngredients().add(r5i6);
		r5.getIngredients().add(r5i7);
		r5.getIngredients().add(r5i8);
		r5.getIngredients().add(r5i9);
		
		honeyrepo.save(r5);
		
		Recipe r6 = new Recipe();
		r6.setName("Tarjás.parajos serpenyős krumpli");
		r6.setPrepTime(20);
		r6.setCookTime(40);
		r6.setInstructions("<p>A tarját felkockázzuk, a hagymát és a fokhagymát felszeleteljük, és az egészet megpirítjuk egy kis olajon a serpenyőben.\r\n" + 
				"\r\n" + 
				"Felöntjük a tejszínnel és az alaplével, beletesszük a parajt, és egybeforraljuk. Ízesítjük a szerecsendióval, sóval, borssal, belereszelünk 60 grammnyi sajtot, majd belekeverjük a meghámozott, felszeletelt nyers krumplit. Lefedjük alufóliával, és 185 fokra előmelegített sütőbe toljuk 15-20 percre.\r\n" + 
				"\r\n" + 
				"Ezután levesszük róla a fóliát, és a tetejére reszeljük a maradék sajtot, majd fólia nélkül további 15-20 percig sütjük.\r\n" + 
				"\r\n" + 
				"Kis tejföllel tálalva az igazi.</p> <div id='forras'>~ forrás: streetkitchen.hu</div>");
		r6.setImg("img/krumpli.jpg");
		
		Ingredients r6i = new Ingredients();
		r6i.setName("250 g főtt tarja");
		r6i.setRecipe(r6);
		
		Ingredients r6i2 = new Ingredients();
		r6i2.setName("2 hagyma");
		r6i2.setRecipe(r6);
		
		Ingredients r6i3 = new Ingredients();
		r6i3.setName("180 ml tejszín");
		r6i3.setRecipe(r6);
		
		Ingredients r6i4 = new Ingredients();
		r6i4.setName("4 gerezd fokhagyma");
		r6i4.setRecipe(r6);
		
		Ingredients r6i5 = new Ingredients();
		r6i5.setName("1 csipet szerecsendió");
		r6i5.setRecipe(r6);
		
		Ingredients r6i6 = new Ingredients();
		r6i6.setName("só");
		r6i6.setRecipe(r6);
		
		Ingredients r6i7 = new Ingredients();
		r6i7.setName("olaj");
		r6i7.setRecipe(r6);
		
		Ingredients r6i8 = new Ingredients();
		r6i8.setName("200 g paraj");
		r6i8.setRecipe(r6);
		
		Ingredients r6i9 = new Ingredients();
		r6i9.setName("200 ml alaplé");
		r6i9.setRecipe(r6);
		
		Ingredients r6i10 = new Ingredients();
		r6i10.setName("100 g trappista");
		r6i10.setRecipe(r6);
		
		Ingredients r6i11 = new Ingredients();
		r6i11.setName("bors");
		r6i11.setRecipe(r6);
		
		Ingredients r6i12 = new Ingredients();
		r6i12.setName("700 g krumpli");
		r6i12.setRecipe(r6);
		
		Ingredients r6i13 = new Ingredients();
		r6i13.setName("tejföl");
		r6i13.setRecipe(r6);
		
		r6.getIngredients().add(r6i);
		r6.getIngredients().add(r6i2);
		r6.getIngredients().add(r6i3);
		r6.getIngredients().add(r6i4);
		r6.getIngredients().add(r6i5);
		r6.getIngredients().add(r6i6);
		r6.getIngredients().add(r6i7);
		r6.getIngredients().add(r6i8);
		r6.getIngredients().add(r6i9);
		
		honeyrepo.save(r6);
		
		Recipe r7 = new Recipe();
		r7.setName("Csokis muffin glutén- és laktóz nélkül");
		r7.setPrepTime(25);
		r7.setCookTime(25);
		r7.setInstructions("<p>A tészta hozzávalóit alaposan összekeverjük a vaníliarúd kikapart magjaival, majd muffinkapszlikkal bélelt muffinsütő formában 12-felé osztjuk. 175 fokra előmelegített sütőbe toljuk őket kb. 25 percre, majd hagyjuk kihűlni. \r\n" + 
				"\r\n" + 
				"Közben a krém hozzávalóit összemelegítjük, majd hűtőbe dobjuk, és ha hidegre hűlt (de ne várjuk meg, amíg szilárdra hűl), egy robotgéppel kihabosítjuk, és csillagcsöves nyomózsákból a muffinok tetejére nyomjuk. Reszelt csokival és pár szem mandulával díszíthetjük a tetejüket.</p> <div id='forras'>~ forrás: streetkitchen.hu</div>");
		r7.setImg("img/muffin.jpg");
		
		Ingredients r7i = new Ingredients();
		r7i.setName("75 g kakaópor");
		r7i.setRecipe(r7);
		
		Ingredients r7i2 = new Ingredients();
		r7i2.setName("80 g mandulaliszt");
		r7i2.setRecipe(r7);
		
		Ingredients r7i3 = new Ingredients();
		r7i3.setName("100 ml juharszirup");
		r7i3.setRecipe(r7);
		
		Ingredients r7i4 = new Ingredients();
		r7i4.setName("125 g almaszósz");
		r7i4.setRecipe(r7);
		
		Ingredients r7i5 = new Ingredients();
		r7i5.setName("125 ml kókuszolaj");
		r7i5.setRecipe(r7);
		
		Ingredients r7i6 = new Ingredients();
		r7i6.setName("4 tojás");
		r7i6.setRecipe(r7);
		
		Ingredients r7i7 = new Ingredients();
		r7i7.setName("10 g sütőpor");
		r7i7.setRecipe(r7);
		
		Ingredients r7i8 = new Ingredients();
		r7i8.setName("csipet só");
		r7i8.setRecipe(r7);
		
		Ingredients r7i9 = new Ingredients();
		r7i9.setName("0,5 vaniliarúd");
		r7i9.setRecipe(r7);
		
		r7.getIngredients().add(r7i);
		r7.getIngredients().add(r7i2);
		r7.getIngredients().add(r7i3);
		r7.getIngredients().add(r7i4);
		r7.getIngredients().add(r7i5);
		r7.getIngredients().add(r7i6);
		r7.getIngredients().add(r7i7);
		r7.getIngredients().add(r7i8);
		r7.getIngredients().add(r7i9);
		
		honeyrepo.save(r7);
	}
}
