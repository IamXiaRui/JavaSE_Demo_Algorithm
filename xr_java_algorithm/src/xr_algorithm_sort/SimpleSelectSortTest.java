package xr_algorithm_sort;

/*
 * ��ѡ������
 * 
 * ��ȫ���ļ�����  �ҵ���С��Ԫ�ظ���һ��Ԫ�ؽ�����
 * Ȼ��ӵڶ���Ԫ�ؿ�ʼ�ҵ���С��Ԫ�ظ��ڶ���Ԫ�ؽ���
 * ֱ�������ڶ���Ԫ�������һ��Ԫ�ؽ���
 * 
 * ʱ�临�Ӷ�   O(n^2)
 * 
 * */
public class SimpleSelectSortTest {

	public static void main(String[] args) {
		int[] arr = { 49, 52, 10, 69, 100, 75, 32, 41, 65, 5, 82, 28, 13, 57, 16 };

		sop("����ǰ�� ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}

		SimpleSelectSort(arr);

		sop("\n\n����� ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}
	}

	// ���򷽷�
	public static void SimpleSelectSort(int[] a) {

		// ���彻��Ԫ��
		int temp = 0;

		// �����ѭ�������ƶ�������λ��
		for (int i = 0; i < a.length; i++) {
			temp = i;
			// flag��ÿ��ѭ���ĵ�һ��Ԫ��
			int flag = a[i];
			// j �� ��һ��Ԫ��֮���Ԫ�ؿ�ʼ
			for (int j = i + 1; j < a.length; j++) {
				// ��������Ԫ��С�� ��һ��Ԫ�� �򽻻�
				if (a[j] < flag) {
					// ��СԪ�ظ���flag
					flag = a[j];
					// ��ס���һ����СԪ�ص��±�
					temp = j;
				}
			}
			// ��һ��Ԫ�� �� ���һ����СԪ�� ����
			a[temp] = a[i];
			// ��һ��Ԫ��Ϊ��СԪ��
			a[i] = flag;
		}
	}

	public static void sop(Object obj) {
		System.out.print(obj);
	}

}
