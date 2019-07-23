package com.bilelkhalfallah.cv.model;

import com.bilelkhalfallah.cv.helper.Auditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="CV")
@EntityListeners(AuditingEntityListener.class)
public class Cv extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Cv(Date createdDate, Date lastModifiedDate, Long id) {
        super(createdDate, lastModifiedDate);
        this.id = id;
    }

    public Cv( Long id) {
        this.id = id;
    }

    public Cv() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cv{" +
                "id=" + id +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }
}
