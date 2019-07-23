package com.bilelkhalfallah.cv.model;

import com.bilelkhalfallah.cv.helper.Auditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "LANGUAGE")
@EntityListeners(AuditingEntityListener.class)
public class Language extends Auditable {

    public Language() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "language_name")
    private String languageName;

    @Column(name = "value")
    private String value;

    public Language(Date createdDate, Date lastModifiedDate, Long id, String languageName, String value) {
        super(createdDate, lastModifiedDate);
        this.id = id;
        this.languageName = languageName;
        this.value = value;
    }

    public Language(Date createdDate, Date lastModifiedDate, String languageName, String value) {
        super(createdDate, lastModifiedDate);
        this.languageName = languageName;
        this.value = value;
    }

    public Language(String languageName, String value) {
        this.languageName = languageName;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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