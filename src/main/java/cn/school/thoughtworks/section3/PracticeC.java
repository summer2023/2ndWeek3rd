package cn.school.thoughtworks.section3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String, Integer> collectionC = new LinkedHashMap<String, Integer>();
        for (String str:collectionA) {
            if (str.length() > 1) {
                int num = str.charAt(str.length() - 1)-48;
                collectionC.compute(str.substring(0, 1), (k, v) -> v == null ? num : v + num);
            } else {
                collectionC.compute(str, (k, v) -> v == null ? 1 : v + 1);
            }
        }

        Map<String, Integer> result = new LinkedHashMap<String, Integer>();
        List<String> ls = object.get("value");
        for (Map.Entry<String, Integer> entry : collectionC.entrySet()) {
            for (String str:ls) {
                int num=entry.getValue();
                if (entry.getKey().contains(str)){
                    result.put(entry.getKey(),num-num/3);
                    break;
                }else{
                    result.put(entry.getKey(), entry.getValue());
                }
            }
        }


        return result;
    }
}
