package java_start.part_001.lesson_012.booking;

import java_start.part_001.lesson_012.booking.entity.Bill;
import java_start.part_001.lesson_012.booking.entity.Client;
import java_start.part_001.lesson_012.booking.entity.Hotel;
import java_start.part_001.lesson_012.booking.entity.Room;
import java_start.part_001.lesson_012.booking.service.BookingService;

public class Main {
    public static void main(String[] args) {
        Bill loriBill = new Bill(10000);
        Client loriClient = new Client("Lori", "Cat", "+123456789",
                "lori.cat@yandex.ru", loriBill);
        Bill baxterBill = new Bill(12000);
        Client baxterClient = new Client("Baxter", "Dog", "+987654321",
                "baxter.dog@gmail.com", baxterBill);

        Room[] californiaHotelRooms = new Room[]{new Room(1, 1500, true),
                new Room(3, 3500, true), new Room(2, 2500, true)};
        Hotel californiaHotel = new Hotel("California", californiaHotelRooms);

        Room[] sanFranciscoHotelRooms = new Room[]{new Room(2, 2800, true),
                new Room(3, 14000, true), new Room(1, 2000, true)};
        Hotel sanFranciscoHotel = new Hotel("San Francisco", sanFranciscoHotelRooms);

        BookingService bookingService = new BookingService();
        bookingService.book(californiaHotel, loriClient, 2);
        System.out.println("\n");
        bookingService.book(californiaHotel, loriClient, 4);
        System.out.println("\n");
        bookingService.book(sanFranciscoHotel, baxterClient, 3);
    }
}