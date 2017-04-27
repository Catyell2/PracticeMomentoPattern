import java.util.ArrayList;
public class Caretaker{
  private ArrayList<Message> events;
  protected Caretaker(){
    this.events = new ArrayList<>();
  }
  protected void add(Momento momento){
    events.add(momento);
  }
  protected Momento get(int position){
    return events.get(position);
  }


}
