# Twitter automation

## Requirements:

Java 8 JDK
Maven 3
Android Studio
Appium

## Twitter APK:

https://www.google.com/url?q=https%3A%2F%2Fwww.apkmirror.com%2Fapk%2Ftwitter-inc%2Ftwitter%2Ftwitter-7-21-0-release%2Ftwitter-7-21-0-3-android-apk-download%2F&sa=D&sntz=1&usg=AFQjCNFYLesXEDEz8IPa4eub1rcHRg8B0g

## Appium command in parallel:

{nodejs} appium {-U emulator-5556} {-p 4723} {-bp 4724}

## Maven goal:

mvn test -Dtest.type={single | parallel}

#Useful commands:

./adb devices -l
./uiautomatorviewer

# Reference:

http://appium.io/
https://wiki.jenkins.io/display/JENKINS/Installing+Jenkins+on+Ubuntu