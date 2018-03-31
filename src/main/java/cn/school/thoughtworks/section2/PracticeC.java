package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new LinkedHashMap<String, Integer>();
        for (String str:collection1) {
            if (str.length() > 1) {
                int count=0;
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < str.length();i++) {
                    char c = str.charAt(i);
                    if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                        sb.append(str.charAt(i));
                    }
                }
                count = Integer.valueOf(sb.toString());
                int num=count;
                result.compute(str.substring(0, 1), (k, v) -> v == null ? num : v + num);
            }else {
                result.compute(str, (k, v) -> v == null ? 1 : v + 1);
            }
        }
        return result;
    }
}
