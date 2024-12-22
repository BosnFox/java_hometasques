package tasque18;

public class Pair<String, Integer> {
    private String first;
    private Integer second;
    public Pair(String first, Integer second) {
        this.first = first;
        this.second = second;
    }
    public String getFirst(){
        return first;
    }
    public Integer getSecond(){
        return second;
    }
    public void setFirst(String first){
        this.first = first;
    }
    public void setSecond(Integer second){
        this.second = second;
    }
}
