package com.nyima.judge.impl;

import com.nyima.judge.IException;

import java.util.List;

/**
 * @author Chen Panwen
 * @data 2019/11/16 11:46
 */
public class ExceptionImpl implements IException {
	@Override
	public boolean judgeLength(List<String> answer) {
		//共六道题，所以答案长度必须为6
		if(answer.size() != 6) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean judgeCharacter(List<String> answer) {
		//第一题和第五题只有两个选项，其他的都有四个选项
		int i;
		for(i=0; i<6; i++) {
			//第一题和第五题的判断
			if(i==0 || i ==4) {
				if(!answer.get(i).equals("A") && !answer.get(i).equals("B")) {
					return false;
				}
			} else {
				if(!answer.get(i).equals("A") && !answer.get(i).equals("A") && !answer.get(i).equals("C") && !answer.get(i).equals("D")) {
					return false;
				}
			}
		}
		//判断完成
		return true;
	}
}
