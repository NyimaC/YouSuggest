package com.nyima.personality.impl;

import com.nyima.personality.IPersonality;
import com.nyima.personality.Question;
import sun.misc.Cleaner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Chen Panwen
 * @data 2019/11/9 15:44
 */
public class PersonalityImpl implements IPersonality {
	/**
	 * 根据题目回答问题，最终返回答案
	 * @return
	 */
	@Override
	public List<String> recordAnswer() {
		//获得问题对象
		Question question = new Question();
		//回答集合
		List<String> answers = new ArrayList<>();
		String answer="";
		//输入
		Scanner scanner = new Scanner(System.in);
		//测试题和选项
		Map<Integer, String> questions = question.showQuestion();
		Map<Integer, String> options = question.showOption();
		for(int i=1; i<=questions.size(); i++) {
			System.out.println(questions.get(i));
			System.out.println(options.get(i));
			System.out.print("您的选择是：");
			answer = scanner.nextLine();
			answers.add(answer);
		}
		//小写转换为大写并返回
		return translateAnswer(answers);
	}

	/**
	 * 将小写答案转化为大写
	 * @param answer
	 * @return
	 */
	public List<String> translateAnswer(List<String> answer) {
		List<String> newAnswer = new ArrayList<>();
		for (int i = 0; i < answer.size(); i++) {
			String oneAnswer = answer.get(i);
			char oneCharacter = oneAnswer.charAt(0);
			if ('a' <= oneCharacter && oneCharacter<= 'z'){
				oneCharacter -= 32;
				newAnswer.add(String.valueOf(oneCharacter));
			}
		}
		return newAnswer;
	}
}
