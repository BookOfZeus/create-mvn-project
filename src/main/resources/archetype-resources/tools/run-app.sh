#!/usr/bin/env bash

./tools/build-jar.sh

#
# Run dev profile
VERSION=$(xmllint --xpath '/*[local-name()="project"]/*[local-name()="version"]/text()' pom.xml)

# Enable to turn on the GC logs
GC_LOG_ENABLE=0
GC_LOG=""
if [[ "$GC_LOG_ENABLE" == "1" ]]; then
    GC_LOG=" -Xloggc:gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintTenuringDistribution -XX:+PrintGCCause"
fi

JAR=$(ls -1 target/| grep "jar$")

java $GC_LOG -jar "target/$JAR"