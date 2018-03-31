package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<String>();
        List<List<String>>  valls = new ArrayList<List<String>>(collection2.values());
        for (String str:collection1) {
            for (int i = 0; i < valls.size(); i++) {
                if (valls.get(i).contains(str)) {
                    result.add(str);
                }

            }

        }
        return null;
    }
}
