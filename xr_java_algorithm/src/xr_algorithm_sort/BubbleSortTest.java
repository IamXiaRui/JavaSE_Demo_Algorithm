package xr_algorithm_sort;

/*
 * ð������
 * 
 * �����ڵ������� �������� ����³� С���ϸ�
 * 
 * ֱ��ȫ������
 * 
 * ʱ�临�Ӷ�    O(n^2)
 * 
 * */
public class BubbleSortTest {

	public static void main(String[] args) {
		int[] arr = { 49, 52, 10, 69, 100, 75, 32, 41, 65, 5, 82, 28, 13, 57, 16 };

		sop("����ǰ�� ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}

		BubbleSort(arr);

		sop("\n\n����� ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}
	}

	// ���򷽷�
	public static void BubbleSort(int[] a) {

		int temp = 0;

		// ѭ���Ƚ����ڵ�����Ԫ��
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				// �������ı�ǰ��С �򽻻�λ��
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
