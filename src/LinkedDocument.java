public class LinkedDocument extends Document {
    private final String ID;
    private String speicherArr [];

    public LinkedDocument(String title, String language, String description, Date releaseDate, Author author, String content,String ID)
    {
        super(title,language,description,releaseDate,author,content);
        this.ID = ID;
        this.setLinkCountZero();
        this.speicherArr = this.findOutgoingIDs(content);

    }

    public String getID() {
        return ID;
    }

    @Override
    public boolean equals(Document doc)
    {
        if (doc instanceof LinkedDocument) {
            if(this.ID == ((LinkedDocument) doc).ID)
                return true;
            else
                return false;

        }

        else
          return super.equals(doc);
    }

    private String[] findOutgoingIDs(String text)
    {
        String [] arr = new String[substringCount(text,"link:")];
        int j =0;
        while (text.contains("link:")) {
            String str = "";

            int i = 0;
            for (i = text.indexOf("link:") + 5; i < text.length(); i++)
            {
                if (text.charAt(i) != ' ') {
                    str += text.charAt(i);
                } else
                    break;
            }

            text = text.substring(i,text.length()-1);
            arr[j] = str;
            j++;
        }
        return arr;

    }
    private int substringCount(String s, String pattern) {

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + pattern.length()).equalsIgnoreCase(pattern)) {
                result++;
                i += pattern.length();
            }
        }
        return result;
    }
    private void setLinkCountZero()
    {
        for (int i = 0; i < this.getWordCounts().size(); i++)
        {
            if (this.getWordCounts().getWord(i).contains("link:"))
            {
                this.getWordCounts().setCount(i,0);
            }
        }
    }




}
