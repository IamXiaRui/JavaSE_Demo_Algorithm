package xr_algorithm_sort;

/*
 * 冒泡排序
 * 
 * 对相邻的两个数 进行排序 大的下沉 小的上浮
 * 
 * 直到全部比完
 * 
 * 时间复杂度    O(n^2)
 * 
 * */
public class BubbleSortTest {

	public static void main(String[] args) {
		int[] arr = { 49, 52, 10, 69, 100, 75, 32, 41, 65, 5, 82, 28, 13, 57, 16 };

		sop("排序前： ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}

		BubbleSort(arr);

		sop("\n\n排序后： ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}
	}

	// 排序方法
	public static void BubbleSort(int[] a) {

		int temp = 0;

		// 循环比较相邻的两个元素
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				// 如果后面的比前面小 则交换位置
				if (a[j] < a[i]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}

	public static void sop(Object obj) {
		System.out.print(obj);
	}
}
