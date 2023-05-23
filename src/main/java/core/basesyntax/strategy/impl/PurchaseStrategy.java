package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.BaseOperationStrategy;

public class PurchaseStrategy extends BaseOperationStrategy {
    @Override
    public int perform(int current, int value) {
        return validator.check(current - value);
    }
}
