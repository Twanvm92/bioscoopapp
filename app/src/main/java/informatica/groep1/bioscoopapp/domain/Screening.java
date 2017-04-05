package informatica.groep1.bioscoopapp.domain;

//================================================================================
// This class is made by:
// - Luka Brinkman
// - Thimo Koolen
//================================================================================

import java.io.Serializable;

public class Screening extends ShowTitleRow {

	//================================================================================
	// Properties
	//================================================================================

	private String startTime;
	private String endTime;
	private int film3D;
	private String playDate;
	private int screeningID;
	private String title;
	private int MovieID;
	private boolean is3D;
	private Movie movie;
	
	//================================================================================
	// Constructors
	//================================================================================

	public Screening(int screeningID, int movieID, String title, String startTime, String endTime, String playDate, int film3D) {
		super(screeningID, title);
		this.startTime = startTime;
		this.film3D = film3D;
		this.endTime = endTime;
		this.playDate = playDate;
		this.MovieID = movieID;
	}
	
	public Screening(int screeningID, String startTime, String endTime, String playDate, Movie movie, boolean film3D) {
		this.screeningID = screeningID;
		this.startTime = startTime;
		this.endTime = endTime;
		this.playDate = playDate;
		this.movie = movie;
		this.is3D = film3D;
	}


	//================================================================================
	// Accessors
	//================================================================================
	
	public String getEndTime() {
		return endTime;
	}
	
	public boolean getIs3D() {
		return is3D;
	}

	@Override
	public String getTitle() {
		return super.getTitle();
	}

	public int getFilm3D() {

		return film3D;
	}

	public int getScreeningID() {
		return super.getScreeningID();
	}

	public String getPlayDate() {
		return playDate;
	}

	public int getMovieID() {
		return MovieID;
	}

	//================================================================================
	// Mutators
	//================================================================================


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}


	public void setFilm3D(int film3D) {
		this.film3D = film3D;
	}


	public void setScreeningID(int screeningID) {
		this.screeningID = screeningID;
	}

	public String getStartTime() {

		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	

	public void setPlayDate(String playDate) {
		this.playDate = playDate;
	}

	public void setMovieID(int movieID) {
		MovieID = movieID;
	}
}
