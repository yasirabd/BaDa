package com.siapataumenang.bada.data;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by ikhsangama on 26/05/2016.
 */
public class UserTable extends SugarRecord {
    String username;
    String password;
    String id_language;
    String last_level;
    String point;

    public UserTable(){
    }

    public UserTable(String id_language, String username, String password, String last_level, String point){
        this.username = username;
        this.password = password;
        this.id_language = id_language;
        this.last_level = last_level;
        this.point = point;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getIdLanguage() {
        return id_language;
    }
    public String getLastLevel() {
        return last_level;
    }
    public String getPoint() {
        return point;
    }

    /* Relationship */

    // Get all answers of this question
    /*List<LanguageTable> getLanguages() {
        return LanguageTable.find(LanguageTable.class, "userTable = ?", new String{getId()})
    }*/
}
