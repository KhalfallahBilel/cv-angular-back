package com.bilelkhalfallah.cv.model;

import com.bilelkhalfallah.cv.helper.Auditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="CV")
@EntityListeners(AuditingEntityListener.class)
public class Cv extends Auditable<String> {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Cv(Date createdDate, Date lastModifiedDate, long id) {
        super(createdDate, lastModifiedDate);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
