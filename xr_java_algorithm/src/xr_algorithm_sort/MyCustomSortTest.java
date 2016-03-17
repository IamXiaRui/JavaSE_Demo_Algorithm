package xr_algorithm_sort;

/*
 * �Լ�д������  �������Ӧ������ð�������һ��
 * 
 * ˫��ѭ��    ʱ�临����ΪO(n^2)
 * 
 * */
public class MyCustomSortTest {

	public static void main(String[] args) {
		int[] arr = { 49, 52, 10, 69, 100, 75, 32, 41, 65, 5, 82, 28, 13, 57, 16 };

		sop("����ǰ�� ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}

		// ����һ������Ԫ�صĵ�����
		int temp = 0;
		// �ӵڶ���Ԫ�ؿ�ʼ
		for (int i = 1; i < arr.length; i++) {
			// ��ǰ��һ��Ԫ�رȽ�
			for (int j = i - 1; j >= 0; j--) {
				// ��������С ��ô����
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					// �������� ע�� ��Сi��ֵ �൱�� a[j]��ǰһ����ǰǰһ����Ԫ�� a[i]����ǰһ����Ԫ��
					i--;
				}
			}
		}

		sop("\n����� ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}
	}

	public static void sop(Object obj) {
		System.out.print(obj);
	}

}
