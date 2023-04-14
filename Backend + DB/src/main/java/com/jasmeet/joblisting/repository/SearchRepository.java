package com.jasmeet.joblisting.repository;

import com.jasmeet.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
