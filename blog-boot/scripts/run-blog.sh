#!/bin/bash

echo "=> Waiting for mysql to start"
sleep 30
./createDatabase.sh

java -jar  -Dspring.profiles.active=docker /blog-*.jar
