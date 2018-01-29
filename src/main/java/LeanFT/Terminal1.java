package LeanFT;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.te.Field;
import com.hp.lft.sdk.te.FieldDescription;
import com.hp.lft.sdk.te.Screen;
import com.hp.lft.sdk.te.ScreenDescription;
import com.hp.lft.sdk.te.Window;
import com.hp.lft.sdk.te.WindowDescription;

public class Terminal1 {
	
public void demo() throws GeneralLeanFtException
	
	{
		
		Field f1 = Desktop.describe(Window.class, new WindowDescription.Builder()
				.shortName("A").build())
			.describe(Screen.class, new ScreenDescription.Builder()
				.label("screen5196").build())
			.describe(Field.class, new FieldDescription.Builder()
				.attachedText("field27")
				.isProtected(false).build());
		
		f1.setText("User");
		
		Screen screen = Desktop.describe(Window.class, new WindowDescription.Builder()
				.shortName("A").build())
			.describe(Screen.class, new ScreenDescription.Builder()
				.label("screen5196").build());
		
		screen.sendTEKeys(com.hp.lft.sdk.te.Keys.ENTER);
		
	}

}
