package algov1;
import java.util.Arrays;



public class AlgoVersuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []array = {87, 80, 65, 77, 39, 88, 22, 11};
		
		System.out.println("Zu sotierendes Array "+Arrays.toString(array));
		
		sotiereMitMergeSortint(array, 0, array.length-1 );
		
		System.out.println("Sotiertes Array "+Arrays.toString(array));
		
	}
	public static void sotiereMitMergeSortint (int []array, int anfang,  int ende) {
		
		if(anfang < ende) {
			int mitte=(anfang + ende)/2;
			
			sotiereMitMergeSortint(array, anfang, mitte);
			sotiereMitMergeSortint(array, mitte +1, ende);
			merge(array, anfang, mitte, ende);
		}	
	}
	
	public static void merge(int array[], int anfang, int mitte, int ende) {
		
		int [] tempArry=Arrays.copyOfRange(array, anfang, ende +1);
		
		int i=anfang;//left 
		int j=mitte +1;
		int k=anfang;//right
		
		System.out.println("Aufruf von sortierenmitMerge mit beginn = "+anfang + " ende "  + ende);
		
		System.out.println("Zu mergender Array "+Arrays.toString(tempArry));
		
		
		while ( i <= mitte && j <= ende) {
			
			if(tempArry[i- anfang] <= tempArry[j-anfang]) {
				array[k] =tempArry[i- anfang];
				i++;
			
			}else {
				array[k] =tempArry[j- anfang];
				j++;
			}
			k++;
		}
		while ( i <= mitte) {
			array[k]=tempArry[i-anfang];
			i++;
			k++;
			
		}
		System.out.println("Gemergter Teil ist nun : "+Arrays.toString(Arrays.copyOfRange(array, anfang, ende +1)));
	}

}