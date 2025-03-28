package com.menegasso.projetobackendsenior.infrastructure.persistence.entity.person;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * Represents a PersonPhoto entity mapped to the "person_photo" table.
 * Uses JPA and Lombok annotations.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person_photo")
public class PersonPhotoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private PersonEntity person;

    @Column(name = "upload_date", nullable = false)
    private LocalDateTime uploadDate;

    @Column(name = "bucket", nullable = false)
    private String bucket;

    @Column(name = "hash", nullable = false)
    private String hash;
}
