import java.util.*;
public class SumoLandMetroLight {
public static int minLights(int[] arr, int L) {
        int n = arr.length;
        int[] start = new int[n];
        int[] end = new int[n];
        start[0] = 0;
        end[0] = arr[0];
        for (int i = 1; i < n; i++) {
            start[i] = end[i - 1];
            end[i] = start[i] + arr[i];
        }
        int trainLength = end[n - 1];
        int count = 0;
        int coverUntil = 0; 
        int i = 0;
        while (coverUntil < trainLength) {
            int bestReach = coverUntil;
            while (i < n && start[i] <= coverUntil + L) {
                bestReach = Math.max(bestReach, end[i]);
                i++;
            }

            if (bestReach == coverUntil) {
                return -1; 
            }
             coverUntil = bestReach;
            count++;
        }
       return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of compartments (N): ");
        int N = sc.nextInt();

        System.out.print("Enter underpass length (L): ");
        int L = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter lengths of compartments:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int result = minLights(arr, L);

        if (result == -1) {
            System.out.println("Not possible to light properly");
        } else {
            System.out.println("Minimum lights to turn ON = " + result);
        }
    }
}
