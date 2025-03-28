package com.menegasso.projetobackendsenior.application.dto.person;

import java.time.LocalDateTime;

/**
 * Represents a PersonPhoto Data Transfer Object.
 * This class is part of the application layer and is used to transfer
 * PersonPhoto data between the domain model and external layers, remaining
 * free of any framework-specific annotations (Clean Architecture).
 */
public class PersonPhotoDTO {

    private Long id;
    private LocalDateTime uploadDate;
    private String bucket;
    private String hash;

    public PersonPhotoDTO() {
    }

    public PersonPhotoDTO(Long id, LocalDateTime uploadDate, String bucket, String hash) {
        this.id = id;
        this.uploadDate = uploadDate;
        this.bucket = bucket;
        this.hash = hash;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
