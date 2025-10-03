package com.example.ticketservice.model;

import javax.persistence.*;

@Entity
@Table(name="bookings",
uniqueConstraints = {@UniqueConstraint(columnNames = {"train_id", "seat_number"})})
public class Booking {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long userId;

  @Column(name="train_id")
  private Long trainId;

  @Column(name="seat_number")
  private int seatNumber;

  private String status;

  public Booking() {}

}
