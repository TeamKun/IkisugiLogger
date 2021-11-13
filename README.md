# IkisugiLogger
The "Ikisugi" Log library

利用方法

```gradle
repositories {
    maven {
        name = 'felnull maven'
        url = 'https://maven.felnull.dev/'
    }
}

dependencies {
    implementation 'net.kunmc.lab:ikisugi-logger:1.0'
}
```

```java
IkisugiLogger logger = new IkisugiLogger("ikisugi test");
logger.setColorType(IkisugiLogger.ColorType.RAINBOW);
System.out.println(logger.create());
```
