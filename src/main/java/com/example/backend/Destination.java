package com.example.backend;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long did;

    private String name;

    private String location;

    private String description;

    @OneToMany(mappedBy = "destination", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Packages> packages;
}
