package aaa;

public class queue {
	private static final int si = 100;
    private int[] array = new int[si];
    private int size = 0;

    public void Enqueue(int n) {
        if (size == 0) {
            array[size++] = n;
        } else {
            int index = 0;
            while (index < size && array[index] < n) {
                index++;
            }
            for (int i = size - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = n;
            size++;
        }
    }

    public void Dequeue() {
        if (size > 0) {
            if (array[0] - 2 <= 0) {
                for (int i = 0; i < size - 1; i++) {
                    array[i] = array[i + 1];
                }
                size--;
            } else {
                array[0] = array[0] - 2;
                int temp = array[0];
                int index = 1;
                while (index < size && array[index] < temp) {
                    array[index - 1] = array[index];
                    index++;
                }
                array[index - 1] = temp;
            }
        }
    }

    public void displayAll() {
        for (int i = 0; i < size; i++) {
            System.out.println("::" + array[i]);
        }
    }

}
