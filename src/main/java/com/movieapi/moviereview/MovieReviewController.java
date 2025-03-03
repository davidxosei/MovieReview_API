package com.movieapi.moviereview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reviews") // This is the base URL for this controller
public class MovieReviewController {

    @Autowired
    private MovieReviewRepository movieReviewRepository;

    @GetMapping()
    public List<MovieReview> getAllReviews() {
        return movieReviewRepository.findAll();
    }

    // This gets a single review by ID
    @GetMapping("/{id}")
    public MovieReview getReviewById(@PathVariable Long id) {
        return movieReviewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Review not found with id " + id));
    }

    @PostMapping
    public MovieReview createReview(@RequestBody MovieReview review) {
        return movieReviewRepository.save(review);
    }

    @PutMapping("/{id}")
    public MovieReview updateReview(@PathVariable Long id, @RequestBody MovieReview updatedReview) {
        return movieReviewRepository.findById(id).map(review -> {
            review.setMovieTitle(updatedReview.getMovieTitle());
            review.setReviewText(updatedReview.getReviewText());
            review.setRating(updatedReview.getRating());
            return movieReviewRepository.save(review);
        }).orElseThrow(() -> new RuntimeException("Review not found with id" + id));
    }

    @DeleteMapping("/{id}")
    public String deleteReview(@PathVariable Long id) {
        movieReviewRepository.deleteById(id);
        return "Review deleted successfully!";
    }
}
