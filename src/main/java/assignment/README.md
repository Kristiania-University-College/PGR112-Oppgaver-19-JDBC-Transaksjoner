# Oppgaver 19 Ekstra - Transaksjoner

> All tasks are completed within this `assignment`-package


Alle oppgavene omhandler World. Ta derfor gjerne utgangspunkt i world-prosjektet ditt, eller bruk tidligere løsningsforslag.
Ekstra oppgaven  er ganske omfattende, og du får trent på både lesing fra fil og JDBC (transaksjoner).

Lykke til med oppgavene!


## Ekstra Oppgave  - endre world-db (testes ikke)
Vi tenker oss et scenario der Australia skal splittes opp i ulike land basert på tidligere stater:
- New South Wales
- Victoria
- Queensland
- Western Australia
- South Australia
- Tasmania
  Du må sørge for at world-databasen blir endret tilsvarende, og du skal gjøre det via JDBC. I mappen files finner du en fil (australia.txt) som beskriver de ulike nye landene, hvilke byer (id) som ligger i dem, og hvilke språk som snakkes i de nye landene. 
- Gjør alle endringer i én transaksjon slik at du sørger for at databasen ikke havner i en «mellomtilstand».



> Noen tips:
> - Husk at i SQL trenger vi enkeltfnutter rundt tekster når de skal behandles som tekst. Eksempel: SELECT * FROM Country WHERE name = 'Norway'; 
> - Hvis du mangler World-databasen, så finner du db-scriptet i Canvas
