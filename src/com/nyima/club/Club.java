package com.nyima.club;

import com.sun.javaws.IconUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Chen Panwen
 * @data 2019/11/9 17:17
 */
public class Club {
	public Map<String, String> getClub() {
		Map<String, String> clubCharacters = new HashMap<>(8);
		clubCharacters.put("计算机协会", "ABAAAB");
		clubCharacters.put("宾谦魔术协会", "BCBBAD");
		clubCharacters.put("瑜伽协会", "AAAABA");
		clubCharacters.put("材料协会", "BBCBBB");
		clubCharacters.put("乒乓球协会", "BADAAA");
		clubCharacters.put("现视研动漫社", "ACCBAC");
		clubCharacters.put("外语村协会", "BDADBC");
		clubCharacters.put("棋牌协会", "ABBABD");

		//返回协会名极其所具有的性格特性集合
		return clubCharacters;
	}
}
