package com.hardikmehta.business.common.entity;

import com.hardikmehta.business.common.adapter.LocalDateTimeAdapter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author hardikm
 * @since 06/12/16
 * <p>
 * Class description
 */

@MappedSuperclass
public class AbstractEntity implements Serializable {

    private static final long serialVersionUID = 4812107759490812781L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime updatedAt;


    @PreUpdate
    public void beforeUpdate() {

        this.updatedAt = LocalDateTime.now();
    }

    @PrePersist
    public void beforePersist() {

        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }


    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public LocalDateTime getCreatedAt() {

        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {

        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {

        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {

        this.updatedAt = updatedAt;
    }
}
