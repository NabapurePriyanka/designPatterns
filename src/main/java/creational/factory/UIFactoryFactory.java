package creational.factory;

import creational.factory.UIFactory.AndroidFactory;
import creational.factory.UIFactory.IosFactory;
import creational.factory.UIFactory.UIFactory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms platforms){
        return switch (platforms){
            case ANDROID -> new AndroidFactory();
            case IOS -> new IosFactory();

        };
    }
}
