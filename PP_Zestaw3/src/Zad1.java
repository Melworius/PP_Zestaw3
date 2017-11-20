/*  Napisać program, który utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi 
 * z przedziału [−10, . . . , 10], a następnie:
 * a) wypisze na ekranie zawartość tablicy,
 * b) wyznaczy najmniejszy oraz największy element w tablicy,
 * c) wyznaczy średnią arytmetyczną elementów tablicy,
 * d) wyznaczy ile elementów jest mniejszych, ile większych od średniej.
 * e) wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego do pierwszego.
 * Wszystkie wyznaczone wartości powinny zostać wyświetlone na ekranie.
 * Wylosowane liczby:
 * -3 9 2 -10 -3 -4 -1 -5 -10 8
 * Min: -10, max: 9
 * Średnia: -1,00
 * Mniejszych od śr.: 6
 * Większych od śr.: 3
 * Liczby w odwrotnej kolejności:
 * 8 -10 -5 -1 -4 -3 -10 2 9 -3
 */
import java.util.*;
public class Zad1 {
	public static void main(String[] args) {
		int i;
		int over = 0;
		int under = 0;
		int min;
		int max;
		double mid;
		double suma = 0;
		int tab[] = new int[10];
		Random random = new Random();
	    for (i=0; i<10; i++ ) {
		tab[i] = random.nextInt(21)-10;
		
	    }
	    System.out.println(Arrays.toString(tab));
		min = tab[0];
		for(i=0; i<10; i++) {
		if(tab[i]<min) {
			min = tab[i];
		}
		}
		max = tab[0];
		for(i=0; i<10; i++) {
		if(tab[i]>max) {
			max = tab[i];
		}
		}
		for(i=0; i<10; i++) {
			suma+=tab[i];
		}
		mid = suma/10;
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Średnia: " + mid);
		for(i=0; i<10; i++) {
			if(tab[i]<mid) {
				under++;
			}
			if(tab[i]>mid) {
				over++;
			}
		}
		System.out.println("Mniejszych od śr.: " + under);
		System.out.println("Większych od śr.: " + over);
		for(i=9; i>=0; i--) {
			System.out.println(Arrays.toString(tab));
		}
		
	}
}	