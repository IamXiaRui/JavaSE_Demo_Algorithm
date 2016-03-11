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
		int[] arr = { 49, 52, 10, 69, 100, 75, 32, 41, 65, 5, 82, 28, 13, 57, 16 };

		sop("排序前： ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}

		ShellSort(arr);

		sop("\n\n排序后： ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}
	}

	// 排序方法
	public static void ShellSort(int[] arr) {

		// 定义一个计数器 计算需要几次排序
		int count = 1;

		// 获取排序数组的长度
		double shellCode = arr.length;

		// 交换元素
		int temp = 0;

		// 一直循环到 增量为最小增量的时候
		while (true) {
			// 获取增量
			shellCode = Math.ceil(shellCode / 2);

			sop("\n\n第" + count + "个增量 ： " + shellCode);

			// 将增量强制转换类型
			int code = (int) shellCode;

			// 第一个循环 用来移动开始元素
			for (int i = 0; i < code; i++) {
				// 内部嵌套循环 是直接插入排序 注意是第一个元素 和 下标相隔增量的元素 之间的比较
				// j 是与第一个元素相隔增量距离的元素
				// j += code 是每次直接插入排序后 将整个需要直接插入排序的对象往后移code个距离
				for (int j = i + code; j < arr.length; j += code) {
					// k 是第一个元素
					int k = j - code;
					// temp 是相隔增量距离的元素
					temp = arr[j];
					// 如果后小前大 则交换
					// k -= code 是与之前已经排好的顺序 的元素相比较 这些元素相差 code 个距离
					for (; k >= 0 && temp < arr[k]; k -= code) {
						arr[k + code] = arr[k];
					}
					arr[k + code] = temp;
				}
			}

			// 如果已经是最小增量 则推出循环
			if (code == 1) {
				sop("\n已经是最小增量，退出循环");
				break;
			}
			// 打印此次的排序结果
			sop("\n第" + count + "次排序后： ");
			for (int i = 0; i < arr.length; i++) {
				sop(" " + arr[i]);
			}
			// 计数器自增
			count++;
		}
	}

	public static void sop(Object obj) {
		System.out.print(obj);
	}
}
