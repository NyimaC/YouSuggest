package com.nyima.judge;

import java.util.List;

/**
 * @author Chen Panwen
 * @data 2019/11/16 11:46
 */
public interface IException {
	/**
	 * 判断测试结果长度是否满足要求
	 * @param answer
	 * @return
	 */
	boolean judgeLength(List<String> answer);

	/**
	 * 判断答案是否满足要求
	 * @param answer
	 * @return
	 */
	boolean judgeCharacter(List<String> answer);
}
