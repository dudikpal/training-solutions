## Gyakorlat - Kávézó v2

Készíts egy Coffee osztályt! Attribútumai: type a kávé típusa, price a kávé ára. A konstruktor is ebben a sorrendben kapja meg az adatokat. Az ár lehet tört, 2 tizedesjegy pontossággal számolj!

A kávé típusához készíts egy CoffeeType enum-ot. Lehetséges értékei: ESPRESSO, MACHIATTO, RISTRETTO, MOCHA, LATTE, CAPPUCCINO, AMERICANO.

A CoffeeOrder osztály tárolja egy vásárló által megrendelt és leszámlázott kávékat. Attibútumai: coffeeList a megrendelt kávék listája, dateTime a vásárlás időpontja.

A Cafe osztály tartalmazza a kávézó összes rendelését egy listában. A listát a konstruktorban kapja meg, de legyen lehetőség új rendelést hozzáadni. Készítsd el benne az alábbi metódusokat streamek segítségével:

Map<CoffeeType, Long> getCountByCoffeeType(): az eladott kávék mennyiségét adja vissza kávétípusonként

double getAverageOrder(): átlagosan hány kávét rendelnek egyszerre

[rating feedback=java-lambdacollectors-kavezov2]