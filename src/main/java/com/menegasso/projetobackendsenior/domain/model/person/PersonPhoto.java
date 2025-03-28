package com.menegasso.projetobackendsenior.domain.model.person;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Represents a photo associated with a person.
 * This class is part of the domain model and should remain free
 * of any framework-specific annotations. (Clean Architecture).
 */
public class PersonPhoto {

    private Long id;
    private Person person;
    private LocalDateTime uploadDate;
    private String bucket;
    private String hash;

    public PersonPhoto() {
    }

    public PersonPhoto(Long id, Person person, LocalDateTime uploadDate, String bucket, String hash) {
        this.id = id;
        this.person = person;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonPhoto that = (PersonPhoto) o;
        return Objects.equals(id, that.id) && Objects.equals(person, that.person) && Objects.equals(uploadDate, that.uploadDate) && Objects.equals(bucket, that.bucket) && Objects.equals(hash, that.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, person, uploadDate, bucket, hash);
    }

    @Override
    public String toString() {
        return "PersonPhoto{" +
                "id=" + id +
                ", person=" + person +
                ", uploadDate=" + uploadDate +
                ", bucket='" + bucket + '\'' +
                ", hash='" + hash + '\'' +
                '}';
    }
}
