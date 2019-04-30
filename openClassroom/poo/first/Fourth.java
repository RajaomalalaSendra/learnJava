package openClassroom.poo.first;

public class Fourth{
    protected Second obj = new Second();
    protected Fifth[] objFifth = new Fifth[10];

    public Second getSecond(){
    	return this.obj;
    }
    public Fifth[] getFifth(){
    	return this.objFifth;
    }
}