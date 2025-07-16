package org.koreait.board.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;
import org.koreait.global.entities.BaseEntity;

@Data
@Entity
@IdClass(BoardViewId2.class)
public class BoardView2 extends BaseEntity {
    @Id
    private Long seq;
    @Id
    private int uid;
}