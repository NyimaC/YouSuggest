package com.nyima.personality;

import java.util.List;

/**
 * @author Chen Panwen
 * @data 2019/11/9 15:44
 */
public interface IPersonality {
	/**
	 * 获取测试题目答案，返回结果集
	 * @return
	 */
	List<String> recordAnswer();
}
