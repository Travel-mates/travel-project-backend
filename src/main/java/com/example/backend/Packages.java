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
public class Packages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    private String packageName;

    private String packageDetails;

    private Double price;

    private String contactNo;

    private Integer quantity;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "did")
    private Destination destination;

    @OneToMany(mappedBy = "packages", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Booking> bookings;
}
