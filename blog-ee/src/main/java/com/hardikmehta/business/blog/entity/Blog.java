package com.hardikmehta.business.blog.entity;

import com.hardikmehta.business.common.adapter.LocalDateTimeAdapter;
import com.hardikmehta.business.common.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

/**
 * @author hardikm
 * @since 06/12/16
 * <p>
 * Class description
 */

@Entity
@Table(name = "blogs")
@NamedQueries({@NamedQuery(name = Blog.QUERY_ALL, query = "SELECT b from Blog b")})
public class Blog extends AbstractEntity {

    private static final long serialVersionUID = -2168513288177254144L;

    public static final String QUERY_ALL = "Blog.all";

    @Column(name = "title")
    private String title;

    @Column(name = "html_text")
    private String htmlText;

    @Column(name = "published_at")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
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

    @Override
    public String toString() {

        return "Blog{" +
                "title='" + title + '\'' +
                ", htmlText='" + htmlText + '\'' +
                ", publishedAt=" + publishedAt +
                '}';
    }
}
