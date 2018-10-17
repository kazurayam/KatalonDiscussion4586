import com.kms.katalon.core.annotation.BeforeTestCase

import internal.GlobalVariable as GlobalVariable

class TL {
	
	@BeforeTestCase
	void beforeTestCase() {
		if (System.getenv('targeturl') != null) {
			GlobalVariable.URL = System.getenv('targeturl')
		}
	}
}