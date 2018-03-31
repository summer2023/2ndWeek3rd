package cn.school.thoughtworks.section3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new LinkedHashMap<String, Integer>();
        List<String> ls = object.get("value");
        for (Map.Entry<String, Integer> entry : collectionA.entrySet()) {
            for (String str:ls) {
                if (entry.getKey().contains(str)){
                    result.put(entry.getKey(),entry.getValue()-1);
                    break;
                }else{
                    result.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return result;
    }
}
