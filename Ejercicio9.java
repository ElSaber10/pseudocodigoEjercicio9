import java.util.*;
import java.util.Random;
public class Ejercicio9 {
	public static void main(String[] args){
	int T1 = 0, T2 = 0, t1 = 0, t2 = 0,sumt1 = 0,sumt2 = 0;
	double promt1, promt2;
	boolean sexo = true,sexo2 = true;
	String op;
	Scanner sc = new Scanner(System.in);
	while(sexo != false){
	sexo2 = true;
		System.out.println("Ingrese la temperatura 1)");
		T1 = sc.nextInt();
			if (T1 < 16){
			System.out.println("Se ingreso correctamente ");
			t1 += T2;
			sumt1++;
			while(sexo2 != false){
				System.out.println("Ingrese la temperatura 2)");
				T2 = sc.nextInt();
				if (T2 < 16){
				System.out.println("Se ingreso correctamente ");
				t2 += T2;
				sexo2 = false;
				}else{
				System.out.println("No se ingreso");
				}
			}
			if (T1 == 0){
			System.out.println("Terminooooo");
			sexo = false;
			}
			}else{
			System.out.println("No se ingreso");
			}
		}
		promt1 = t1 / sumt1;
		promt2 = t2 / sumt2;
		System.out.println("Promedio Temperatura 1 " + promt1);
		System.out.println("Promedio Temperatura 2 " + promt2);
	}
}

