public class Originator{
  private Stirng state;
  private Caretaker caretaker = new Caretaker();
  public String setState(String state){
    this.state = state;
  }
  public String getState(){
    return state;
  }
  public void save(){
    Momento momento = new Momento(state);
    caretaker.add(momento);
    }
  public Momento getStateFromCaretaker(int position){
    return caretaker.get(position);
  }
  }
}
