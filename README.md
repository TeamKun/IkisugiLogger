# IkisugiLogger
The "Ikisugi" Log library

このようなログを生成するためのライブラリ
![Sample](https://cdn.discordapp.com/attachments/358878159615164416/909114953951223878/2021-11-14_01h18_04.png)

# 利用方法

Gradle
```gradle
repositories {
    maven {
        name = 'felnull maven'
        url = 'https://maven.felnull.dev/'
    }
}

dependencies {
    implementation 'net.kunmc.lab:ikisugi-logger:1.1'
}
```

Maven
```xml
    <repositories>
        <repository>
            <id>felnull</id>
            <name>felnull maven</name>
            <url>https://maven.felnull.dev/</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>net.kunmc.lab</groupId>
            <artifactId>ikisugi-logger</artifactId>
            <version>1.1</version>
        </dependency>
    </dependencies>
```

# 利用例
```java
IkisugiLogger logger = new IkisugiLogger("ikisugi test");
logger.setColorType(IkisugiLogger.ColorType.RAINBOW);
System.out.println(logger.create());
```
