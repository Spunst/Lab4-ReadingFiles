import java.util.ArrayList;

public class Paragraph {
    private ArrayList<String> words;
    private ArrayList<String> lines;

    public Paragraph() {
        words = new ArrayList<>();
        lines = new ArrayList<>();
    }

    public void addWords(String line) {
        lines.add(line);

        String[] splitWords = line.split("\\s+");

        for (String word : splitWords) {
            words.add(word);
        }
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void printParagraph() {
        for (int i = 0; i < lines.size(); i++) {
            if (i == 0) {
                System.out.print("    ");
            }

            System.out.println(lines.get(i));
        }
    }
}