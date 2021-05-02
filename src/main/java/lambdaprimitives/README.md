## Gyakorlat - Sportbolt

Hozz létre egy Product osztályt, amely a sportszer nevét, árát, darabszámát tárolja! A konstruktora is ezeket kapja meg ugyanebben a sorrendben. A SportGadgetStore osztály tárolja a termékek listáját, és különböző statisztikákat készít belőle. Az osztály kapja meg a listát kívülről.

Készítsd el a következő metódusokat streamek segítségével:

getNumberOfProducts(): összesen hány termék van a boltban,

getAveragePrice(): átlagosan mennyibe kerül egy termék. Ha nincs termék, 0-t adjon vissza.

getExpensiveProductStatistics(double minPrice): adott árnál drágább termékek darabszámáról szolgáltat statisztikát. Az összesítést szövegként adja vissza az alábbi formában:

Összesen 3 féle termék, amelyekből minimum 1 db, maximum 52 db, összesen 74 db van.

Ha nincs ilyen, akkor a visszaadott szöveg a Nincs ilyen termék. legyen!