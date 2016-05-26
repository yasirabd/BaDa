package com.siapataumenang.bada.data;

import com.orm.SugarRecord;

/**
 * Created by ikhsangama on 26/05/2016.
 */
public class LanguageTable extends SugarRecord {
    String language;

    public LanguageTable() {

    }

    public LanguageTable(String language){
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

//    UserTable userTable;
}
