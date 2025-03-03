package com.movieapi.moviereview;

import jakarta.persistence.*;
import lombok.*;

@Entity // Mark as db table
@Table(name = "reviews")
@Getter
@Setter // Lombok autogenerates these getters and setters
@NoArgsConstructor // Lombok autogens a no argument constructor
@AllArgsConstructor // Lombok autogens a constructor w/ all the fields as params
public class MovieReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This auto increments id
    private Long id;

    @Column(nullable = false)
    private String movieTitle;

    @Column(nullable = false)
    private String reviewText;

    @Column(nullable = false)
    private int rating;

}
