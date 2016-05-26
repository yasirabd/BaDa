package com.siapataumenang.bada.data;

import com.orm.SugarRecord;


import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by ikhsangama on 26/05/2016.
 */
public class QuestionTableJawa extends SugarRecord {
    String question_level;
    String question;
    String answer_key;
    String file_name;   // jika soal menggunakan data gambar atau audio

    public QuestionTableJawa(){
    }

    public QuestionTableJawa(String question_level, String question, String answer_key, String file_name){
        this.question_level = question_level;
        this.question = question;
        this.answer_key = answer_key;
        this.file_name = file_name;
    }

    public String getQuestionLevel() {
        return question_level;
    }
    public String getQuestion() {
        return question;
    }
    public String getAnswerKey() {
        return answer_key;
    }
    public String getFileName() {
        return file_name;
    }

    /* Relationship */

    // Get all answers of this question
   /* List<AvailableAnswerTableJawa> getAnswers() {
        return AvailableAnswerTableJawa.find(AvailableAnswerTableJawa.class, "questionTableJawa = ?", new String{getId()})
    }*/
}