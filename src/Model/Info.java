package Model;

public class Info {

    private String name;
    private boolean doneornot;


    public Info (String name, boolean doneornot) { // 초기화
        this.name = name;
        this.doneornot = doneornot;


    }

    //getter들
    public String getName(){


        return name;
    }


    public boolean isDoneornot(){

        return doneornot;
    }



    //setter들

    public void setName(String name){
        this.name = name;

    }


    public void setDoneornot(boolean doneornot){
        this.doneornot = doneornot;

    }






}
