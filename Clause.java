public class Clause{
    private String sentence;
    private boolean parsed;

    public Clause(String str){
        sentence = new String(str);
        parsed = false;
    }

    public String getString(){
        return sentence;
    }

    public boolean getParsed(){
        return parsed;
    }

    public void setParsed(boolean parsed){
        this.parsed = parsed;
    }
}