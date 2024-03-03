package HomeWork2;

interface MarketBehaviour {
    void takeInQueue(Human human);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
