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
		int[] arr = { 49, 52, 10, 69, 100, 75, 32, 41, 65, 5, 82, 28, 13, 57, 16 };

		sop("����ǰ�� ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}

		ShellSort(arr);

		sop("\n\n����� ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}
	}

	// ���򷽷�
	public static void ShellSort(int[] arr) {

		// ����һ�������� ������Ҫ��������
		int count = 1;

		// ��ȡ��������ĳ���
		double shellCode = arr.length;

		// ����Ԫ��
		int temp = 0;

		// һֱѭ���� ����Ϊ��С������ʱ��
		while (true) {
			// ��ȡ����
			shellCode = Math.ceil(shellCode / 2);

			sop("\n\n��" + count + "������ �� " + shellCode);

			// ������ǿ��ת������
			int code = (int) shellCode;

			// ��һ��ѭ�� �����ƶ���ʼԪ��
			for (int i = 0; i < code; i++) {
				// �ڲ�Ƕ��ѭ�� ��ֱ�Ӳ������� ע���ǵ�һ��Ԫ�� �� �±����������Ԫ�� ֮��ıȽ�
				// j �����һ��Ԫ��������������Ԫ��
				// j += code ��ÿ��ֱ�Ӳ�������� ��������Ҫֱ�Ӳ�������Ķ���������code������
				for (int j = i + code; j < arr.length; j += code) {
					// k �ǵ�һ��Ԫ��
					int k = j - code;
					// temp ��������������Ԫ��
					temp = arr[j];
					// �����Сǰ�� �򽻻�
					// k -= code ����֮ǰ�Ѿ��źõ�˳�� ��Ԫ����Ƚ� ��ЩԪ����� code ������
					for (; k >= 0 && temp < arr[k]; k -= code) {
						arr[k + code] = arr[k];
					}
					arr[k + code] = temp;
				}
			}

			// ����Ѿ�����С���� ���Ƴ�ѭ��
			if (code == 1) {
				sop("\n�Ѿ�����С�������˳�ѭ��");
				break;
			}
			// ��ӡ�˴ε�������
			sop("\n��" + count + "������� ");
			for (int i = 0; i < arr.length; i++) {
				sop(" " + arr[i]);
			}
			// ����������
			count++;
		}
	}

	public static void sop(Object obj) {
		System.out.print(obj);
	}
}
