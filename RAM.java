class Data{
    private String name;
    public void get(String s)
    {
        name=s;
    }
    public void set()
    {
        System.out.println(name);
    }
}
public class RAM
{
	public static void main(String[] args) {
		Data d=new Data();
		d.get("ram");
		d.set();
	}
}