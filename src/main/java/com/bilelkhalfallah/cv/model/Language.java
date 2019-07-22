package com.bilelkhalfallah.cv.model;

import com.bilelkhalfallah.cv.helper.Auditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "LANGUAGE")
@EntityListeners(AuditingEntityListener.class)
public class Language extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "language_name")
    private String languageName;

    @Column(name = "value")
    private String value;

    public Language(Date createdDate, Date lastModifiedDate, long id, String languageName, String value) {
        super(createdDate, lastModifiedDate);
        this.id = id;
        this.languageName = languageName;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Language{" +
                "id=" + id +
                ", languageName='" + languageName + '\'' +
                ", value='" + value + '\'' +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }
}
