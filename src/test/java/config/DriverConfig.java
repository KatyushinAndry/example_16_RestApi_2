package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@org.aeonbits.owner.Config.LoadPolicy(MERGE)
@org.aeonbits.owner.Config.Sources({"system:properties",
        "classpath:local.properties"})

public interface DriverConfig extends org.aeonbits.owner.Config {

    @Key("api.base.url")
    String getApiUrl();

    @Key("web.base.url")
    String getWebUrl();

}
