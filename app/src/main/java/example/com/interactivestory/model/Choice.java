package example.com.interactivestory.model;

/**
 * Created by LeBoss on 7/30/2015.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(){};

    public Choice(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
