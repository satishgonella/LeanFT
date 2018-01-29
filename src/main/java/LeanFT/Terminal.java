package LeanFT;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.te.Field;
import com.hp.lft.sdk.te.FieldDescription;
import com.hp.lft.sdk.te.Screen;
import com.hp.lft.sdk.te.ScreenDescription;
import com.hp.lft.sdk.te.Window;
import com.hp.lft.sdk.te.WindowDescription;

import unittesting.UnitTestClassBase;

public class Terminal extends UnitTestClassBase{
	
	public void demo() throws GeneralLeanFtException
	
	{
		
		Field f = Desktop.describe(Window.class, new WindowDescription.Builder()
				.shortName("A").build())
			.describe(Screen.class, new ScreenDescription.Builder()
				.label("..............................").build())
			.describe(Field.class, new FieldDescription.Builder()
				.attachedText("field1841")
				.isProtected(false).build());
		
		f.setText("L TOS@E");
		
	}

}
