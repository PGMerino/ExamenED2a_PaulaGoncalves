package examen;

/**
 * @author DAM102
 * 
 */
public class Fecha {
	public static boolean validarFecha(int anio, int mes, int dia) {
		boolean fechaValida = false;
		if ((anio > 0) && (mes > 0) && (dia > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}