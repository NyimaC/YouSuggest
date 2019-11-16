package com.nyima.match;

import java.util.List;
import java.util.Map;

/**
 * @author Chen Panwen
 * @data 2019/11/9 15:46
 */
public interface IMatch {
     /**
      * 返回最终推荐集合
      * @param answers
      * @param clubs
      * @return
      */
     List<String> getSuggestion(List<String> answers, Map<String, String> clubs);

    /**
     * 得到部门详细信息
     * @param clubNames
     * @return
     */
     List<String> getDetails(List<String> clubNames);
 }
