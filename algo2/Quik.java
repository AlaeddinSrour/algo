package algo2;

public class Quik {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


                char[] array = {'Z', 'b', 'k', 'g', 'x', 'v', 'r', 't', 'm', 'Y'};

                System.out.println("Zu sortierendes Array: " + java.util.Arrays.toString(array));
                quickSort(array, 0, array.length - 1);
                System.out.println("Sortiertes Array: " + java.util.Arrays.toString(array));
            }

            public static void quickSort(char[] array, int links, int rechts) {
                if (links < rechts) {
                    int pivotIndex = partition(array, links, rechts);
                    quickSort(array, links, pivotIndex - 1);
                    quickSort(array, pivotIndex + 1, rechts);
                }
            }

            public static int partition(char[] array, int links, int rechts) {
                char pivot = array[rechts];
                int i = links - 1;

                for (int j = links; j < rechts; j++) {
                    if (array[j] > pivot) {  // Sortiert in absteigender Reihenfolge
                        i++;
                        tausche(array, i, j);
                    }
                }
                tausche(array, i + 1, rechts);
                return i + 1;
            }

            public static void tausche(char[] array, int i, int j) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;



    }

}