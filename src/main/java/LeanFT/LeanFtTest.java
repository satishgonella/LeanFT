package LeanFT;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hp.lft.sdk.*;
import com.hp.lft.sdk.stdwin.Button;
import com.hp.lft.sdk.stdwin.ButtonDescription;
import com.hp.lft.sdk.stdwin.Dialog;
import com.hp.lft.sdk.stdwin.DialogDescription;
import com.hp.lft.sdk.stdwin.EditField;
import com.hp.lft.sdk.stdwin.EditFieldDescription;
import com.hp.lft.sdk.stdwin.Window;
import com.hp.lft.sdk.stdwin.WindowDescription;
import com.hp.lft.sdk.te.Field;
import com.hp.lft.sdk.te.FieldDescription;
import com.hp.lft.sdk.te.Screen;
import com.hp.lft.sdk.te.ScreenDescription;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;
import com.hp.lft.verifications.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException, IOException, InterruptedException {
    	
    	new ProcessBuilder("C:\\Program Files (x86)\\IBM\\Personal Communications\\pcsws.exe").start();
    	
    	Desktop.describe(Dialog.class, new DialogDescription.Builder()
    			.ownedWindow(true)
    			.childWindow(false)
    			.text("Customize Communication")
    			.nativeClass("#32770").build())
    		.describe(Button.class, new ButtonDescription.Builder()
    			.text("&Link Parameters...")
    			.nativeClass("Button").build()).click();
    	
    	Thread.sleep(3000);
    	
    	Desktop.describe(Dialog.class, new DialogDescription.Builder()
    			.ownedWindow(true)
    			.childWindow(false)
    			.text("Telnet3270")
    			.nativeClass("#32770").build())
    		.describe(EditField.class, new EditFieldDescription.Builder()
    			.attachedText("Primar&y")
    			.nativeClass("Edit").build()).sendKeys("zos.kctr.marist.edu");
    	
    	Thread.sleep(3000);
    	
    	Desktop.describe(Dialog.class, new DialogDescription.Builder()
    			.ownedWindow(true)
    			.childWindow(false)
    			.text("Telnet3270")
    			.nativeClass("#32770").build())
    		.describe(EditField.class, new EditFieldDescription.Builder()
    			.attachedText("&Port \n" + 
    					"Number")
    			.nativeClass("Edit").build()).setText("1023");
    	
    	Desktop.describe(Dialog.class, new DialogDescription.Builder()
    			.ownedWindow(true)
    			.childWindow(false)
    			.text("Telnet3270")
    			.nativeClass("#32770").build())
    		.describe(EditField.class, new EditFieldDescription.Builder()
    			.text("OK")
    			.nativeClass("Button").build()).click();
    	
    	Desktop.describe(Dialog.class, new DialogDescription.Builder()
    			.ownedWindow(true)
    			.childWindow(false)
    			.text("Customize Communication")
    			.nativeClass("#32770").build())
    		.describe(Button.class, new ButtonDescription.Builder()
    			.text("OK")
    			.nativeClass("Button").build()).click();
    	
    	Thread.sleep(3000);
    	
    	Terminal temp = new Terminal();
    	temp.demo();
    }

}