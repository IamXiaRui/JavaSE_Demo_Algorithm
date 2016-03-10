package xr_algorithm_sort;

/*
 * ֱ�Ӳ�������
 * 
 * ÿ�δ��������ȡ����һ��Ԫ�أ��������뵽������ĺ���λ�ã�ʹ�������Ȼ����
 * ��һ�˱Ƚ�ǰ��������Ȼ��ѵڶ���������С���뵽������У� 
 * �ڶ��˰ѵ�����������ǰ�������Ӻ���ǰɨ�裬�ѵ�����������С���뵽������У�
 * ���ν�����ȥ��������(n-1)��ɨ���Ժ�����������������̡�
 * 
 * ֱ�Ӳ������������ȶ��������ʱ�临����ΪO(n^2)���ռ临�Ӷ�ΪO(1)��
 * 
 * */
public class InsertSortTest {

	public static void main(String[] args) {
		int[] arr = { 49, 52, 10, 69, 100, 75, 32, 41, 65, 5, 82, 28, 13, 57, 16 };

		sop("����ǰ�� ");
		for (int i = 0; i < arr.length; i++) {
			sop(" " + arr[i]);
		}

		// ��ʼ��һ����־Ԫ��
		int temp = 0;

		// �ӱ��еڶ���Ԫ�ؿ�ʼ
		for (int i = 1; i < arr.length; i++) {
			// ����ӵڶ���Ԫ�ؿ�ʼ ��ΪĬ�ϵ�һ��Ԫ���Ѿ��������
			temp = arr[i];
			// j�ǵ�ǰԪ�ص�ǰһ��Ԫ�� ��Ϊÿ��ֻ��Ҫ��ǰһ����ʼ����ɨ�� ֮ǰ���Ѿ��������
			int j = i - 1; // �ӵ�ǰԪ�ص�ǰһ��Ԫ�ؿ�ʼ ��������Ƚ�
			for (; j >= 0 && temp < arr[j]; j--) {
				// �������ı�ǰ��С ���û�λ�� //
				// ����ѭ���൱�ڰѴ���temp������Ԫ������������һ����λ ����ǰԪ�ز���һ��
				arr[j + 1] = arr[j];
			}
			// ��������� ����Ԫ�ر�ǰ��� ���汣��λ�ò��� ��ѭ���Һ����Ԫ��
			arr[j + 1] = temp;
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