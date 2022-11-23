create database Loja;

use Loja;

CREATE TABLE Proprietario (
 codProprietario INT NOT NULL,
 Nome VARCHAR(50)
);

ALTER TABLE Proprietario ADD CONSTRAINT PK_Proprietario PRIMARY KEY (codProprietario);


CREATE TABLE Veiculo (
 Placa VARCHAR(7) NOT NULL,
 codProprietario INT NOT NULL,
 Modelo VARCHAR(50),
 Valor DECIMAL(10,2)
);

ALTER TABLE Veiculo ADD CONSTRAINT PK_Veiculo PRIMARY KEY (Placa);


ALTER TABLE Veiculo ADD CONSTRAINT FK_Veiculo_0 FOREIGN KEY (codProprietario) 
REFERENCES Proprietario (codProprietario);

INSERT INTO Proprietario values (1, 'João da Silva'),
                                (2, 'Pedro Antonio'),
                                (3, 'Maria Antonia');

INSERT INTO Veiculo values ('ABC1234', 1, 'Gol', 14800),
                           ('FAP8734', 2, 'Marea', 5900),
                           ('CLW7622', 1, 'Fusca', 11500);

