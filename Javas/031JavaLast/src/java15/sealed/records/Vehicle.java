package java15.sealed.records;

public sealed interface Vehicle permits Car, Truck {

    String getRegistrationNumber();

}
