package questions.sorting;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class MergeSort {

    public static void mergeSort(final int[] numbers, final int left, final int right) {
        if (numbers == null) {
            return;
        }

        if (right > left) {
            final int middle = (left + right) / 2;
            mergeSort(numbers, left, middle);
            mergeSort(numbers, middle + 1, right);
            merge(numbers, left, middle + 1, right);
        }
    }

    public static int[] mergeSort2(final int[] numbers, final int low, final int high) {
        mergeSort(numbers, low, high);
        return numbers;
    }

    static void merge(final int[] numbers, int left, int mid, int right) {
        final int[] array = new int[right + left + 1];
        int leftEnd = mid - 1;
        int index = left;
        int numElements = right - left + 1;

        while (left <= leftEnd && mid <= right) {
            if (numbers[left] <= numbers[mid]) {
                array[index++] = numbers[left++];
            } else {
                array[index++] = numbers[mid++];
            }
        }

        while (left <= leftEnd) {
            array[index++] = numbers[left++];
        }

        while (mid <= right) {
            array[index++] = numbers[mid++];
        }

        for (int i = 0; i < numElements; i++) {
            numbers[right] = array[right];
            right--;
        }
    }

    public static void sort(final int[] numbers) {
        if (numbers == null) {
            return;
        }

        final int length = numbers.length;

        if (length < 2) {
            return;
        }

        final int mid = length / 2;
        final int[] left = new int[mid];
        final int[] right = new int[length - mid];

        System.arraycopy(numbers, 0, left, 0, mid);
        System.arraycopy(numbers, mid, right, 0, length - mid);

        sort(left);
        sort(right);

        merge(numbers, left, right);
    }

    public static int[] sort2(final int[] numbers) {
        sort(numbers);
        return numbers;
    }

    static void merge(final int[] numbers, final int[] low, final int[] high) {
        final int leftLength = low.length;
        final int rightLength = high.length;
        int indexLeft = 0;
        int indexRight = 0;
        int index = 0;

        // Merge arrays
        while (indexLeft < leftLength && indexRight < rightLength) {
            if (low[indexLeft] <= high[indexRight]) {
                numbers[index] = low[indexLeft];
                indexLeft++;
            } else {
                numbers[index] = high[indexRight];
                indexRight++;
            }
            index++;
        }

        while (indexLeft < leftLength) {
            numbers[index] = low[indexLeft];

            indexLeft++;
            index++;
        }

        while (indexRight < rightLength) {
            numbers[index] = high[indexRight];

            indexRight++;
            index++;
        }
    }
}
