package org.koreait.board.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.koreait.global.entities.BaseEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class BoardViewId2 extends BaseEntity {
    private Long seq;
    private int uid;
}