package com.example.yu_enpit.myscheduler;
//再提出用にコメントを追加
import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by enPiT-P11 on 2017/08/21.
 */

public class Schedule extends RealmObject {
    @PrimaryKey
    private long id;
    private Date date;
    private String title;
    private String detail;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
