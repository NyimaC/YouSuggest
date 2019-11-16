package com.nyima.test;

import com.nyima.club.Club;
import com.nyima.details.impl.DetailsImpl;
import com.nyima.judge.impl.ExceptionImpl;
import com.nyima.match.impl.MatchImpl;
import com.nyima.personality.Question;
import com.nyima.personality.impl.PersonalityImpl;
import com.sun.javaws.IconUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Chen Panwen
 * @data 2019/11/9 15:47
 */

public class Test {

	/**
	 * 测试能否以正确展示题目
	 */
	@org.junit.Test
	public void showQuestion() {
		Question question = new Question();
		//展示题目
		Map<Integer, String> questions = question.showQuestion();
		Map<Integer, String> options = question.showOption();
		for(int i=1; i<=questions.size(); i++) {
			System.out.println(questions.get(i));
			System.out.println(options.get(i));
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PersonalityImpl personality = new PersonalityImpl();
		List<String> answers = personality.recordAnswer();
		Club club = new Club();
		MatchImpl match = new MatchImpl();
		match.getSuggestion(answers, club.getClub());
	}

	@org.junit.Test
	public void testShowClubAnswer() {
		Club club = new Club();
		Map<String, String> answers = club.getClub();
	}

	/**
	 * 测试部门详细信息的展示
	 */
	@org.junit.Test
	public void showDetails() {
		DetailsImpl details = new DetailsImpl();
		Map<String, String> lists = details.clubDetails();
		for(String list : lists.keySet()) {
			System.out.println(list);
			System.out.println(lists.get(list));
		}
	}

	/**
	 * 得到推荐集合的详细信息
	 */
	@org.junit.Test
	public void showSuggestDetails() {
		List<String> list = new ArrayList<>();
		list.add("计算机协会");
		list.add("瑜伽协会");
		MatchImpl match = new MatchImpl();
		List<String> suggestDetails = match.getDetails(list);
		for (String detail : suggestDetails) {
			System.out.println(detail);
			System.out.println();
		}
	}

	@org.junit.Test
	public void testJudgeLength() {
		//用一段不满足要求的字符串来测试
		String answer = "CBAAAA";
		ExceptionImpl exception = new ExceptionImpl();
		if(exception.judgeCharacter(null)) {
			System.out.println("答案满足要求！");
		} else {
			System.out.println("答案不满足要求！");
		}
	}

	@org.junit.Test
	public void testTranslate() {
		PersonalityImpl personality = new PersonalityImpl();
		List<String> answer = new ArrayList<>();
		answer.add("a");
		answer.add("b");
		System.out.println(personality.translateAnswer(answer));
	}
}
