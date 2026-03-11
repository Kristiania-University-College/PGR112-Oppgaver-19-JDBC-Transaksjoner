# Oppgaver 19 - Transaksjoner

> All tasks are completed within this `assignment`-package

Det er fint å kunne lære hvordan vi kan redusere problemer med NullPointerException. 
Og hvordan kan vi legge inn rader der tabellen benytter AUTO_INCREMENT? Alle oppgavene omhandler World. 
Ta derfor gjerne utgangspunkt i world-prosjektet ditt, eller bruk tidligere løsningsforslag.

Lykke til med oppgavene!


## Oppgave 1 - autoinkrement (todo testing)

I forrige økt skulle du implementere CRUD-operasjoner. 
Ved en Create (INSERT) – hvordan la du inn primærnøkkel? 
Det er ikke alltid hensiktsmessig for en bruker å skulle bry seg om verdier på primærnøkler. 
I hvert fall ikke hvis de som blir automatisk generert i databasen. 
Sørg for å benytte en Create (INSERT) der primærnøkkel blir automatisk satt av databasen. 
Sørg også for å hente ut verdien på den nye nøkkelen.

## Oppgave 2 - optional (todo testing)

Sørg for at metodene i prosjektet ditt returnerer en Optional der 
metodene kan returnere en objektreferanse eller «ingen verdi» (null).


> Noen tips:
> - Husk at i SQL trenger vi enkeltfnutter rundt tekster når de skal behandles som tekst. Eksempel: SELECT * FROM Country WHERE name = 'Norway'; 
> - Hvis du mangler World-databasen, så finner du db-scriptet i Canvas
