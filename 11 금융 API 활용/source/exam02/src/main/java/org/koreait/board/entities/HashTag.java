package org.koreait.board.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity
public class HashTag {
    @Id
    private String tag;
    private String description;

    @ManyToMany(mappedBy = "tags")
    @ToString.Exclude
    private List<BoardData> items;
}
