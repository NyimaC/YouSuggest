package com.nyima.main;

import com.nyima.club.Club;
import com.nyima.judge.impl.ExceptionImpl;
import com.nyima.match.impl.MatchImpl;
import com.nyima.personality.impl.PersonalityImpl;


import java.util.List;

/**
 * @author Chen Panwen
 * @data 2019/11/9 15:47
 */
public class Main {
	public static void main(String[] args) {
		//生成题目
		PersonalityImpl personality = new PersonalityImpl();
		//得到结果集
		List<String> answerList = personality.recordAnswer();
		//判断结果
		ExceptionImpl exception = new ExceptionImpl();
		if(exception.judgeLength(answerList)) {
			System.out.println("测试答案长度有误，请重新测试！");
			return;
		}
		if(!exception.judgeCharacter(answerList)) {
			System.out.println("答案有误，请重新测试！");
			return;
		}
		//得到所有部门
		Club club = new Club();
		//匹配部门及其详细信息
		MatchImpl match = new MatchImpl();
		//推荐集合
		List<String> suggestList = match.getSuggestion(answerList, club.getClub());
		//详细信息
		List<String> detailList = match.getDetails(suggestList);

		//显示推荐结果
		int i=0;
		System.out.println("给您的部门推荐结果为：");
		for (String clubName : suggestList) {
			System.out.println("部门名："+clubName);
			System.out.println("详细信息：");
			System.out.println(detailList.get(i));
			i++;
			System.out.println();
		}
	}
}
