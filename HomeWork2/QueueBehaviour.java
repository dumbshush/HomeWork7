package HomeWork2;

import java.util.List;

interface QueueBehaviour {
    void acceptToMarket(Human human);
    void releaseFromMarket(List<Human>humans);
    void update(); // методы асепт, релиз вызываются
}
