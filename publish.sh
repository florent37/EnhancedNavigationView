#!/usr/bin/env bash
./gradlew clean assembleDebug install

./gradlew :enhanced-navigationview:install
./gradlew :enhanced-navigationview:bintrayUpload