
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[] length = new int[6];
        int maxWidth = 0;
        int maxHeight = 0;
        int maxWidthIndex = 0;
        int maxHeightIndex = 0;
        for (int i = 0; i < 6; i++) {
            int way = sc.nextInt();
            int distance = sc.nextInt();
            length[i] = distance;
            if ((way == 3 || way == 4) && maxHeight < distance) {
                maxHeight = distance;
                maxHeightIndex = i;
            }
            if ((way == 1 || way == 2) && maxWidth < distance) {
                maxWidth = distance;
                maxWidthIndex = i;
            }
        }

        int right = 0;
        int left = 0;
        int minWidth = 0;
        int minHeight = 0;
        minWidth = getMin(length, maxWidthIndex);
        minHeight = getMin(length, maxHeightIndex);
        int minArea = minWidth * minHeight;
        int maxArea = maxWidth * maxHeight;
        System.out.println((maxArea - minArea) * K);
    }

    private static int getMin(int[] length, int maxIndex) {
        int right;
        int left;
        int minHeight;
        if (maxIndex + 1 == 6) {
            right = 0;
        } else {
            right = maxIndex + 1;
        }
        if (maxIndex - 1 == -1) {
            left = 5;
        } else {
            left = maxIndex - 1;
        }
        minHeight = Math.abs(length[right] - length[left]);
        return minHeight;
    }
}