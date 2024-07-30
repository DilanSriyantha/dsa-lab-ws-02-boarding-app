package Code;

public class Cage {
    private int cageNo;
    private String type;
    public boolean reserved = false;
    
    public Cage(int cageNo, String type){
        this.cageNo = cageNo;
        this.type = type;
    }
    
    public int getCageNo(){
        return cageNo;
    }
    
    public void setCageNo(int cageNo){
        this.cageNo = cageNo;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String toString(){
        return "Cage No. " + cageNo + " - Type : " + type + " - Reserved : " + reserved;
    }
}
