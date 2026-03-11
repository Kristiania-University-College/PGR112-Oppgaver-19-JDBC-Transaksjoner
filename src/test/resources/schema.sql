
CREATE SCHEMA world;
USE world;

CREATE TABLE Country
(
    Code        VARCHAR(3) PRIMARY KEY,
    Name        VARCHAR(100) NOT NULL,
    Continent   ENUM('Asia','Europe','North America','Africa','Oceania','Antarctica','South America') NOT NULL DEFAULT 'Asia',
    Region      char(26)     NOT NULL DEFAULT '',
    SurfaceArea decfloat(2) NOT NULL DEFAULT 0.00,
    IndepYear int(6) DEFAULT NULL,
    Population BIGINT,
    LifeExpectancy decfloat(1) DEFAULT NULL,
    GNP decfloat(2) DEFAULT NULL,
    GNPOld decfloat(2) DEFAULT NULL,
    LocalName char(45) NOT NULL DEFAULT '',
    GovernmentForm char(45) NOT NULL DEFAULT '',
    HeadOfState char(60) DEFAULT NULL,
    Capital int(11) DEFAULT NULL,
    Code2 char(2) NOT NULL DEFAULT ''

);

CREATE TABLE City (
                      Id INT PRIMARY KEY,
                      Name VARCHAR(100) NOT NULL,
                      CountryCode VARCHAR(3) NOT NULL,
                      District VARCHAR(100) NOT NULL,
                      Population BIGINT,
                      FOREIGN KEY (CountryCode) REFERENCES Country(Code)
);

CREATE TABLE CountryLanguage (
                          CountryCode VARCHAR(3) NOT NULL,
                          Language VARCHAR(50) NOT NULL,
                          IsOfficial BOOLEAN NOT NULL DEFAULT FALSE,
                          Percentage decfloat(1) NOT NULL DEFAULT '0.0',
                          FOREIGN KEY (CountryCode) REFERENCES Country(Code)
);