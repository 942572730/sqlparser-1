package com.scistor.parser.authentication;

import com.scistor.parser.result.ScistorResult;

/**
 * Ȩ����֤�ͼӽ�����չ�ӿ�
 * @author GuoLiang
 */
public interface ScistorAuthenticate {
	
	/**
	 * Ȩ����֤�ͼӽ��ܵĽӿ�
	 * Ҳ���Բ�ʵ�ִ˽ӿڣ�ʵ�ַ������ǽ������ȡ����������ٸ��ݽ����Ȩ��
	 * @return
	 */
	public int auth(ScistorResult result);
	
}
