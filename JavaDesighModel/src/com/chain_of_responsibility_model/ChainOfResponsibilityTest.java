package com.chain_of_responsibility_model;

/**
 * ������ģʽ��ʹ��������л��ᴦ�����󣬴Ӷ���������ķ����ߺͽ�����֮���
 * ��Ϲ�ϵ���������������һ���������������������ݸ�����ֱ����һ����������Ϊֹ
 * @author Administrator
 *
 */
public class ChainOfResponsibilityTest {

	public static void main(String[] args) {
		CommonManager commonManager = new CommonManager("����");
		MajorDomo majorDomo = new MajorDomo("�ܼ�");
		GeneralManager generalManager = new GeneralManager("�ܾ���");
		commonManager.setSuperior(majorDomo);
		majorDomo.setSuperior(generalManager);
		
		
		
		Request request = new Request();
		request.setRequestType("���");
		request.setRequestContent("xxx���");
		request.setNum(4);
		commonManager.requestApplications(request);
		request.setRequestType("��н");
		request.setRequestContent("xxx��н");
		request.setNum(5000);
		commonManager.requestApplications(request);
	}	

}
