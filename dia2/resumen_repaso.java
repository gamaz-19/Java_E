// Para RANGOS (dentro de):
if (numero >= min && numero <= max) { }

// Para EXCLUSIONES (fuera de):
if (numero < min || numero > max) { }


// Descuentos: restar
double total = precio - (precio * porcentaje);

// Recargos: sumar
double total = precio + (precio * porcentaje);

// Conversión: dividir entre 100
// 3.5% = 0.035
// 2.5% = 0.025