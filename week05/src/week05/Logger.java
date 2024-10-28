package week05;

public interface Logger {
	
	public void info(String info); //interfaces only have abstract methods in it
	public void warning(String warning);
	public void error(String error);
	public void fatal(String fatal);
	public void close();
	

}
