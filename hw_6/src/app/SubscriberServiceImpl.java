package app;


import java.util.Objects;

public class SubscriberServiceImpl implements SubscriberService {


    @Override
    public void subscribersWithExcessiveCityCallDuration(int duration) {

        Subscriber[] subscribers = SubGeneration.generateSubArray();
        for (Subscriber s : subscribers) {
            if (s.getCityCallDuration() > duration) {
                System.out.println(s);
            }

        }

    }

    @Override
    public void subscribersWithInterCityCalls() {

        Subscriber[] subscribers = SubGeneration.generateSubArray();

        for (Subscriber s : subscribers) {
            if (s.getInterCityCallDuration() > 0) {
                System.out.println(s);
            }
        }
    }


    @Override
    public void subscribersByLastName(String lastName) {

        Subscriber[] subscribers = SubGeneration.generateSubArray();

        for (Subscriber s : subscribers) {
            if (Objects.equals(s.getLastName(), lastName)) {
                System.out.println(s);
            }
        }

    }

    @Override
    public int totalInternetTrafficByCity(String city) {
        int totalInternetTraffic = 0;

        Subscriber[] subscribers = SubGeneration.generateSubArray();


        for (Subscriber s : subscribers) {
            if (s.getCity().equals(city)) {
                totalInternetTraffic += s.getInternetTraffic();

            }
        }
        return totalInternetTraffic;
    }



    @Override
    public int numberOfSubscribersWithNegativeBalance() {
        int count = 0;

        Subscriber[] subscribers = SubGeneration.generateSubArray();


        for (Subscriber s : subscribers) {
            if (s.getBalance() < 0) {
                count++;
            }
        }

        return count;
    }

}





