CREATE TABLE Departamento(
DeptoID INT NOT NULL,
Nome VARCHAR(MAX) NOT NULL,
DataInsert DATETIME NULL DEFAULT GETDATE(),
Constraint PK_DeptoID PRIMARY KEY (DeptoID)
)

INSERT INTO Departamento(DeptoID, Nome)

SELECT 

RawD.DeptoID,
RawD.Nome

FROM [dbo].[RAW DATA - Departamentos] AS RawD