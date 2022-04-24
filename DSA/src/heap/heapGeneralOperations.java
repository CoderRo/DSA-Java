package heap;
import java.util.Scanner;
public class heapGeneralOperations {
	int size = 0;
	int capacity;
    int[] heap;
	public void insert( int element) {
		int i = size;
		i++;
		if( i > capacity) {
			System.out.println("Heap Capacity is full");
			return;
		}
		heap[i] = element;
		while (i > 1) {
			int parent = i/2;
			if( heap[parent] <  heap[i]) {
				int temp = heap[parent];
				heap[parent] = heap[i];
				heap[i] = temp;
			}else {
				break;
			}
			i = parent;
		}
		size++;
	}
	public void show() {
		for (int i = 1 ; i <= size ; i++ ) {
			System.out.println(heap[i]+" ");
		}
		System.out.println();
	}
	heapGeneralOperations(int n) {
		heap = new int[n];
		capacity = n;
	}
	public static void main (String args[]) {
		Scanner scObj = new Scanner(System.in);
		int n = scObj.nextInt();
		heapGeneralOperations heapObj = new heapGeneralOperations(n);
		System.out.print("1. Insert \n2. Delete \n3. Show\n4. Exit\n");
		int input = scObj.nextInt();
		while(input != 4 ) {
			switch (input) {
				case 1 :
					heapObj.insert(scObj.nextInt());
					break;
				case 3 :
					heapObj.show();
					break;
			}
			System.out.print("1. Insert \n2. Delete \n3. Show\n4. Exit\n");
			input = scObj.nextInt();
		}
	}
}
