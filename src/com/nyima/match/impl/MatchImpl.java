package com.nyima.match.impl;

import com.nyima.details.impl.DetailsImpl;
import com.nyima.match.IMatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Chen Panwen
 * @data 2019/11/10 15:46
 */
public class MatchImpl implements IMatch {
	@Override
	public List<String> getSuggestion(List<String> answers, Map<String, String> clubs) {
		//循环取出答案
		int i;
		//保存用户的每个答案
		String answer;
		//最终的推荐集合
		List<String> suggestList = new ArrayList<>();
		final int end = 6;
		for(i=0; i<1; i++) {
			//得到答案集合中的一个答案
			answer = answers.get(i);
			//开始匹配（初步筛选第一步）
			for(String name : clubs.keySet()) {
				//得到部门名称及其对应的匹配答案
				String clubAnswer = clubs.get(name);
				//匹配第一个性格
				if(clubAnswer.charAt(0) == answer.charAt(0)) {
					//第一个匹配，则放入推荐集合中
					suggestList.add(name);
				}
			}
		}

		//细化筛选
		//最终推荐结果集
		List<String> finalList = new ArrayList<>();
		for (String name : suggestList) {
			//根据名字得到对应部门的推荐结果
			String clubAnswer = clubs.get(name);
			answer = answers.get(4);
			String answer1 = answers.get(5);
			if(clubAnswer.charAt(4) == answer.charAt(0) || clubAnswer.charAt(5) == answer1.charAt(0)) {
				finalList.add(name);
			}
		}

		return finalList;
	}

	/**
	 * 得到部门详细信息
	 * @param clubNames
	 * @return
	 */
	@Override
	public List<String> getDetails(List<String> clubNames) {
		//部门详细信息集合
		DetailsImpl details = new DetailsImpl();
		Map<String, String> clubDetails = details.clubDetails();
		//保存推荐集合中部门的详细信息
		List<String> suggestDetails = new ArrayList<>();
		//根据推荐集合匹配部门详细信息
		for(String name : clubNames) {
			//匹配
			for(String detailName:clubDetails.keySet()) {
				if(detailName.equals(name)) {
					//得到详细信息并保存
					suggestDetails.add(clubDetails.get(name));
					break;
				}
			}
		}
		return suggestDetails;
	}
}
