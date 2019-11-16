package com.nyima.personality;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chen Panwen
 * @data 2019/11/9 15:48
 */
public class Question {
	public Map<Integer, String> showQuestion() {
		//题目集
		Map<Integer, String> questions = new HashMap<>(6);
		questions.put(1, "你的性格是怎样的?");
		questions.put(2, "你具有一下哪种能力？");
		questions.put(3, "你的兴趣是？");
		questions.put(4, "你想提高哪种能力？");
		questions.put(5, "以下哪个词更符合你？");
		questions.put(6, "以下哪个词更符合你");
		return questions;
	}
	public Map<Integer, String> showOption() {
		 Map<Integer, String> options = new HashMap<>(10);
		 options.put(1, "A.内向  B.外向");
		 options.put(2, "A.动手能力  B.适应能力  C.表达能力  D.交流能力");
		 options.put(3, "A.音乐  B.阅读  C.影视  D.运动");
		 options.put(4, "A.自控能力  B.沟通能力  C.抗压能力  D.学习能力");
		 options.put(5, "A.独立  B.顺从");
		 options.put(6, "A.自强  B.认真  C.热情  D.稳重");
		 return options;
	}
}
