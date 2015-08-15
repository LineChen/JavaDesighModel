package com.prototype_model;

/**
 * ԭ��ģʽ����ԭ��ʵ��ָ��������������࣬��ͨ��������Щԭ�ʹ����µĶ���
 * ע��ǳ���ƺ���Ƶ�����:
 * ǳ���ƣ������Ƶ����б�����������ԭ��������ͬ��ֵ�������еĶ�������������ö���Ȼָ��ԭ���Ķ���
 * ��ƣ������ö���ı���ָ���ƹ����¶��󣬶�����ԭ�еı����õĶ���.
 *
 */
public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume = new Resume("����");
		resume.setPersonInfo("��", "22");
		resume.setWorkExperience("2015.8.3-2015.12.11", "ǧ��");
		
		Resume resume2 = (Resume) resume.clone();
		resume2.setPersonInfo("male", "19");
		resume2.setWorkExperience("2015.10.1-1.15.12.22", "�ٶ�");
		
		resume.display();
		resume2.display();
				
	}

}
