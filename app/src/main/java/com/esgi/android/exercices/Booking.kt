package com.esgi.android.exercices

import java.util.Date

data class Booking(
    val name : String,
    val streetAddress : String,
    val status: BookingStatus,
    val arrivalDate: Date,
    val exitDate: Date,
)

enum class BookingStatus {
    ON_PROCESS, UPCOMING, COMPLETED
}