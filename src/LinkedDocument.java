import java.util.Objects;

public class LinkedDocument extends Document {
    private final String ID;
    private String speicherArr[];

    public LinkedDocument(String title, String language, String description, Date releaseDate, Author author, String content, String ID) {
        super(title, language, description, releaseDate, author, content);
        this.ID = ID;
        this.setLinkCountZero();
        this.speicherArr = this.findOutgoingIDs(content);

    }

    public String getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedDocument that = (LinkedDocument) o;
        return Objects.equals(ID, that.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    private String[] findOutgoingIDs(String text) {
        String[] arr = new String[substringCount(text, "link:")];
        int j = 0;
        while (text.contains("link:")) {
            String str = "";

            int i = 0;
            for (i = text.indexOf("link:") + 5; i < text.length(); i++) {
                if (text.charAt(i) != ' ') {
                    str += text.charAt(i);
                } else
                    break;
            }

            text = text.substring(i, text.length() - 1);
            arr[j] = str;
            j++;
        }
        return arr;

    }

    private int substringCount(String s, String pattern) {

        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = s.indexOf(pattern,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += pattern.length();
            }
        }
        return count;
        /*int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + pattern.length()).equalsIgnoreCase(pattern)) {
                result++;
                i += pattern.length();
            }
        }
        return result;*/
    }

    private void setLinkCountZero() {
        for (int i = 0; i < this.getWordCounts().size(); i++) {
            if (this.getWordCounts().getWord(i).contains("link:")) {
                this.getWordCounts().setCount(i, 0);
            }
        }
    }


}
