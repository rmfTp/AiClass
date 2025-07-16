package org.koreait.board.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.koreait.global.entities.BaseEntity;

@Data
@Entity
public class BoardView extends BaseEntity {
    @Id
    @Embedded
    private BoardViewId viewId;

}