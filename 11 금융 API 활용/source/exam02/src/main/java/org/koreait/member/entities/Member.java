package org.koreait.member.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.koreait.board.entities.BoardData;
import org.koreait.global.entities.Address;
import org.koreait.global.entities.BaseEntity;
import org.koreait.member.constants.Authority;

import java.util.List;

@Data
@Entity
@Table(name="kit_member",
    indexes = {
        @Index(name="idx_member_created_at", columnList = "createdAt DESC"),
        @Index(name="uq_member_email_name", columnList = "email, name", unique = true)
    })

public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private String seq;

    @Column(unique = true, nullable = false, length = 80)
    private String email;
    @Column(name = "passwd", nullable = false, length = 65)
    private String password;
    //@Column(columnDefinition = "VARCHAR(45) NOT NULL")
    @Column(nullable = false, length = 45)

    private String name;

    @Lob
    private String interrogation;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Transient// 엔티티로 관리되는 필드 X, 엔티티 클래스 내부에서만 사용할 목적
    private String profileImage;

    @Embedded
    private Address address;

    @ToString.Exclude
    @OneToMany(mappedBy = "member")
    private List<BoardData> items;
}