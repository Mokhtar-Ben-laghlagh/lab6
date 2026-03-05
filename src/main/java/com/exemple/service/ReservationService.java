package com.exemple.service;

import com.exemple.model.Reservation;
import java.util.Optional;

public interface ReservationService {
    Reservation save(Reservation reservation);
    Optional<Reservation> findById(Long id);
    void update(Reservation reservation);
    void delete(Reservation reservation);
}