package com.learn.spring.certificate.gen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "IMAGE_DATA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageBase64 {
    @Id
    @Column(name = "UUID_IMAGE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int UuidImageBase;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UUID_USER_MEMBER", nullable = false)
    private UserMember userMember;

    @Column(name = "UUID_USER")
    private String ImageName;

    @Column(name = "ENCODE_IMAGE")
    private String encodeImage;
}
