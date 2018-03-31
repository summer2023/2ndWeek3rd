package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<String>();
        for (String str:collection1
             ) {
            for (int i = 0; i < collection2.size(); i++) {
                if (collection2.get(i).contains(str)) {
                    result.add(str);
                }
            }
        }

        return null;
    }
}
