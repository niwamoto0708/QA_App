package jp.techacademy.naoyuki.iwamoto.qa_app;

import java.io.Serializable;

public class Answer implements Serializable {
    private String mBody;
    private String mName;
    private String mUid;
    private String mAnswerUid;

    public Answer(String body, String name, String uid, String answerUid) {
        mBody = body;
        mName = name;
        mUid = uid;
        mAnswerUid = answerUid;
    }

    public String getmBody() {
        return mBody;
    }

    public String getmName() {
        return mName;
    }

    public String getmUid() {
        return mUid;
    }

    public String getmAnswerUid() {
        return mAnswerUid;
    }
}
