#!/usr/bin/env bash

mvn clean -DtrimStackTrace=false verify -Dtest=$1
