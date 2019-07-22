package com.bilelkhalfallah.cv.model;

import com.bilelkhalfallah.cv.helper.Auditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Skill")
@EntityListeners(AuditingEntityListener.class)
public class Skill extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "skill")
    private String skill;

    @Column(name = "skill_name")
    private String skillName;

    @Column(name = "value")
    private int value;

    public Skill(Date createdDate, Date lastModifiedDate, long id, String skill, String skillName, int value) {
        super(createdDate, lastModifiedDate);
        this.id = id;
        this.skill = skill;
        this.skillName = skillName;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", skill='" + skill + '\'' +
                ", skillName='" + skillName + '\'' +
                ", value=" + value +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }
}
