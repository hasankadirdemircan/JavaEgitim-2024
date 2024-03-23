package functional_interface.functional_interface05;

import java.util.List;
//Aynı Mantık  FunctionalInterface05 ile

public class Processor implements NumberListProcessor{
    @Override
    public int process(List<Integer> numbers) {
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
