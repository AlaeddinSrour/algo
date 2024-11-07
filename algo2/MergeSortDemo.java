package algo2;

import java.util.Arrays;

public class MergeSortDemo {

    public static void main(String[] args) {
        char[] a = {'a', 'Z', 'g', '9', 'o', 'l', 'j', 'w', 'y', '1'};
        System.out.println("Zu sortierendes Array: " + Arrays.toString(a));
        char[] hilfeArray = new char[a.length];

        sortiere(a, 0, a.length - 1, hilfeArray);

        System.out.println("Sortiertes Array: " + Arrays.toString(a));
    }

    public static void sortiere(char[] a, int begin, int end, char[] hilfeArray) {
        if (end - begin > 0) {
            int middle = (begin + end) / 2;
            sortiere(a, begin, middle, hilfeArray);
            sortiere(a, middle + 1, end, hilfeArray);
            mergeParts(a, begin, middle, end, hilfeArray);
        }
    }

    public static void mergeParts(char[] a, int begin, int middle, int end, char[] hilfeArray) {
        for (int i = begin; i <= end; i++) {
            hilfeArray[i] = a[i];
        }

        int lI = begin;
        int rI = middle + 1;
        int oI = begin;
        
        System.out.println("Aufruf von sortiereMitMergeSort mit begin = " + begin + " und end = " + end + ".");


        System.out.print("Zu mergender Teil ist: ");
        System.out.println(Arrays.toString(Arrays.copyOfRange(hilfeArray, begin, end + 1)));

        while (lI <= middle && rI <= end) {
            if (hilfeArray[lI] < hilfeArray[rI]) {
                a[oI] = hilfeArray[lI];
                lI++;
            } else {
                a[oI] = hilfeArray[rI];
                rI++;
            }
            oI++;
        }

        while (lI <= middle) {
            a[oI] = hilfeArray[lI];
            oI++;
            lI++;
        }
        while (rI <= end) {
            a[oI] = hilfeArray[rI];
            oI++;
            rI++;
        }

        System.out.print("Gemergter Teil ist nun: ");
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, begin, end + 1)));
    }
}
