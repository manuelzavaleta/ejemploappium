# Twitter automation

## Requirements:

* Java 8 JDK
* Maven 3
* Android Studio with AVD Manager
* Appium

## Twitter APK:

https://www.google.com/url?q=https%3A%2F%2Fwww.apkmirror.com%2Fapk%2Ftwitter-inc%2Ftwitter%2Ftwitter-7-21-0-release%2Ftwitter-7-21-0-3-android-apk-download%2F&sa=D&sntz=1&usg=AFQjCNFYLesXEDEz8IPa4eub1rcHRg8B0g

## Appium command in parallel:

{nodejs} appium {-U emulator-5556} {-p 4723} {-bp 4724}

## Maven goal:

mvn test -Dtest.type={single | parallel}

## Results report

/target/results.html

## Useful commands:

./adb devices -l
./uiautomatorviewer

## Reference:

[Appium] (http://appium.io/)
[Jenkins] (https://jenkins.io/)
[Install Jenkins on Linux] (https://wiki.jenkins.io/display/JENKINS/Installing+Jenkins+on+Ubuntu)
[Sonarqube] (https://www.sonarqube.org/)