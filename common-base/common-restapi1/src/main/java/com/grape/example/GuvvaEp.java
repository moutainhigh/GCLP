package com.grape.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;


public class GuvvaEp {

	@SuppressWarnings("unused")
	public void ep() {
		List<String> list = new ArrayList<>();  // jdk 7  推荐
		List<String> list2 = Lists.newArrayList("a", "b", "c");    // guvva mode
		list2 = ImmutableList.of("a", "b", "c");    					// guvva mode  不可修改的列表
		String lastlist2 = Iterables.getLast(list2);  // 获取最后一个元素
		
		
		String[] strArr = {"a","b"};
		Set<String> set = Sets.newHashSet(strArr);	// guvva mode
		set = ImmutableSet.of("a", "b", "c");    			// guvva mode  不可修改的集合
		String lastlist2set = Iterables.getLast(set);  // 获取最后一个元素
		
		Map<String, String> map = new HashMap<>();  // jdk 7  推荐
		Map<String, String> left = ImmutableMap.of("a", "1", "b", "2", "c", "3","d","4");
		Map<String, String> right = ImmutableMap.of("a", "4", "b", "2", "c", "6","e","8");
		MapDifference<String, String> diff = Maps.difference(left, right);
		diff.entriesInCommon(); // {b=2}
		diff.entriesDiffering(); // {a=(1, 4), c=(3, 6)}
		diff.entriesOnlyOnLeft(); // {d=4}
		diff.entriesOnlyOnRight(); // {e=8}
	}
}
