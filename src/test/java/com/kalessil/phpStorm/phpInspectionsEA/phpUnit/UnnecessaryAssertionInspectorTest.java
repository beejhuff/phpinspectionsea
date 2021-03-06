package com.kalessil.phpStorm.phpInspectionsEA.phpUnit;

import com.jetbrains.php.config.PhpLanguageLevel;
import com.jetbrains.php.config.PhpProjectConfigurationFacade;
import com.kalessil.phpStorm.phpInspectionsEA.PhpCodeInsightFixtureTestCase;
import com.kalessil.phpStorm.phpInspectionsEA.inspectors.phpUnit.UnnecessaryAssertionInspector;

final public class UnnecessaryAssertionInspectorTest extends PhpCodeInsightFixtureTestCase {
    public void testIfFindsCoversAnnotationPatterns() {
        PhpProjectConfigurationFacade.getInstance(myFixture.getProject()).setLanguageLevel(PhpLanguageLevel.PHP710);
        myFixture.enableInspections(new UnnecessaryAssertionInspector());
        myFixture.configureByFile("fixtures/phpUnit/unnecessary-assertion.php");
        myFixture.testHighlighting(true, false, true);
    }
}
