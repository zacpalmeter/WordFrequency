import java.util.Map;

public class WordFrequencyApp {

    public static void main(String[] args) {
        try {
            // Could improve input method but before doing this I would want much more detailed requirements.
            // ex: should the text come from a file, a http get request, a console input on loop with a command to exit
            if (args.length > 0){
                String text = args[0];
                Map<String, Integer> sortedFrequency = WordFrequencyCalculator.getSortedWordFrequency(text);
                WordFrequencyCalculator.printWordFrequencies(sortedFrequency);
            }
        } catch (Exception e) {
            System.out.println("An error occurred when calculating word frequency");
            System.out.println(e.getMessage());
        }
    }
}
