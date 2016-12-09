package com.hardikmehta.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author hardikm
 * @since 09/12/16
 * <p>
 * Class description
 */

@Entity
@Table(name = "blogs")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Blog extends AbstractEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "html_text")
    private String htmlText;

    @Column(name = "published_at")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime publishedAt;

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getHtmlText() {

        return htmlText;
    }

    public void setHtmlText(String htmlText) {

        this.htmlText = htmlText;
    }


    public LocalDateTime getPublishedAt() {

        return publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {

        this.publishedAt = publishedAt;
    }
}
