package org.game.db.domain;
 
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
public class Answer implements Serializable {
    private static final long serialVersionUID = 1L;
 
    @Id @GeneratedValue
    Long answerId;
    private String value;
    private Long isCorrect;
 
    public Answer() {
    }
 
    public Answer(String value, Long isCorrect) {
        this.value = value;
        this.isCorrect = isCorrect;
    }
 
}