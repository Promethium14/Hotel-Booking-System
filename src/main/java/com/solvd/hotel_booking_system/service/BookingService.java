package com.solvd.hotel_booking_system.service;

import com.solvd.hotel_booking_system.dao.daoClass.BookingsDAO;
import com.solvd.hotel_booking_system.dao.daoClass.GuestsDAO;
import com.solvd.hotel_booking_system.dao.daoClass.PaymentsDAO;
import com.solvd.hotel_booking_system.dao.daoClass.RoomsDAO;
import com.solvd.hotel_booking_system.model.BookingsModel;

import java.util.List;

public class BookingService {

    private BookingsDAO bookingsDAO = new BookingsDAO();
    private RoomsDAO roomsDAO = new RoomsDAO();
    private GuestsDAO guestsDAO = new GuestsDAO();
    private PaymentsDAO paymentsDAO = new PaymentsDAO();

    public List<BookingsModel> getAllBookings() {
        return bookingsDAO.getBookingsList();
    }

    public BookingsModel getBookingById(Long id) {
        return bookingsDAO.getBookingsById(id);
    }



}
