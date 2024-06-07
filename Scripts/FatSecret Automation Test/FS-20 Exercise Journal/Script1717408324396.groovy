import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.fatsecret.android')

Mobile.tap(findTestObject('FatSecret/FS-20/android.widget.TextView - 1487 kal'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-20/android.widget.TextView - Latihan'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-20/android.widget.TextView - KUSTOM LATIHAN'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-20/android.widget.TextView - Tambahkan Kustom Latihan'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-20/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/FatSecret/FS-20/android.widget.EditText (1)'), 'Mendaki Gunung', 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-20/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/FatSecret/FS-20/android.widget.EditText (3)'), '2500', 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-20/android.widget.Button - SIMPAN'), 0)

Mobile.tap(findTestObject('Object Repository/FatSecret/FS-20/android.widget.LinearLayout'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/FatSecret/FS-20/android.widget.TextView - Mendaki Gunung'), 'Mendaki Gunung')

Mobile.verifyElementText(findTestObject('Object Repository/FatSecret/FS-20/android.widget.TextView - 2500'), '2500')

Mobile.verifyElementText(findTestObject('Object Repository/FatSecret/FS-20/android.widget.TextView - 1 hour'), '1 hour')

Mobile.closeApplication()
