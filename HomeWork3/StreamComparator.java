package HomeWork3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Flow>{
    @Override
    public int compare(Flow flow1, Flow flow2) {
        int numGroups1 = flow1.getGroups().size();
        int numGroups2 = flow2.getGroups().size();

        // Сравниваем количество групп в потоках
        return Integer.compare(numGroups1, numGroups2);
    }
}
