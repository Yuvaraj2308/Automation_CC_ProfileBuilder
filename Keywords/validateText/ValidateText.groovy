package validateText

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ValidateText {
	@Keyword
	def void calculateAndPrintPercentageMatch(String category, String str1, String str2) {
		List<String> words1 = Arrays.asList(str1.split("\\s+"))
		List<String> words2 = Arrays.asList(str2.split("\\s+"))

		int totalWords = words1.size()
		int matchCount = 0

		words1.each { word ->
			if (words2.contains(word)) {
				matchCount++
			}
		}

		double percentageMatch = (double) matchCount / totalWords * 100

		println(category + ":")
		println("Total Words: " + totalWords)
		println("Matching Words: " + matchCount)
		println("Percentage Match: " + percentageMatch + "%")
		println()
	}
}
