//================================================================================
// This class is made by:
// - Thimo Koolen
//================================================================================

package informatica.groep1.bioscoopapp.util;

import android.content.DialogInterface;

public class ButtonDefine {
	
	//================================================================================
	// Properties
	//================================================================================
	
	private String text;
	private DialogInterface.OnClickListener event;
	
	//================================================================================
	// Constructors
	//================================================================================
	
	public ButtonDefine(String text, DialogInterface.OnClickListener event) {
		this.text = text;
		this.event = event;
	}
	
	//================================================================================
	// Mutators
	//================================================================================
	
	public void setText(String text) {
		this.text = text;
	}
	
	public void setEvent(DialogInterface.OnClickListener event) {
		this.event = event;
	}
	
	//================================================================================
	// Accessors
	//================================================================================
	
	public String getText() {
		return text;
	}
	
	public DialogInterface.OnClickListener getEvent() {
		return event;
	}
}
