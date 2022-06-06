package org.myshowtime.b2b.database;

import org.myshowtime.b2b.models.CityTheatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityTheatreRepository extends JpaRepository<CityTheatre, Long> {
}
