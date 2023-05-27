package cc.mewcraft.adventurelevel.level.category;

import cc.mewcraft.adventurelevel.AdventureLevel;
import com.ezylang.evalex.Expression;
import com.google.inject.Inject;

public class FishingLevelBean extends AbstractLevelBean {
    @Inject
    public FishingLevelBean(
        final AdventureLevel plugin,
        final int maxLevel,
        final Expression levelToExpFormula,
        final Expression expToLevelFormula,
        final Expression nextLevelFormula
    ) {
        super(plugin, maxLevel, levelToExpFormula, expToLevelFormula, nextLevelFormula);
    }
}
