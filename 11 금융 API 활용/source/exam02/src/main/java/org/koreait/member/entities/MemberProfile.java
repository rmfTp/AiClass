package org.koreait.member.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
public class MemberProfile {
    @Id
    @GeneratedValue
    private long seq;

    @OneToOne(mappedBy = "profile", fetch= FetchType.LAZY)
    @ToString.Exclude
    private Member member;

    private String profileInfo;

    private String profileImage;

}
