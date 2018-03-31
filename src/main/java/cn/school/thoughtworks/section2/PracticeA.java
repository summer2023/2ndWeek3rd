package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new LinkedHashMap<String, Integer>();
        for (String str:collection1) {
           result.compute(str, (k, v) -> v == null ? 1 : v + 1);
        }
        return result;
    }
}
