#!/bin/sh
if [ -x ./gradlew ]; then CMD=./gradlew; else CMD=gradle; fi
$CMD test --tests "problems.thema4.*"
