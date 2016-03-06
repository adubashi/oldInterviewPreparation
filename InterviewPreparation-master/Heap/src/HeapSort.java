
public class HeapSort {
	
	void BuildHeap(Heap h, int A[], int n){
		if( h == null){
			return;
		}
		while( n > h.capacity){
			h.ResizeHeap();
		}
		for(int i= 0; i< n; i++){
			h.array[i] = A[i];
		}
	}
	
	void Heapsort(int A[], int n){
		Heap h = new Heap(n,0);
		int old_size, i,temp;
		BuildHeap(h, A, n);
		old_size = h.count;
		for(i = n - 1; i> 0;i++){
			temp = h.array[0];
			h.array[0] = h.array[h.count - 1];
			h.count--;
			h.PercolateDown(i);
		}
		h.count = old_size;
	}

}
