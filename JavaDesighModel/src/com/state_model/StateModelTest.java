package com.state_model;

/**
 * ״̬ģʽ����һ�����������״̬�ı�ʱ����ı�����Ϊ��������������Ǹı�������
 *
 * ״̬ģʽ�������Ҫ�����ǣ�������һ������״̬ת�����������ʽ���ڸ��ӵ����.
 *  ��״̬���ж��߼�ת�Ƶ���ʾ��ͬ״̬��һϵ������,���԰Ѹ��ӵ��߼��жϼ�.
 */
public class StateModelTest {

	public static void main(String[] args) {
		Work work = new Work();
		work.setHour(11);
		work.writeProgram();
		
		work.setHour(2);
		work.setFinish(false);
		work.writeProgram();
		
		
	}

}
