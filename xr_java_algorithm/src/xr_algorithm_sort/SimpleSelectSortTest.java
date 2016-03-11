package xr_algorithm_sort;

/*
 * 简单选择排序
 * 
 * 在全部的集合中  找到最小的元素跟第一个元素交换，
 * 然后从第二个元素开始找到最小的元素跟第二个元素交换
 * 直到倒数第二个元素与最后一个元素交换
 * 
 * 时间复杂度   O(n^2)
 * 
 * */
public class SimpleSelectSortTest {

	public static void main(String[] args) {
		int[] arr = { 49, 52, 10, 69, 100, 75, 32, 41, 65, 5, 82, 28, 13, 57, 16 };

		sop("排序前： ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}

		SimpleSelectSort(arr);

		sop("\n\n排序后： ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}
	}

	// 排序方法
	public static void SimpleSelectSort(int[] a) {

		// 定义交换元素
		int temp = 0;

		// 外面的循环用于移动序列首位置
		for (int i = 0; i < a.length; i++) {
			temp = i;
			// flag是每次循环的第一个元素
			int flag = a[i];
			// j 是 第一个元素之后的元素开始
			for (int j = i + 1; j < a.length; j++) {
				// 如果后面的元素小于 第一个元素 则交换
				if (a[j] < flag) {
					// 最小元素赋给flag
					flag = a[j];
					// 记住最后一个最小元素的下标
					temp = j;
				}
			}
			// 第一个元素 跟 最后一个最小元素 交换
			a[temp] = a[i];
			// 第一个元素为最小元素
			a[i] = flag;
		}
	}

	public static void sop(Object obj) {
		System.out.print(obj);
	}

}
