CREATE TABLE DepartamentosPorFuncionarios(
DeptoPorFuncID INT IDENTITY(1, 1) NOT NULL,
FuncionarioID INT NOT NULL,  
DeptoID INT NOT NULL ,
DataInicial DATETIME NOT NULL,
DataFinal DATETIME NOT NULL,
CONSTRAINT PK_DeptoPorFuncID PRIMARY KEY(DeptoPorFuncID),
CONSTRAINT FK_DepartamentosPorFuncionario_Funcionario FOREIGN KEY (FuncionarioID) REFERENCES Funcionario (FuncionarioID),
CONSTRAINT FK_DepartamentosPorFuncionario_Departamento FOREIGN KEY (DeptoID) REFERENCES Departamento (DeptoID)
)
GO

INSERT INTO DepartamentosPorFuncionarios(
FuncionarioID,
DeptoID,
DataInicial,
DataFinal)
	SELECT 
		RAWDATA.funcid,
		RAWDATA.deptoid,
		RAWDATA.datainicial,
		RAWDATA.datafinal
	FROM FuncionariosPorDeptos AS RAWDATA
	GO
