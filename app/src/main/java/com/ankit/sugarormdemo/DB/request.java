package com.ankit.sugarormdemo.DB;

import com.orm.SugarRecord;

public class request extends SugarRecord {
    public request(String testString) {
        this.testString = testString;
    }

    public String getTestString() {

        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    String testString;
}
