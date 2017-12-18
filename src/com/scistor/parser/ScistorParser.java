package com.scistor.parser;

import com.scistor.parser.exception.ScistorParserException;
import com.scistor.parser.result.ScistorResult;

/**
 * �����ӿ�
 * @author GuoLiang
 */
public interface ScistorParser {
	
	/**
	 * ��ý������
	 * @return ScistorResult
	 * @throws ScistorParserException
	 */
	public ScistorResult getParseResult() throws ScistorParserException;
	
}
