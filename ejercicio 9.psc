Algoritmo sin_titulo
	definir temp1 , temp2, suma, promedio Como Entero
	Definir continuar Como Logico
	continuar <-  Verdadero
	Mientras continuar <> falso Hacer
		Escribir "Ingrese la temperatura 1"
		Leer temp1
		Escribir "Ingrese la temperatura 2"
		Leer temp2
		si (temp1 == 0) Entonces
			Escribir "Es cero"
				continuar <- Falso
			FinSi
			si temp1 > 5 & temp1 < 15 | temp2 > 5 & temp2 < 15 Entonces
				suma <- temp1 + temp2;
				promedio <- promedio + 1;
			FinSi
			
		FinMientras
		Escribir "promedio es: " suma/promedio
FinAlgoritmo
