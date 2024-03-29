package lesson_012.service;

import lesson_012.entity.Bill;
import lesson_012.entity.Client;
import lesson_012.entity.Hotel;
import lesson_012.entity.Room;

public class BookingService {
    private static void validateFreeRooms(Hotel hotel, boolean isFreeRooms) {
        if (!isFreeRooms) {
            System.out.println("Свободных номеров в отеле '" + hotel.getName() + "' нет");
        }
    }

    private static void bookRoom(Hotel hotel, Client client, int numberOfPerson, Room[] rooms) {
        String clientName = client.getName();
        boolean success = false;
        for (Room room : rooms) {
            if (room.getNumberOfPerson() == numberOfPerson) {
                success = true;
                System.out.println("Нашелся номер для пользователя " + clientName);
                if (client.getBill().getAmount() >= room.getCost()) {
                    Bill clientBill = client.getBill();
                    clientBill.setAmount((clientBill.getAmount()) - room.getCost());
                    room.setFree(false);
                    System.out.println("Номер в отеле '" + hotel.getName() + "' был успешно забронирован клиентом "
                            + clientName);
                } else {
                    System.out.println("На счету клиента " + clientName + " недостаточно денег для бронироавания номера");
                }
            }
        }
        if (!success) {
            System.out.println("Не нашлось подходящего номера для клиента " + clientName);
        }
    }

    public void book(Hotel hotel, Client client, int numberOfPerson) {
        Room[] rooms = hotel.getRooms();
        boolean isFreeRooms = false;
        for (Room room : rooms) {
            if (room.isFree()) {
                isFreeRooms = true;
                break;
            }
        }
        validateFreeRooms(hotel, isFreeRooms);
        bookRoom(hotel, client, numberOfPerson, rooms);
    }
}