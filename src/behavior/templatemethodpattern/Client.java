package behavior.templatemethodpattern;

import behavior.templatemethodpattern.processor.MultiplyFileProcessor;
import behavior.templatemethodpattern.processor.SumFileProcessor;

public class Client {
    public static void main(String[] args) {
        SumFileProcessor sumFileProcessor = new SumFileProcessor("src/behavior/templatemethodpattern/numbers.txt");
        int sumResult = sumFileProcessor.process();
        System.out.println(sumResult);

        MultiplyFileProcessor multiplyFileProcessor = new MultiplyFileProcessor("src/behavior/templatemethodpattern/numbers.txt");
        int multiplyResult = multiplyFileProcessor.process();
        System.out.println(multiplyResult);
    }
}
