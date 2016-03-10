package xr_algorithm_sort;

/*
 * ϣ������
 * 
 * �㷨�Ƚ�Ҫ�����һ������ĳ������d��n/2,nΪҪ�������ĸ������ֳ������飬
 * ÿ���м�¼���±����d.��ÿ����ȫ��Ԫ�ؽ���ֱ�Ӳ�������
 * Ȼ������һ����С��������d/2���������з��飬��ÿ�����ٽ���ֱ�Ӳ�������
 * ����������1ʱ������ֱ�Ӳ��������������ɡ�
 * ʱ�临�Ӷȣ����ȶ���ƽ��ʱ�� O(nlogn) �����ʱ��O(n^s)  1<s<2
 * 
 * */
public class ShellSortTest {

	public static void main(String[] args) {
		int[] a = { 49, 52, 10, 69, 100, 75, 32, 41, 65, 5, 82, 28, 13, 57, 16 };

		sop("����ǰ�� ");
		for (int i = 0; i < a.length; i++) {
			sop(" " + a[i]);
		}

		ShellSort(a);

		sop("\n\n����� ");
		for (int i = 0; i < a.length; i++) {
			sop(" " + a[i]);
		}
	}

	// ���򷽷�
	public static void ShellSort(int[] arr) {

		int count = 1;

		double shellCode = arr.length;

		int temp = 0;

		while (true) {
			shellCode = Math.ceil(shellCode / 2);

			sop("\n\n��" + count + "������ �� " + shellCode);

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
				sop("\n��С����");
				break;
			}
			sop("\n��" + count + "������� ");
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
