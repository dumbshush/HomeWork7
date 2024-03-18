/*
 * Здесь Engineer вынужден реализовывать метод eat(), хотя он ему не нужен. 
 * ISP нарушается, так как интерфейс Worker должен быть разделен на 
 * более мелкие интерфейсы, чтобы избежать "жирных" интерфейсов.
 */

package Seminar6.four;

// interface Worker {
//     void work();
// }

interface Working{
    void work();
}

interface Eating{
    void eat();
}

class Worker implements Working, Eating{
    public void work() {
        // Реализация работы инженера
    }
        
    public void eat() {
        // Реализация приема пищи
    }
}
    
class Engineer implements Working{
    @Override
    public void work() {
        // TODO Auto-generated method stub
        
    }
}