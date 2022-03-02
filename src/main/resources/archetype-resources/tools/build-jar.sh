#!/usr/bin/env bash

export MAVEN_OPTS="-Xmx512m -Xms128m -Xss2m"
mvn clean package -Dmaven.test.skip=true