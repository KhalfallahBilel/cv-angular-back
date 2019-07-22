package com.bilelkhalfallah.cv.model;

import com.bilelkhalfallah.cv.helper.Auditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "EXPERIENCE")
@EntityListeners(AuditingEntityListener.class)
public class Experience extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "date")
    private String date;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "poste")
    private String poste;

    @Column(name = "description")
    private String description;

    @Column(name = "technos")
    private String technos;

    public Experience(Date createdDate, Date lastModifiedDate, long id, String date, String companyName, String poste, String description, String technos) {
        super(createdDate, lastModifiedDate);
        this.id = id;
        this.date = date;
        this.companyName = companyName;
        this.poste = poste;
        this.description = description;
        this.technos = technos;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnos() {
        return technos;
    }

    public void setTechnos(String technos) {
        this.technos = technos;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", companyName='" + companyName + '\'' +
                ", poste='" + poste + '\'' +
                ", description='" + description + '\'' +
                ", technos='" + technos + '\'' +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }
}
