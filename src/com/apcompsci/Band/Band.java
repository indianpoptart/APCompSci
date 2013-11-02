package com.apcompsci.Band;

public class Band
{
    //1.Class Variables    
    private String nameOfBand;
    private String[] members;
    private static String genreOfBand;
    private int numberOfMembers;
    private int numberOfSongs;
    private int numberOfAlbums;
    private boolean isActive;
    
    
    
    //2. Constructors
    public Band(String name)
    {
        nameOfBand = name;
    }
    
    public Band(String name, String genre, int numMem, int numSongs, int numAlbs, boolean isActive)
    {
        
    }
    
    
    
    
    //3. Methods
    
    //setters
    public void setName(String newName)
    {
        nameOfBand = newName;
    }
    
    public static void setGenre(String s)
    {
        genreOfBand = s;
    }
    
    public void setNumberOfMembers(int num)
    {
        numberOfMembers = num;
    }
    
    //...

    //getters
    public String getName()
    {
        return nameOfBand;
    }
    public String getGenre(){
    	return genreOfBand;
    }

	public boolean contains(String nameOfBand2) {
		// TODO Auto-generated method stub
		return false;
	}
    
    //...
}