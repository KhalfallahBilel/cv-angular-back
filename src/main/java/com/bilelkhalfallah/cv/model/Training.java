package com.bilelkhalfallah.cv.model;

import com.bilelkhalfallah.cv.helper.Auditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TRAINING")
@EntityListeners(AuditingEntityListener.class)
public class Training extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "date")
    private String date;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "diploma")
    private String diploma;

    @Column(name = "description")
    private String description;

    public Training(Date createdDate, Date lastModifiedDate, long id, String date, String schoolName, String diploma, String description) {
        super(createdDate, lastModifiedDate);
        this.id = id;
        this.date = date;
        this.schoolName = schoolName;
        this.diploma = diploma;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", diploma='" + diploma + '\'' +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }
}
