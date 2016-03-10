package xr_algorithm_sort;

/*
 * 直接插入排序
 * 
 * 每次从无序表中取出第一个元素，把它插入到有序表的合适位置，使有序表仍然有序。
 * 第一趟比较前两个数，然后把第二个数按大小插入到有序表中； 
 * 第二趟把第三个数据与前两个数从后向前扫描，把第三个数按大小插入到有序表中；
 * 依次进行下去，进行了(n-1)趟扫描以后就完成了整个排序过程。
 * 
 * 直接插入排序属于稳定的排序，最坏时间复杂性为O(n^2)，空间复杂度为O(1)。
 * 
 * */
public class InsertSortTest {

	public static void main(String[] args) {
		int[] a = { 49, 52, 10, 69, 100, 75, 32, 41, 65, 5, 82, 28, 13, 57, 16 };

		sop("排序前： ");
		for (int i = 0; i < a.length; i++) {
			sop(" " + a[i]);
		}

		InsertSort(a);

		sop("\n排序后： ");
		for (int i = 0; i < a.length; i++) {
			sop(" " + a[i]);
		}
	}

	// 排序方法
	public static void InsertSort(int[] arr) {
		// 初始化一个标志元素
		int temp = 0;

		// 从表中第二个元素开始
		for (int i = 1; i < arr.length; i++) {
			// 排序从第二个元素开始 因为默认第一个元素已经是有序的
			temp = arr[i];
			// j是当前元素的前一个元素 因为每次只需要从前一个开始逆向扫描 之前的已经是有序的
			int j = i - 1; // 从当前元素的前一个元素开始 与其逆向比较
			for (; j >= 0 && temp < arr[j]; j--) {
				// 如果后面的比前面小 则置换位置 //
				// 整个循环相当于把大于temp的所有元素整体往后移一个单位 就像当前元素插入一样
				arr[j + 1] = arr[j];
			}
			// 如果不满足 后面元素比前面大 后面保持位置不动 再循环找后面的元素
			arr[j + 1] = temp;
		}
	}

	public static void sop(Object obj) {
		System.out.print(obj);
	}

}
