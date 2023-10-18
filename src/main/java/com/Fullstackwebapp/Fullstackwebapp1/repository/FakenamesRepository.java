package com.Fullstackwebapp.Fullstackwebapp1.repository;

import com.Fullstackwebapp.Fullstackwebapp1.model.Fakenames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FakenamesRepository extends JpaRepository<Fakenames, Integer> {

    Iterable<Fakenames> findByBloodType(String bloodType);
    Iterable<Fakenames> findByColor(String color);
    Iterable<Fakenames> findByCVV2(int CVV2);

    @Query("SELECT u FROM Fakenames u WHERE u.ID < 11")
    Iterable<Fakenames> get10UsersQuery();

}
