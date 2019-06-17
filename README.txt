=== README ===

#Osallistujat:

##Jere Ojala
"Koodasi varsinaisen kääntäjän ja tulkin."

##Erkka Nurmi
"Suunnitteli lähdekielen. Osallistui jäsentimen ja selaajan tekemiseen. Loi testit.
Luonnosteli kohdekielen koodiesimerkit. Alkuvaiheessa projektin hallinta."

##Antti-Juhani Kaijanaho
"Loi esimerkkikääntäjän. Antoi ohjausta kääntäjän luomiseen."

#Mitä ohjelmia työn kääntämiseen ja kääntäjän ajamiseen tarvitaan:
Java kääntäjän ja jokin versio Javasta(testattu 11).
ANTLR-javakirjaston.

#Mitä apuohjelmia tarvitaan kääntäjän kohdekoodin ajamiseen:
WebAssemblya ajava JavaScript ja WebAssemblya tukeva selain (esim. Chrome).

#Ohjeet työn kääntämiseksi:

##Komentoriviltä:
Avaa komentorivi lähdekoodin kansiosta.
Syötä: javac *.java.
Syötä: jar cvfe [jarTiedostonNimi].jar mainApp *.class.

##Eclipsestä:
Valitse export File-pudotusvalikosta.
Valitse Runnable Jar File.
Valitse kohdekansio ja tiedostonimi.

#Ohjeet kääntäjän käyttämiseksi:
Avaa komentorivi.
Syötä: java -jar .\[jarTiedostonNimi].jar <käännettävä tiedosto> <mahdolliset parametrit>
Ohjelma luo uuden tekstitiedoston käännettävän koodin nimellä. ( PROGRAM koodinnimi() )
Luotu tekstitiedosto sisältää WAT-koodin.
HUOM: jos koodinnimi on sama kuin sen tekstitiedoston nimi samassa kansiossa, generoitu WAT-tekstitiedosto korvaa sen.

---

#Merkintä opintopisteistä opiskelijarekisteriin:
Jere Ojala, 21.2.1993
Erkka Nurmi, 26.10.1987

#Opintopisteet:
Työ täyttää 5 opintopisteen verran.
Sisältää perusominaisuudet(3 op) ja kääntää WAT:ia(2op).

#Sovitut aikataulumuutokset:
Sovittiin aluksi AJK:n kanssa deadlinen siirtoa 6.6.2019,
mutta ei ehditty valmiiksi asti, joten siirrettiin 20.6.2019.

#Tarkastuksen kiireellisyys:
Kummallakaan ryhmäläisistä ei ole kiire tarkastuksen kanssa.

#Yhtämielisyys projektin läpiviemisestä:
Ryhmäläiset ovat yhtämieltä projektin asioista.

---

#Kuvaus lähdekielestä:

Lähdekieli on yksinkertainen javamainen (mutta kuitenkin tyypitön) kieli.
Lähdekieli käsittelee vain kokonaislukuparametrejä.
Koodin tyypit ovat joko liukuluvut tai kokonaisluvut. (IF-ehto sisältää booleanin).
Palauttaa joko liukulukuja tai undefined/null.
Jakaminen palauttaa aina liukulukuja.
Muuttujat ovat tyypittömiä.
Käyttää ainoastaan 32-bittisiä tyyppejä.
FOR-silmukka vaatii kokonaisluvun (ei käänny, jos syöttää liukuluvun).
Ei sisällä aliohjelmia.


//koodin alustus
//koodin, parametrien tai muuttujien nimissä ei saa olla numeroita ja täytyy alkaa pienellä.
PROGRAM koodinNimi(x, y) {
	//koodi tähän...
}


//kommentit "//"-merkkinnän jälkeen rivikohtaisesti  


//sijoitus
kokonaisLukuMuuttuja := 1; //rivin loppuun ";"
liukuLukuMuuttuja := 0.1;


//Ehto-lauseke
//yhtäsuuruus: x = y
//pienempi kuin: x < y
//suurempi kuin: x > y
IF(input = 0){
	//then koodi
} ELSE {
	//else koodi
}


//Silmukka
//FOR:in sisään kokonaisluku
FOR(x){
	//koodi
}


//Palautus
//Lopettaa ohjelman
RETURN (x);	//palauttaa liukuluvun. Jos on kokonaisluku, se käännetään liukuluvuksi.
RETURN;		//palauttaa undefined:n.

