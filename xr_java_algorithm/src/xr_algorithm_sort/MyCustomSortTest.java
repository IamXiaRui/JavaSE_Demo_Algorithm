package xr_algorithm_sort;

/*
 * 自己写的排序  这个排序应该属于冒泡排序的一种
 * 
 * 双重循环    时间复杂性为O(n^2)
 * 
 * */
public class MyCustomSortTest {

	public static void main(String[] args) {
		int[] arr = { 49, 52, 10, 69, 100, 75, 32, 41, 65, 5, 82, 28, 13, 57, 16 };

		sop("排序前： ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}

		// 定义一个交换元素的第三者
		int temp = 0;
		// 从第二个元素开始
		for (int i = 1; i < arr.length; i++) {
			// 与前面一个元素比较
			for (int j = i - 1; j >= 0; j--) {
				// 如果后面的小 那么交换
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					// 交换完了 注意 减小i的值 相当于 a[j]是前一个的前前一个的元素 a[i]才是前一个的元素
					i--;
				}
			}
		}

		sop("\n排序后： ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}
	}

	public static void sop(Object obj) {
		System.out.print(obj);
	}

}
