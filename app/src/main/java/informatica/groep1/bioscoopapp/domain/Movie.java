//================================================================================
// This class is made by:
// - Thimo Koolen
//================================================================================

package informatica.groep1.bioscoopapp.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Movie implements Serializable {
	
	//================================================================================
	// Properties
	//================================================================================

	private int movieID;
	private String title;
	private ArrayList<Actor> actors;
    private ArrayList<Genre> genres;
	private String rating;
	private String releaseYear;
	private String id;
	private String backDropImage;
    private String length;
    private String longDescription;
    private String director;
    private boolean adult;

	
	//================================================================================
	// Constructors
	//================================================================================
	
	public Movie(int movieID, String title, String rating, String releaseYear) {
		this.movieID = movieID;
		this.title = title;
		this.rating = rating;
		this.releaseYear = releaseYear;
	}
	
	public Movie(String title) {
		this.title = title;
	}
	
	//================================================================================
	// Accessors
	//================================================================================
	
	public int getMovieID() {
		return movieID;
	}

	public String getTitle() {
		return title;
	}
	
	public ArrayList<Actor> getActors() {
		return actors;
	}
	
	public Actor getActor(String firstName, String lastName) {
		for (Actor a : actors) {
			if ((a.getFirstName().equalsIgnoreCase(firstName)) && (a.getLastName().equalsIgnoreCase(lastName))) {
				return a;
			}
		}
		return null;
	}
	
	public String getRating() {
		return rating;
	}
	
	public String getReleaseYear() {
		return releaseYear;
	}

	public String getId() {
		return id;
	}

	public String getBackDropImage() {
		return backDropImage;
	}

    public String getLength() {
        return length;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getDirector() {
        return director;
    }

    public boolean isAdult() {
        return adult;
    }

    //================================================================================
	// Mutators
	//================================================================================
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void addActor(Actor actor) {
		this.actors.add(actor);
	}

    public void addGenre(Genre genre) {
        this.genres.add(genre);
    }
	
	public void setRating(String rating) {
		this.rating = rating;
	}

    public void setLength(String length) {
        this.length = length;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	
	public void setBackDropImage(String backDropImage) {
		this.backDropImage = backDropImage;
	}
}
