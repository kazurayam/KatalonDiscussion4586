import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.comment(">>> GlobalVariable.URL is ${GlobalVariable.URL}")

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.URL)
WebUI.delay(3)
WebUI.closeBrowser()
