package DesignStyles;

import Enums.DesignType;

public class DesignStyleFactory {
    public DesignStyle getDesignStyle(DesignType designType) {
        switch (designType) {
            case SIMPLISTIC:
                return new SimplisticDesignStyle();
            case HIGH_DETAILED:
                return new HighDetailedDesignStyle();
            case FUTURISTIC:
                return new FuturisticDesignStyle();
            default:
                return null;
        }
    }
}
