package com.autobid.autobid;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "answers")
public class answers {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "comment_id")
    private int comment_id;
    @Column(name = "answer_text")
    private String answer_text;
}
