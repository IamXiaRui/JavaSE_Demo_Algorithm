package xr_algorithm_sort;

/*
 * 希尔排序
 * 
 * 算法先将要排序的一组数按某个增量d（n/2,n为要排序数的个数）分成若干组，
 * 每组中记录的下标相差d.对每组中全部元素进行直接插入排序，
 * 然后再用一个较小的增量（d/2）对它进行分组，在每组中再进行直接插入排序。
 * 当增量减到1时，进行直接插入排序后，排序完成。
 * 时间复杂度：不稳定，平均时间 O(nlogn) ，最差时间O(n^s)  1<s<2
 * 
 * */
public class ShellSortTest {

	public static void main(String[] args) {
		int[] a = { 49, 52, 10, 69, 100, 75, 32, 41, 65, 5, 82, 28, 13, 57, 16 };

		sop("排序前： ");
		for (int i = 0; i < a.length; i++) {
			sop(" " + a[i]);
		}

		ShellSort(a);

		sop("\n\n排序后： ");
		for (int i = 0; i < a.length; i++) {
			sop(" " + a[i]);
		}
	}

	// 排序方法
	public static void ShellSort(int[] arr) {

		int count = 1;

		double shellCode = arr.length;

		int temp = 0;

		while (true) {
			shellCode = Math.ceil(shellCode / 2);

			sop("\n\n第" + count + "个增量 ： " + shellCode);

			int code = (int) shellCode;

			for (int i = 0; i < code; i++) {
				for (int j = i + code; j < arr.length; j += code) {
					int k = j - code;
					temp = arr[j];
					for (; k >= 0 && temp < arr[k]; k -= code) {
						arr[k + code] = arr[k];
					}
					arr[k + code] = temp;
				}
			}

			if (code == 1) {
				sop("\n最小增量");
				break;
			}
			sop("\n第" + count + "次排序后： ");
			for (int i = 0; i < arr.length; i++) {
				sop(" " + arr[i]);
			}
			count++;
		}

	}

	public static void sop(Object obj) {
		System.out.print(obj);
	}
}
