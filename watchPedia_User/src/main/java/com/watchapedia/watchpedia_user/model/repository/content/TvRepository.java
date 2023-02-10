package com.watchapedia.watchpedia_user.model.repository.content;


import com.watchapedia.watchpedia_user.model.entity.content.Tv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TvRepository extends JpaRepository<Tv, Long> {
    List<Tv> findByTvGenreContaining(String tvGenre);


}
