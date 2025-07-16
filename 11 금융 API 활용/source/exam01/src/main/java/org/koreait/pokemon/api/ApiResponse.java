package org.koreait.pokemon.api;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {
    private int count;
    private String next;
    private String previous;
    @JsonAlias("results")
    private List<UrlItem> result;
}