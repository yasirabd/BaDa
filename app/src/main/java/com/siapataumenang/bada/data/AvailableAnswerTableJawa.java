package com.siapataumenang.bada.data;

import com.orm.SugarRecord;

/**
 * Created by ikhsangama on 26/05/2016.
 */
public class AvailableAnswerTableJawa extends SugarRecord {
    String id_question;
    String available_answer;

    public AvailableAnswerTableJawa(){
    }

    public AvailableAnswerTableJawa(String id_question, String available_answer){
        this.id_question = id_question;
        this.available_answer = available_answer;
    }

    public String getIdQuestion() {
        return id_question;
    }
    public String getAvailableAnswer() {
        return available_answer;
    }

    // defining a relationship
//    QuestionTableJawa questionTableJawa;
}
