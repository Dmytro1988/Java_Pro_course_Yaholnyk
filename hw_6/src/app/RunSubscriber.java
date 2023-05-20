package app;



public class RunSubscriber {
    public static void main(String[] args) {

        SubscriberService subscriberService = new SubscriberServiceImpl();
        subscriberService.subscribersWithExcessiveCityCallDuration(100);
        System.out.println("-----------------------------------");
        subscriberService.subscribersWithInterCityCalls();
        System.out.println("-----------------------------------");
        subscriberService.subscribersByLastName("Гапіч");
        System.out.println("------------------------");
        int totalInternetTraffic = subscriberService.totalInternetTrafficByCity("Дніпро");
        System.out.println("Загальне споживання інтернет-трафіку по місту Дніпро: " + totalInternetTraffic +  " GB");
        System.out.println("------------------------");
        int negativeBalanceCount = subscriberService.numberOfSubscribersWithNegativeBalance();
        System.out.println("Число користувачів з від'ємним балансом:  " + negativeBalanceCount );
    }
}










