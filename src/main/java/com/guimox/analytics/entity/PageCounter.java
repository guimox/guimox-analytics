package com.guimox.analytics.entity;

import jakarta.persistence.*;

@Entity
@Table(
        name = "page_counters",
        uniqueConstraints = @UniqueConstraint(columnNames = {"service", "page"})
)
public class PageCounter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String service;

    @Column(nullable = false)
    private String page;

    @Column(nullable = false)
    private long hits = 0;

    @Column(nullable = false)
    private long thumbsUp = 0;

    public PageCounter() {}

    public PageCounter(String service, String page) {
        this.service = service;
        this.page = page;
    }

    public Long getId() { return id; }
    public String getService() { return service; }
    public void setService(String service) { this.service = service; }
    public String getPage() { return page; }
    public void setPage(String page) { this.page = page; }
    public long getHits() { return hits; }
    public void setHits(long hits) { this.hits = hits; }
    public long getThumbsUp() { return thumbsUp; }
    public void setThumbsUp(long thumbsUp) { this.thumbsUp = thumbsUp; }
}
