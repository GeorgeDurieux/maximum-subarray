package gr.georgedurieux;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSubarray {
    private static int globalMaximum = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<>();

        System.out.println("Enter integers one by one. Type 'break' to stop:");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("break")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                inputList.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or type 'break' to finish.");
            }
        }

        if (inputList.isEmpty()) {
            System.out.println("No integers entered. Exiting program.");
            return;
        }

        int[] arr = inputList.stream().mapToInt(i -> i).toArray();
        int[] maxSubarray = findMaxSubarray(arr);

        System.out.print("Maximum Subarray: ");
        for (int num : maxSubarray) {
            System.out.print(num + " ");
        }
        System.out.println("\nMaximum Sum: " + globalMaximum);
    }

    public static int[] findMaxSubarray(int[] arr) {

        int localMaximum = arr[0];
        int start = 0, tempStart = 0, end = 0;

        for (int i = 1; i < arr.length; i++) {

            if (localMaximum + arr[i] > arr[i]) {
                localMaximum += arr[i];

            } else {
                localMaximum = arr[i];
                tempStart = i;
            }

            if (localMaximum > globalMaximum) {
                globalMaximum = localMaximum;
                start = tempStart;
                end = i;
            }
        }

        int[] result = new int[end - start + 1];
        System.arraycopy(arr, start, result, 0, end - start + 1);

        return result;
    }
}
