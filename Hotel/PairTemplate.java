package java_project_2;



public class PairTemplate <T ,U>
{
    private T value;
    private U key;
    Object[] objArray = new Object[2];
    
    public PairTemplate() {}
    public PairTemplate(T value, U key) 
    {
		this.value=value;
		this.key=key;
	}
    public void put(T value, U key)
    {    	
    	objArray[0]= value;
    	objArray[1]= key;
    }
    public Object[] get()
    {    	
    	return objArray;
    }
    
    public String toString()
    {
    	return "[ value = " + value + ":: key = " + key + "]";
    }
}
