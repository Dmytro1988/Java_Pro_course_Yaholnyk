package app;



public interface SubscriberService {
    void subscribersWithExcessiveCityCallDuration(int duration);
    void subscribersWithInterCityCalls();
    void subscribersByLastName(String lastName);
    int totalInternetTrafficByCity(String city);
    int numberOfSubscribersWithNegativeBalance();
}







