INSERT INTO Country (Code, Name, Continent, Population) VALUES ('USA', 'United States', 'North America',331002651);
INSERT INTO Country (Code, Name, Continent, Population) VALUES ( 'JPN', 'Japan', 'Asia',125960000);
INSERT INTO Country (Code, Name, Continent, Population) VALUES ( 'FRA', 'France', 'Europe',65273511);
INSERT INTO Country (Code, Name, Continent, Population) VALUES ( 'NOR', 'Norway', 'Europe',4478500);

INSERT INTO City (Id, Name, CountryCode, District, Population) VALUES (1, 'New York', 'USA', 'New York', 8419600);
INSERT INTO City (Id, Name, CountryCode, District, Population) VALUES (2, 'Tokyo', 'JPN', 'Tokyo-to', 13929286);
INSERT INTO City (Id, Name, CountryCode, District, Population) VALUES (3, 'Paris', 'FRA', 'Ile-de-France', 2140526);

INSERT INTO CountryLanguage (CountryCode, Language, IsOfficial) VALUES ('USA', 'English', TRUE);
INSERT INTO CountryLanguage (CountryCode, Language, IsOfficial) VALUES ('JPN', 'Japanese', TRUE);
INSERT INTO CountryLanguage (CountryCode, Language, IsOfficial) VALUES ('FRA', 'French', TRUE);